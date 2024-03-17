package com.sharipov.weatherapp.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.sharipov.weatherapp.adapters.DailyListAdapter;
import com.sharipov.weatherapp.adapters.WeatherPagerAdapter;
import com.sharipov.weatherapp.base.BaseFragment;
import com.sharipov.weatherapp.databinding.FragmentWeatherBinding;
import com.sharipov.weatherapp.model.ForecastMain;
import com.sharipov.weatherapp.model.Hour;
import com.sharipov.weatherapp.model.WeatherInfo;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherFragment extends BaseFragment<FragmentWeatherBinding> {

    private ArrayList<Hour> hourArrayList;
    private DailyListAdapter dailyListAdapter;

    private WeatherInfo weatherInfo;
    private ArrayList<WeatherInfo> weatherInfoArrayList;
    private WeatherPagerAdapter weatherPagerAdapter;


    @Override
    protected FragmentWeatherBinding viewInflateBinding(LayoutInflater inflater, ViewGroup parent, boolean toAttach) {
        return FragmentWeatherBinding.inflate(inflater, parent, toAttach);
    }

    @Override
    public void onStart() {
        super.onStart();
        loadDailyInform();
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        weatherInfo = new WeatherInfo();

        hourArrayList = new ArrayList<>();
        dailyListAdapter = new DailyListAdapter(hourArrayList);


        weatherInfoArrayList = new ArrayList<>();
        weatherPagerAdapter = new WeatherPagerAdapter(getActivity(), weatherInfoArrayList);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.viewPagerBanner.setAdapter(weatherPagerAdapter);

        binding.recyclerDaily.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.recyclerDaily.setAdapter(dailyListAdapter);
    }

    private void loadDailyInform() {
        Call<ForecastMain> call = parent.mainApi.getForecastInf(parent.getApiKey(), "Gwangju");
        call.enqueue(new Callback<ForecastMain>() {
            @Override
            public void onResponse(Call<ForecastMain> call, Response<ForecastMain> response) {
                if (response.isSuccessful()) {
                    ForecastMain forecastMain = response.body();
                    hourArrayList.addAll(forecastMain.forecast.getForecastday().get(0).getHour());
                    dailyListAdapter.notifyDataSetChanged();
                    Log.d("WEATHER", hourArrayList.toString());
                    //
                    weatherInfo.setCityName(forecastMain.location.getName());
                    weatherInfo.setDate(String.valueOf(forecastMain.location.getLocaltime()));
                    weatherInfo.setTemp(String.valueOf(forecastMain.current.getTempC()));
                    weatherInfo.setConditionDay(forecastMain.current.getCondition().getText());

                    weatherInfoArrayList.add(weatherInfo);
                    weatherPagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<ForecastMain> call, Throwable t) {

            }
        });

    }
}
