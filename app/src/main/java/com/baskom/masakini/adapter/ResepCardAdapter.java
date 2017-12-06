package com.baskom.masakini.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.baskom.masakini.R;
import com.baskom.masakini.feed.Resep;
import com.baskom.masakini.subactivity.ResepTabActivity;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akmalmuhamad on 23/11/17.
 */

public class ResepCardAdapter extends RecyclerView.Adapter{

    private List<Resep> resepList = new ArrayList<>();

    public ResepCardAdapter(List<Resep> resepList) {
        this.resepList.addAll(resepList);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate new view when creating new items in recyclerview
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_resep, parent, false);
        return new ResepViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        ((ResepViewHolder) holder).bindData(resepList.get(position));
    }

    @Override
    public int getItemCount() {
        return resepList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.card_resep;
    }
}
