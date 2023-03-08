package com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKategorileri;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.tolgaunal.tytcaslisiyorum.R;

import java.util.ArrayList;

public class DersKategorileriRecylerViewAdapter extends RecyclerView.Adapter<DersKategorileriViewHolder> implements View.OnClickListener {
    private final ArrayList<DersKategorileri> dersKategorileris;
    private final LayoutInflater layoutInflater;
    private final AppCompatActivity appCompatActivity;
    private final DerslerListener derslerListener;
    int index = -1;
    int deneme = 0;
    boolean kontrol = true;

    public DersKategorileriRecylerViewAdapter(AppCompatActivity appCompatActivity, DerslerListener mylistener) {
        layoutInflater = appCompatActivity.getLayoutInflater();
        this.appCompatActivity = appCompatActivity;
        this.derslerListener = mylistener;
        dersKategorileris = new ArrayList<>();
    }


    public ArrayList<DersKategorileri> getDersKategorileris() {
        return dersKategorileris;
    }

    @Override
    public void onClick(View view) {
        if (view.getTag() instanceof DersKategorileri) {
            DersKategorileri dersKategorileri = (DersKategorileri) view.getTag();
            derslerListener.derslerListener(dersKategorileri);
        }

    }

    public interface DerslerListener {
        void derslerListener(DersKategorileri dersKategorileri);
    }

    @NonNull
    @Override
    public DersKategorileriViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.cardviewdersdesign, parent, false);
        view.setOnClickListener(this);
        return new DersKategorileriViewHolder(view);
    }

    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void onBindViewHolder(@NonNull DersKategorileriViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.getDers(appCompatActivity, dersKategorileris.get(position));
        holder.itemView.setOnClickListener(view -> {
            index = position;
            notifyDataSetChanged();
            derslerListener.derslerListener(dersKategorileris.get(position));
        });
        if (deneme == position && kontrol) {
            holder.linearLayout.setBackgroundColor(Color.parseColor("#293559"));
            holder.imageView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            holder.textView.setTextColor(Color.parseColor("#FFFFFF"));
            kontrol = false;
        } else if (index == position) {
            holder.linearLayout.setBackgroundColor(Color.parseColor("#293559"));
            holder.imageView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            holder.textView.setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            holder.linearLayout.setBackgroundResource(R.drawable.custom_edittext);
            holder.textView.setTextColor(Color.parseColor("#293559"));
        }
    }

    @Override
    public int getItemCount() {
        return dersKategorileris.size();
    }
}
