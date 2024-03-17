package com.sharipov.weatherapp.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sharipov.weatherapp.base.BaseFragment;
import com.sharipov.weatherapp.databinding.FragmentCountryBinding;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CityFragment extends BaseFragment<FragmentCountryBinding> {

    @Override
    protected FragmentCountryBinding viewInflateBinding(LayoutInflater inflater, ViewGroup parent, boolean toAttach) {
        return FragmentCountryBinding.inflate(inflater, parent, toAttach);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }


}
