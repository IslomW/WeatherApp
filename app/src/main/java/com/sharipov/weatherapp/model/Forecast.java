package com.sharipov.weatherapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Forecast implements Serializable
{

    @SerializedName("forecastday")
    @Expose
    public List<Forecastday> forecastday;


    public Forecast() {
    }

    public Forecast(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "forecastday=" + forecastday +
                '}';
    }

    public List<Forecastday> getForecastday() {
        return forecastday;
    }

    public void setForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }
}
