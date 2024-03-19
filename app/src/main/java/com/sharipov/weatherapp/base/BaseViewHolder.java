package com.sharipov.weatherapp.base;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

public abstract class BaseViewHolder<T extends ViewBinding> extends RecyclerView.ViewHolder {

    protected T binding;



    public BaseViewHolder(@NonNull T binding) {
        super(binding.getRoot());
        this.binding = binding;

    }

    protected abstract void onBind(int position);

    protected int setIcon(String day, String time) {
        int num = Integer.parseInt(time.substring(0,2));
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

        return id = itemView.getResources().getIdentifier(icName, "drawable", itemView.getContext().getPackageName());
    }
}
