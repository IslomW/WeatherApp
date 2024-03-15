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
    @SerializedName("date_epoch")
    @Expose
    public int dateEpoch;
    @SerializedName("day")
    @Expose
    public Day day;

    @SerializedName("hour")
    @Expose
    public List<Hour> hour;

    public Forecastday() {
    }

    public Forecastday(String date, int dateEpoch, Day day, List<Hour> hour) {
        this.date = date;
        this.dateEpoch = dateEpoch;
        this.day = day;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Forecastday{" +
                "date='" + date + '\'' +
                ", dateEpoch=" + dateEpoch +
                ", day=" + day +
                ", hour=" + hour +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDateEpoch() {
        return dateEpoch;
    }

    public void setDateEpoch(int dateEpoch) {
        this.dateEpoch = dateEpoch;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public List<Hour> getHour() {
        return hour;
    }

    public void setHour(List<Hour> hour) {
        this.hour = hour;
    }
}
