package com.sharipov.weatherapp.Fragments;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.sharipov.weatherapp.base.BaseFragment;
import com.sharipov.weatherapp.databinding.FragmentCountryBinding;
import com.sharipov.weatherapp.databinding.FragmentWeatherBinding;

public class CityFragment extends BaseFragment<FragmentCountryBinding> {
    @Override
    protected FragmentCountryBinding viewInflateBinding(LayoutInflater inflater, ViewGroup parent, boolean toAttach) {
        return FragmentCountryBinding.inflate(inflater, parent, toAttach);
    }
}
