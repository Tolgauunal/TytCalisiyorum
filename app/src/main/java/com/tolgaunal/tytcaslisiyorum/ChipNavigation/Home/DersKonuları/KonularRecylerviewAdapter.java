package com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKonuları;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.tolgaunal.tytcaslisiyorum.R;

import java.util.ArrayList;

public class KonularRecylerviewAdapter extends RecyclerView.Adapter<KonuViewHolder> implements View.OnClickListener {
    private final ArrayList<KonularSinifi> konularSinifis;
    private final LayoutInflater layoutInflater;
    private final AppCompatActivity appCompatActivity;
    private final KonularListener konularListener;

    public KonularRecylerviewAdapter(AppCompatActivity appCompatActivity, KonularListener konularListener) {
        this.appCompatActivity = appCompatActivity;
        this.konularListener = konularListener;
        this.layoutInflater = appCompatActivity.getLayoutInflater();
        this.konularSinifis = new ArrayList<>();
    }

    public ArrayList<KonularSinifi> getKonularSinifis() {
        return konularSinifis;
    }

    public interface KonularListener {
        void konularListener(KonularSinifi konularSinifi);
    }

    @Override
    public void onClick(View view) {
        if (view.getTag() instanceof KonularSinifi) {
            KonularSinifi konularSinifi = (KonularSinifi) view.getTag();
            konularListener.konularListener(konularSinifi);
        }

    }

    @NonNull
    @Override
    public KonuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.cardviewdersicerikdesign, parent, false);
        view.setOnClickListener(this);
        return new KonuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KonuViewHolder holder, int position) {
        holder.getKonu(appCompatActivity, konularSinifis.get(position));
    }

    @Override
    public int getItemCount() {
        return konularSinifis.size();
    }

}
