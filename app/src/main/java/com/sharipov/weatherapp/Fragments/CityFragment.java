package com.sharipov.weatherapp.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.sharipov.weatherapp.base.BaseFragment;
import com.sharipov.weatherapp.databinding.FragmentCountryBinding;
import com.sharipov.weatherapp.databinding.FragmentWeatherBinding;
import com.sharipov.weatherapp.model.Example;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CityFragment extends BaseFragment<FragmentCountryBinding> {
    Example weatherInform;
    ArrayList<Example> weather;
    @Override
    protected FragmentCountryBinding viewInflateBinding(LayoutInflater inflater, ViewGroup parent, boolean toAttach) {
        return FragmentCountryBinding.inflate(inflater, parent, toAttach);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        weather = new ArrayList<>();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<Example> call = parent.mainApi.getCurrentInf(parent.getApiKey(), "Gwangju");

                call.enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        if (response.isSuccessful()){
                            weatherInform = response.body();
                            weather.add(weatherInform);
                            binding.textViewCountry.setText(weather.get(0).location.getName());
                            binding.textViewCelsius.setText(String.valueOf(weather.get(0).current.getTempC()));
                            binding.textViewData.setText(String.valueOf(weather.get(0).location.getLocaltime()));
                            binding.day.setText(weather.get(0).current.condition.text);

                            Glide.with(binding.icWeather).load(weather.get(0).current.condition.icon).into(binding.icWeather);
                            Log.d("WEATHER", weatherInform.toString());
                        }
                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {
                        Log.e("ERROR", t.getLocalizedMessage());
                    }
                });
            }
        });




    }
}
