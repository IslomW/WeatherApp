package com.sharipov.weatherapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sharipov.weatherapp.base.BaseFragment;
import com.sharipov.weatherapp.databinding.ItemWeatherInfoBinding;
import com.sharipov.weatherapp.model.ForecastMain;
import com.sharipov.weatherapp.model.WeatherInfo;

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
            binding.textViewData.setText(weatherInfo.getDate());
            binding.day.setText(weatherInfo.getConditionDay());
        }
    }


}
