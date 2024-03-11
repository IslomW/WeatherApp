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
}
