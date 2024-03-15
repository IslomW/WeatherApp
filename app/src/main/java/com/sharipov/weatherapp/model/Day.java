package com.sharipov.weatherapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Day implements Serializable {
    @SerializedName("maxtemp_c")
    @Expose
    public double maxtempC;
    @SerializedName("maxtemp_f")
    @Expose
    public double maxtempF;
    @SerializedName("mintemp_c")
    @Expose
    public double mintempC;
    @SerializedName("mintemp_f")
    @Expose
    public double mintempF;
    @SerializedName("avgtemp_c")
    @Expose
    public double avgtempC;
    @SerializedName("avgtemp_f")
    @Expose
    public double avgtempF;
    @SerializedName("maxwind_mph")
    @Expose
    public double maxwindMph;
    @SerializedName("maxwind_kph")
    @Expose
    public double maxwindKph;
    @SerializedName("totalprecip_mm")
    @Expose
    public double totalprecipMm;
    @SerializedName("totalprecip_in")
    @Expose
    public double totalprecipIn;
    @SerializedName("totalsnow_cm")
    @Expose
    public double totalsnowCm;
    @SerializedName("avgvis_km")
    @Expose
    public double avgvisKm;
    @SerializedName("avgvis_miles")
    @Expose
    public double avgvisMiles;
    @SerializedName("avghumidity")
    @Expose
    public int avghumidity;
    @SerializedName("daily_will_it_rain")
    @Expose
    public int dailyWillItRain;
    @SerializedName("daily_chance_of_rain")
    @Expose
    public int dailyChanceOfRain;
    @SerializedName("daily_will_it_snow")
    @Expose
    public int dailyWillItSnow;
    @SerializedName("daily_chance_of_snow")
    @Expose
    public int dailyChanceOfSnow;



}
