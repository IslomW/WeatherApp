package com.sharipov.weatherapp.adapters;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.sharipov.weatherapp.base.BaseRecyclerAdapter;
import com.sharipov.weatherapp.base.BaseViewHolder;
import com.sharipov.weatherapp.databinding.ItemDailyBinding;
import com.sharipov.weatherapp.model.Hour;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DailyListAdapter extends BaseRecyclerAdapter {
   private ArrayList<Hour> hourArrayList;

    public DailyListAdapter(ArrayList<Hour> hourArrayList) {
        this.hourArrayList = hourArrayList;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemDailyBinding binding = ItemDailyBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new DailyViewHolder(binding);
    }

    @Override
    public int getItemCount() {
        return hourArrayList.size();
    }



    public class DailyViewHolder extends BaseViewHolder<ItemDailyBinding>{

        public DailyViewHolder(@NonNull ItemDailyBinding binding) {
            super(binding);
        }

        @Override
        protected void onBind(int position) {
            Hour hour = hourArrayList.get(position);
            binding.textViewTime.setText(hour.getTime());
            String iconUrl = hour.getCondition().getText().trim().toLowerCase();

            binding.icWeather.setImageResource(setIcon(iconUrl, hour.getTime()));

            binding.textViewDay.setText(iconUrl);


        }



    }
}


