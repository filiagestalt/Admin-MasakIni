package com.baskom.masakini.adapter;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.baskom.masakini.MainActivity;
import com.baskom.masakini.R;
import com.baskom.masakini.feed.Resep;
import com.baskom.masakini.subactivity.ResepTabActivity;

/**
 * Created by Castor on 12/5/2017.
 */

public class ResepViewHolder extends RecyclerView.ViewHolder{
    private TextView judulResep;
    private TextView subJudulResep;
    private TextView tingkatKesulitan;
    private TextView untukBerapaOrang;
    private TextView waktuMemasak;
    private ImageView resepImage;
    private CardView cardView;

    public ResepViewHolder(View itemView){
        super(itemView);
        judulResep = itemView.findViewById(R.id.cardView_JudulResep);
        subJudulResep = itemView.findViewById(R.id.cardView_deksripsiResep);
        tingkatKesulitan = itemView.findViewById(R.id.cardView_tingkat_kesulitan);
        untukBerapaOrang = itemView.findViewById(R.id.cardView_untukBerapaOrang);
        waktuMemasak = itemView.findViewById(R.id.cardView_waktuMemasak);
        resepImage = itemView.findViewById(R.id.cardView_main_image);
        cardView = itemView.findViewById(R.id.card_view_resep);
    }

    public void bindData(final Resep resep){
       judulResep.setText(resep.getJudulResep());
       subJudulResep.setText(resep.getSubJudulResep());
       tingkatKesulitan.setText(resep.getTingkatKesulitan());
       untukBerapaOrang.setText(resep.getUntukBerapaOrang());
       waktuMemasak.setText(resep.getWaktuMemasak());
       cardView.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(view.getContext(), ResepDetil.class);
               intent.putExtra("objekResep",resep);
               view.getContext().startActivity(intent);
           }
       });
    }


}
