package com.baskom.miadmin.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baskom.miadmin.R;
import com.baskom.miadmin.model.Resep;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akmalmuhamad on 16/02/18.
 */

public class KelolaResepCardAdapter extends RecyclerView.Adapter {

    private List<Resep> resepList = new ArrayList<>();

    public KelolaResepCardAdapter(List<Resep> resepList) {
        this.resepList.addAll(resepList);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate new view when creating new items in recyclerview
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_resep, parent, false);
        return new KelolaResepCardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        if (holder.getItemViewType() == R.layout.card_resep) {
            ((KelolaResepCardViewHolder) holder).bindData(resepList.get(position));
        }
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
