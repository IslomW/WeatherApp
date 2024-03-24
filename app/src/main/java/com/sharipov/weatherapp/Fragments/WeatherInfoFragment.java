package com.sharipov.weatherapp.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sharipov.weatherapp.base.BaseFragment;
import com.sharipov.weatherapp.databinding.ItemWeatherInfoBinding;
import com.sharipov.weatherapp.model.ForecastMain;
import com.sharipov.weatherapp.model.WeatherInfo;

import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherInfoFragment extends BaseFragment<ItemWeatherInfoBinding> {


    @Override
    protected ItemWeatherInfoBinding viewInflateBinding(LayoutInflater inflater, ViewGroup parent, boolean toAttach) {
        return ItemWeatherInfoBinding.inflate(inflater, parent, toAttach);
    }




    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        WeatherInfo weatherInfo = (WeatherInfo) getArguments().getSerializable("weatherInfo");

        if (weatherInfo != null){
            binding.textViewCountry.setText(weatherInfo.getCityName());
            binding.textViewCelsius.setText(weatherInfo.getTemp());
            String time = weatherInfo.getDate().substring(weatherInfo.getDate().length() -5 ,weatherInfo.getDate().length());
            binding.icWeather.setImageResource(parent.setIcon(weatherInfo.getConditionDay().trim().toLowerCase(), time));

            binding.textViewData.setText(String.valueOf(Calendar.getInstance().getTime()));
            binding.day.setText(weatherInfo.getConditionDay());

        }
    }


}
