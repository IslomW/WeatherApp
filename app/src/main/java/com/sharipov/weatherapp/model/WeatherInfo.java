package com.sharipov.weatherapp.model;

import java.io.Serializable;

public class WeatherInfo implements Serializable {
    private String cityName;
    private String date;
    private String temp;
    private String conditionDay;

    public WeatherInfo() {
    }

    public WeatherInfo(String cityName, String date, String temp, String conditionDay) {
        this.cityName = cityName;
        this.date = date;
        this.temp = temp;
        this.conditionDay = conditionDay;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getConditionDay() {
        return conditionDay;
    }

    public void setConditionDay(String conditionDay) {
        this.conditionDay = conditionDay;
    }
}
