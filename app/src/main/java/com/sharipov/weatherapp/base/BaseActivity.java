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
}
