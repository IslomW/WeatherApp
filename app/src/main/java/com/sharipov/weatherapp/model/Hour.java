package com.sharipov.weatherapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Hour implements Serializable
{

    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("temp_c")
    @Expose
    private double tempC;

    @SerializedName("is_day")
    @Expose
    private int isDay;

    @SerializedName("condition")
    @Expose
    private Condition condition;



    public Hour() {
    }

    public Hour(String time, double tempC, int isDay, Condition condition) {
        this.time = time;
        this.tempC = tempC;
        this.isDay = isDay;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Hour{" +
                "time='" + time + '\'' +
                ", tempC=" + tempC +
                ", isDay=" + isDay +
                '}';
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
