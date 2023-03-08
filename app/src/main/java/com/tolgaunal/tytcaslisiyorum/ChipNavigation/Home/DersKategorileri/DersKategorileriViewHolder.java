package com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKategorileri;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.tolgaunal.tytcaslisiyorum.R;

public class DersKategorileriViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;
    CardView cardView;
    LinearLayout linearLayout;

    public DersKategorileriViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.cardviewDersImage);
        textView = itemView.findViewById(R.id.dersAdiTextview);
        cardView = itemView.findViewById(R.id.cardviewDersadi);
        linearLayout = itemView.findViewById(R.id.cardviewDersLinear);
    }

    public void getDers(Context context, DersKategorileri dersKategorileri) {
        itemView.setTag(dersKategorileri);
        textView.setText(dersKategorileri.getDersAdi());
        imageView.setImageResource(dersKategorileri.getDersIcon());
    }
}
