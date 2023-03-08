package com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKonuları;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tolgaunal.tytcaslisiyorum.R;

public class KonuViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;

    public KonuViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.derslerim_konu_imageview);
        textView = itemView.findViewById(R.id.derslerim_textview_ad);
    }

    public void getKonu(Context context, KonularSinifi konularSınıfı) {
        itemView.setTag(konularSınıfı);
        textView.setText(konularSınıfı.getKonuAdi());
        imageView.setImageResource(konularSınıfı.getKonuIcon());
    }
}
