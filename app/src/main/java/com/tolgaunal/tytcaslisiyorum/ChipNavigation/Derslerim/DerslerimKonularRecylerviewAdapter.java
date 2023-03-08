package com.tolgaunal.tytcaslisiyorum.ChipNavigation.Derslerim;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKonuları.KonularSinifi;
import com.tolgaunal.tytcaslisiyorum.R;

import java.util.ArrayList;

public class DerslerimKonularRecylerviewAdapter extends RecyclerView.Adapter<DerslerimKonularViewHolder> implements View.OnClickListener {
    private final ArrayList<KonularSinifi> derskonularSinifi;
    private final LayoutInflater layoutInflater;
    private final AppCompatActivity appCompatActivity;
    private final DersKonularListener dersKonularListener;

    public DerslerimKonularRecylerviewAdapter(AppCompatActivity appCompatActivity, DersKonularListener dersKonularListener) {
        this.appCompatActivity = appCompatActivity;
        this.dersKonularListener = dersKonularListener;
        this.layoutInflater = appCompatActivity.getLayoutInflater();
        this.derskonularSinifi = new ArrayList<>();
    }

    public ArrayList<KonularSinifi> getDersKonularSinidi() {
        return derskonularSinifi;
    }

    public interface DersKonularListener {
        void dersKonularListener(KonularSinifi konularSinifi);
    }

    @Override
    public void onClick(View view) {
        if (view.getTag() instanceof KonularSinifi) {
            KonularSinifi konularSinifi = (KonularSinifi) view.getTag();
            dersKonularListener.dersKonularListener(konularSinifi);
        }

    }

    @NonNull
    @Override
    public DerslerimKonularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.cardview_derslerimkonular_design, parent, false);
        view.setOnClickListener(this);
        return new DerslerimKonularViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DerslerimKonularViewHolder holder, int position) {
        holder.getDersKonu(appCompatActivity, derskonularSinifi.get(position));
    }

    @Override
    public int getItemCount() {
        return derskonularSinifi.size();
    }

}
