package com.sharipov.weatherapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Forecastday implements Serializable
{

    @SerializedName("date")
    @Expose
    public String date;

    @SerializedName("hour")
    @Expose
    public List<Hour> hour;

    public Forecastday() {
    }

    public Forecastday(String date,  List<Hour> hour) {
        this.date = date;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Forecastday{" +
                "date='" + date + '\'' +
                ", hour=" + hour +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public List<Hour> getHour() {
        return hour;
    }

    public void setHour(List<Hour> hour) {
        this.hour = hour;
    }
}
