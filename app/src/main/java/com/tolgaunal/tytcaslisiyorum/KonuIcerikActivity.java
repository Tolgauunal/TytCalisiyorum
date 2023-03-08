package com.tolgaunal.tytcaslisiyorum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKonuları.KonularSinifi;

public class KonuIcerikActivity extends AppCompatActivity {
    private KonularSinifi konularSinifi;
    WebView webView;
    public String fileName;
    public String fileName2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konu_icerik);
        konularSinifi = getIntent().getParcelableExtra("Info");
        String intent = getIntent().getStringExtra("searchInfo");
        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        if (konularSinifi != null) {
            fileName = konularSinifi.getKonuAdi();
            webView.loadUrl("file:///android_asset/" + fileName);
        } else {
            fileName2 = intent;
            webView.loadUrl("file:///android_asset/" + fileName2);
        }
    }
}