package com.tolgaunal.tytcaslisiyorum.ChipNavigation.Derslerim;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKonuları.KonularSinifi;
import com.tolgaunal.tytcaslisiyorum.R;

public class DerslerimKonularViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView dersadlari, sorusayilari;

    public DerslerimKonularViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.derslerim_konu_imageview);
        dersadlari = itemView.findViewById(R.id.derslerim_textview_ad);
        sorusayilari = itemView.findViewById(R.id.derslerim_soruSayisi);

    }

    public void getDersKonu(Context context, KonularSinifi konularSinifi) {
        itemView.setTag(konularSinifi);
        dersadlari.setText(konularSinifi.getKonuAdi());
        imageView.setImageResource(konularSinifi.getKonuIcon());
    }
}
