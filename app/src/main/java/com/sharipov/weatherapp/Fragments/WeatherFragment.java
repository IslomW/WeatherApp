package com.sharipov.weatherapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sharipov.weatherapp.base.BaseFragment;
import com.sharipov.weatherapp.databinding.FragmentWeatherBinding;

public class WeatherFragment extends BaseFragment<FragmentWeatherBinding> {
    @Override
    protected FragmentWeatherBinding viewInflateBinding(LayoutInflater inflater, ViewGroup parent, boolean toAttach) {
        return FragmentWeatherBinding.inflate(inflater, parent, toAttach);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
