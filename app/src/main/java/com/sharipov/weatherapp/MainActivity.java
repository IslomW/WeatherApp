package com.sharipov.weatherapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.google.android.material.tabs.TabLayout;
import com.sharipov.weatherapp.Fragments.CityFragment;
import com.sharipov.weatherapp.Fragments.WeatherFragment;
import com.sharipov.weatherapp.base.BaseActivity;
import com.sharipov.weatherapp.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding> {


    @Override
    protected ActivityMainBinding viewBindingInflate(LayoutInflater inflater) {
        return ActivityMainBinding.inflate(inflater);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = new WeatherFragment();
                if (tab.getPosition() == 0){
                    fragment = new WeatherFragment();
                }else {
                    fragment = new CityFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}