package com.sharipov.weatherapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {
    @SerializedName("location")
    @Expose
    public Location location;
    @SerializedName("current")
    @Expose
    public Current current;



}
