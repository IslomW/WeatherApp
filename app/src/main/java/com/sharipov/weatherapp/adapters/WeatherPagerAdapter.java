package com.sharipov.weatherapp.adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.sharipov.weatherapp.Fragments.WeatherInfoFragment;
import com.sharipov.weatherapp.model.WeatherInfo;

import java.util.ArrayList;

public class WeatherPagerAdapter  extends FragmentStateAdapter {
    ArrayList<WeatherInfo> weatherInfoArrayList;

    public WeatherPagerAdapter(@NonNull FragmentActivity fragmentActivity, ArrayList<WeatherInfo> weatherInfoArrayList) {
        super(fragmentActivity);
        this.weatherInfoArrayList = weatherInfoArrayList;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        WeatherInfo weatherInfo = weatherInfoArrayList.get(position);
        WeatherInfoFragment weatherInfoFragment = new WeatherInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("weatherInfo", weatherInfo);
        weatherInfoFragment.setArguments(bundle);


        return weatherInfoFragment;
    }

    @Override
    public int getItemCount() {
        return weatherInfoArrayList.size();
    }
}
