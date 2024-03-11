package com.sharipov.weatherapp.remote;

import com.sharipov.weatherapp.model.Example;

import java.lang.reflect.Array;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MainApi {

    @GET("/v1/current.json")
    Call<Example> getCurrentInf(@Query("key") String key,
                                @Query("q") String city );
}
