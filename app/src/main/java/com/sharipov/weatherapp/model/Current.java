package com.sharipov.weatherapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Current implements Serializable {
    @SerializedName("last_updated_epoch")
    @Expose
    public int lastUpdatedEpoch;
    @SerializedName("last_updated")
    @Expose
    public String lastUpdated;
    @SerializedName("temp_c")
    @Expose
    public float tempC;
    @SerializedName("temp_f")
    @Expose
    public float tempF;
    @SerializedName("is_day")
    @Expose
    public int isDay;
    @SerializedName("condition")
    @Expose
    public Condition condition;
    @SerializedName("wind_mph")
    @Expose
    public float windMph;
    @SerializedName("wind_kph")
    @Expose
    public float windKph;
    @SerializedName("wind_degree")
    @Expose
    public int windDegree;
    @SerializedName("wind_dir")
    @Expose
    public String windDir;
    @SerializedName("pressure_mb")
    @Expose
    public float pressureMb;
    @SerializedName("pressure_in")
    @Expose
    public float pressureIn;
    @SerializedName("precip_mm")
    @Expose
    public float precipMm;
    @SerializedName("precip_in")
    @Expose
    public float precipIn;
    @SerializedName("humidity")
    @Expose
    public int humidity;
    @SerializedName("cloud")
    @Expose
    public int cloud;
    @SerializedName("feelslike_c")
    @Expose
    public float feelslikeC;
    @SerializedName("feelslike_f")
    @Expose
    public float feelslikeF;
    @SerializedName("vis_km")
    @Expose
    public float visKm;
    @SerializedName("vis_miles")
    @Expose
    public float visMiles;
    @SerializedName("uv")
    @Expose
    public float uv;
    @SerializedName("gust_mph")
    @Expose
    public float gustMph;
    @SerializedName("gust_kph")
    @Expose
    public float gustKph;


    public Current(int lastUpdatedEpoch, String lastUpdated, float tempC, float tempF, int isDay, Condition condition, float windMph, float windKph, int windDegree, String windDir, float pressureMb, float pressureIn, float precipMm, float precipIn, int humidity, int cloud, float feelslikeC, float feelslikeF, float visKm, float visMiles, float uv, float gustMph, float gustKph) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
        this.lastUpdated = lastUpdated;
        this.tempC = tempC;
        this.tempF = tempF;
        this.isDay = isDay;
        this.condition = condition;
        this.windMph = windMph;
        this.windKph = windKph;
        this.windDegree = windDegree;
        this.windDir = windDir;
        this.pressureMb = pressureMb;
        this.pressureIn = pressureIn;
        this.precipMm = precipMm;
        this.precipIn = precipIn;
        this.humidity = humidity;
        this.cloud = cloud;
        this.feelslikeC = feelslikeC;
        this.feelslikeF = feelslikeF;
        this.visKm = visKm;
        this.visMiles = visMiles;
        this.uv = uv;
        this.gustMph = gustMph;
        this.gustKph = gustKph;
    }

    public Current() {
    }

    public int getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    public void setLastUpdatedEpoch(int lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public float getTempC() {
        return tempC;
    }

    public void setTempC(float tempC) {
        this.tempC = tempC;
    }

    public float getTempF() {
        return tempF;
    }

    public void setTempF(float tempF) {
        this.tempF = tempF;
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

    public float getWindMph() {
        return windMph;
    }

    public void setWindMph(float windMph) {
        this.windMph = windMph;
    }

    public float getWindKph() {
        return windKph;
    }

    public void setWindKph(float windKph) {
        this.windKph = windKph;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public float getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(float pressureMb) {
        this.pressureMb = pressureMb;
    }

    public float getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(float pressureIn) {
        this.pressureIn = pressureIn;
    }

    public float getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(float precipMm) {
        this.precipMm = precipMm;
    }

    public float getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(float precipIn) {
        this.precipIn = precipIn;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public float getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(float feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public float getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(float feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public float getVisKm() {
        return visKm;
    }

    public void setVisKm(float visKm) {
        this.visKm = visKm;
    }

    public float getVisMiles() {
        return visMiles;
    }

    public void setVisMiles(float visMiles) {
        this.visMiles = visMiles;
    }

    public float getUv() {
        return uv;
    }

    public void setUv(float uv) {
        this.uv = uv;
    }

    public float getGustMph() {
        return gustMph;
    }

    public void setGustMph(float gustMph) {
        this.gustMph = gustMph;
    }

    public float getGustKph() {
        return gustKph;
    }

    public void setGustKph(float gustKph) {
        this.gustKph = gustKph;
    }
}

