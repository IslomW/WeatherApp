package com.sharipov.weatherapp.base;

import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import com.sharipov.weatherapp.remote.MainApi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public abstract class BaseActivity<T extends ViewBinding> extends AppCompatActivity {

    public MainApi mainApi;
    protected T binding;

    protected abstract T viewBindingInflate(LayoutInflater inflater);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = viewBindingInflate(getLayoutInflater());
        setContentView(binding.getRoot());


        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient().newBuilder().addInterceptor(logging).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.weatherapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        mainApi = retrofit.create(MainApi.class);
    }

    public String getApiKey(){
        return new String("bd020a487b964a1383441055240703");
    }

    public int setIcon(String day, String time) {
        int num = Integer.parseInt(time.substring(0,2).trim());
        String icName = "";
        int id;

        if ( 7 <= num && 18 >= num ){
            switch (day){
                case "partly cloudy":
                    icName = "partly_cloudy";
                    break;
                case "sunny":
                    icName = "sunny";
                    break;
                case "overcast":
                    icName = "overcast";
                    break;
                case "cloudy":
                    icName = "cloudy";
                    break;
                case "mist":
                    icName = "mist";
                    break;
                case "patchy rain nearby":
                    icName = "patchy_rain_nearby";
                    break;
                case "light drizzle":
                    icName = "light_drizzle";
                    break;
                case "light rain":
                    icName = "light_rain";
                    break;
                case "moderate rain":
                    icName = "moderate_rain";
                    break;
                case "heavy rain":
                    icName = "heavy_rain";
                    break;
                case "light snow":
                    icName = "light_snow";
                    break;
                case "moderate snow":
                    icName = "moderate_snow";
                    break;
                case "heavy snow":
                    icName = "heavy_snow";
                    break;
                case "light snow showers":
                    icName = "light_snow_showers";
                    break;
                case "moderate or heavy snow showers":
                    icName = "moderate_or_heavy_snow_showers";
                    break;
            }
        }else {
            switch (day) {
                case "partly cloudy":
                    icName = "partly_cloudy_night";
                    break;
                case "clear":
                    icName = "clear";
                    break;
                case "overcast":
                    icName = "overcast";
                    break;
                case "cloudy ":
                    icName = "cloudy_night";
                    break;
                case "mist":
                    icName = "mist";
                    break;
                case "patchy rain nearby":
                    icName = "patchy_rain_nearby_night";
                    break;
                case "light drizzle":
                    icName = "light_drizzle";
                    break;
                case "light rain":
                    icName = "light_rain";
                    break;
                case "moderate rain":
                    icName = "moderate_rain";
                    break;
                case "heavy rain":
                    icName = "heavy_rain";
                    break;
                case "light snow":
                    icName = "light_snow";
                    break;
                case "moderate snow":
                    icName = "moderate_snow";
                    break;
                case "heavy snow":
                    icName = "heavy_snow";
                    break;
                case "light snow showers":
                    icName = "light_snow_showers";
                    break;
                case "moderate or heavy snow showers":
                    icName = "moderate_or_heavy_snow_showers_night";
                    break;
            }
        }

        return id = getResources().getIdentifier(icName, "drawable", getPackageName());
    }
}
