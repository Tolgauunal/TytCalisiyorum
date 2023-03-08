package com.tolgaunal.tytcaslisiyorum.ChipNavigation.TestlerNavigation;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.shawnlin.numberpicker.NumberPicker;
import com.tolgaunal.tytcaslisiyorum.R;
import com.tolgaunal.tytcaslisiyorum.TestActivity.TestlerActivity;


public class TestlerFragment extends Fragment {

    CardView matematik, tarih, turkce, cografya, biyoloji, geometri, dinkulturu, felsefe, fizik, kimya;
    ImageView start;
    String secilenDers = "";
    int secilenSoruSayisi = 1;
    NumberPicker numberPicker;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_testler, container, false);
        matematik = view.findViewById(R.id.testler_matematik);
        tarih = view.findViewById(R.id.testler_tarih);
        turkce = view.findViewById(R.id.testler_turkce);
        cografya = view.findViewById(R.id.testler_cografya);
        biyoloji = view.findViewById(R.id.testler_biyoloyji);
        geometri = view.findViewById(R.id.testler_geometri);
        dinkulturu = view.findViewById(R.id.testler_din);
        felsefe = view.findViewById(R.id.testler_felsefe);
        fizik = view.findViewById(R.id.testler_fizik);
        kimya = view.findViewById(R.id.testler_kimya);
        start = view.findViewById(R.id.testler_start);
        numberPicker = (NumberPicker) view.findViewById(R.id.number_picker);
        matematik.setOnClickListener(view1 -> {
            secilenDers = "Matematik";
            matematik.setBackgroundColor(getResources().getColor(R.color.green));
            tarih.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            turkce.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            cografya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            biyoloji.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            geometri.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            dinkulturu.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            felsefe.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            fizik.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            kimya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
        });
        tarih.setOnClickListener(view12 -> {
            secilenDers = "Tarih";
            matematik.setBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            tarih.setCardBackgroundColor(getResources().getColor(R.color.green));
            turkce.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            cografya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            biyoloji.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            geometri.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            dinkulturu.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            felsefe.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            fizik.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            kimya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
        });
        turkce.setOnClickListener(view13 -> {
            secilenDers = "Türkçe";
            matematik.setBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            tarih.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            turkce.setCardBackgroundColor(getResources().getColor(R.color.green));
            cografya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            biyoloji.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            geometri.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            dinkulturu.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            felsefe.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            fizik.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            kimya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
        });
        cografya.setOnClickListener(view14 -> {
            secilenDers = "Coğrafya";
            matematik.setBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            tarih.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            turkce.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            cografya.setCardBackgroundColor(getResources().getColor(R.color.green));
            biyoloji.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            geometri.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            dinkulturu.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            felsefe.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            fizik.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            kimya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
        });
        biyoloji.setOnClickListener(view15 -> {
            secilenDers = "Biyoloji";
            matematik.setBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            tarih.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            turkce.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            cografya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            biyoloji.setCardBackgroundColor(getResources().getColor(R.color.green));
            geometri.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            dinkulturu.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            felsefe.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            fizik.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            kimya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
        });
        geometri.setOnClickListener(view16 -> {
            secilenDers = "Geometri";
            matematik.setBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            tarih.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            turkce.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            cografya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            biyoloji.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            geometri.setCardBackgroundColor(getResources().getColor(R.color.green));
            dinkulturu.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            felsefe.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            fizik.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            kimya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
        });
        dinkulturu.setOnClickListener(view111 -> {
            secilenDers = "Din Kültürü";
            matematik.setBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            tarih.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            turkce.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            cografya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            biyoloji.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            geometri.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            dinkulturu.setCardBackgroundColor(getResources().getColor(R.color.green));
            felsefe.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            fizik.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            kimya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
        });
        felsefe.setOnClickListener(view112 -> {
            secilenDers = "Felsefe";
            matematik.setBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            tarih.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            turkce.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            cografya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            biyoloji.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            geometri.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            dinkulturu.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            felsefe.setCardBackgroundColor(getResources().getColor(R.color.green));
            fizik.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            kimya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
        });
        fizik.setOnClickListener(view113 -> {
            secilenDers = "Fizik";
            matematik.setBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            tarih.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            turkce.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            cografya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            biyoloji.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            geometri.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            dinkulturu.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            felsefe.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            fizik.setCardBackgroundColor(getResources().getColor(R.color.green));
            kimya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
        });
        kimya.setOnClickListener(view114 -> {
            secilenDers = "Kimya";
            matematik.setBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            tarih.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            turkce.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            cografya.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            biyoloji.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            geometri.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            dinkulturu.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            felsefe.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            fizik.setCardBackgroundColor(getResources().getColor(R.color.kapaliMavi));
            kimya.setCardBackgroundColor(getResources().getColor(R.color.green));
        });
        numberPicker.setOnValueChangedListener((picker, oldVal, newVal) -> secilenSoruSayisi = newVal);
        start.setOnClickListener(view110 -> {
            if (secilenDers != "" && secilenSoruSayisi != 0) {
                Intent intent = new Intent(getContext(), TestlerActivity.class);
                intent.putExtra("DersAdi", secilenDers);
                intent.putExtra("SoruSayisi", secilenSoruSayisi);
                startActivity(intent);
                secilenSoruSayisi=1;
            } else {
                Toast.makeText(getContext(), "Ders ve soru sayısı seçmelisiniz.", Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}