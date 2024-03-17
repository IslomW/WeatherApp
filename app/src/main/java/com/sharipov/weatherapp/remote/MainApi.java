package com.sharipov.weatherapp.remote;

import com.sharipov.weatherapp.model.ForecastMain;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MainApi {

    //Forecast

    @GET("/v1/forecast.json")
    Call<ForecastMain> getForecastInf(@Query("key") String key,
                                      @Query("q") String city );
}
