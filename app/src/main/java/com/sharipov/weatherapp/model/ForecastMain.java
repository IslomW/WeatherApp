package com.sharipov.weatherapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ForecastMain implements Serializable {
    @SerializedName("location")
    @Expose
    public Location location;
    @SerializedName("current")
    @Expose
    public Current current;
    @SerializedName("forecast")
    @Expose
    public Forecast forecast;


    public ForecastMain() {
    }

    public ForecastMain(Location location, Current current, Forecast forecast) {
        this.location = location;
        this.current = current;
        this.forecast = forecast;
    }

    @Override
    public String toString() {
        return "ForecastMain{" +
                "location=" + location +
                ", current=" + current +
                ", forecast=" + forecast +
                '}';
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }
}
