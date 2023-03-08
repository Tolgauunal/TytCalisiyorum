package com.tolgaunal.tytcaslisiyorum.TestActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.tolgaunal.tytcaslisiyorum.HomeActivity;
import com.tolgaunal.tytcaslisiyorum.R;
import com.tolgaunal.tytcaslisiyorum.databinding.ActivityTestlerBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestlerActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityTestlerBinding binding;
    ImageView headerDersImage,soruResmi;
    ImageButton headerCloseImage, sonrakiSoru;
    TextView headerBaslik, soruSayisi, dogruSayisi, yanlisSayisi, soru;
    Button aSecenegi, bSecenegi, cSecenegi, dSecenegi, eSecenegi;
    String gelenDersAdi;
    int gelenSoruSayisi;
    int soruIndex = 0, dogruCevap = 0, yanlisCevap = 0, totalSoru = 0, sorulanSoru = 0, reklamSayac = 0;
    String durumMesaji;
    Random rng;
    List<Integer> generated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testler);
        binding = ActivityTestlerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        gelenDersAdi = getIntent().getStringExtra("DersAdi");
        gelenSoruSayisi = getIntent().getIntExtra("SoruSayisi", 0);
        generated = new ArrayList<>();
        rng = new Random();
        headerDersImage = binding.testHeaderDersImage;
        headerCloseImage = binding.testHeaderDersClose;
        headerBaslik = binding.testHeaderDersBaslik;
        soruSayisi = binding.testSoruSayisi;
        dogruSayisi = binding.testDogruSayisi;
        yanlisSayisi = binding.testYanlisSayisi;
        aSecenegi = binding.testASecenegi;
        bSecenegi = binding.testBSecenegi;
        cSecenegi = binding.testCSecenegi;
        dSecenegi = binding.testDSecenegi;
        eSecenegi = binding.testESecenegi;
        soruResmi=binding.testlerResimimage;
        soru = binding.testSoru;
        aSecenegi.setOnClickListener(this);
        bSecenegi.setOnClickListener(this);
        cSecenegi.setOnClickListener(this);
        dSecenegi.setOnClickListener(this);
        eSecenegi.setOnClickListener(this);
        headerCloseImage.setOnClickListener(view1 -> exit());
        sonrakiSoru = binding.next;
        sonrakiSoru.setEnabled(false);
        sonrakiSoru.setOnClickListener(view12 -> {
            reklamSayac++;
            reklamSayac = 0;
            loadNewQuestion();
            System.out.println(reklamSayac);
        });
        loadNewQuestion();
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setTitle("Uyarı Mesajı").setMessage("Testi Bitirmek İstediğinizden Emin Misiniz?")
                .setPositiveButton("Evet", (dialogInterface, i) -> {
                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                    intent.putExtra("intentDeger", "Test");
                    startActivity(intent);
                }).setNegativeButton("Hayır", (dialogInterface, i) -> dialogInterface.dismiss()).setCancelable(false).show();
    }

    private void exit() {
        new AlertDialog.Builder(this).setTitle("Uyarı Mesajı").setMessage("Testi Bitirmek İstediğinizden Emin Misiniz?")
                .setPositiveButton("Evet", (dialogInterface, i) -> {
                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                    intent.putExtra("intentDeger", "Test");
                    startActivity(intent);
                }).setNegativeButton("Hayır", (dialogInterface, i) -> dialogInterface.dismiss()).setCancelable(false).show();
    }

    @SuppressLint("SetTextI18n")
    private void loadNewQuestion() {
        sonrakiSoru.setVisibility(View.INVISIBLE);
        aSecenegi.setEnabled(true);
        bSecenegi.setEnabled(true);
        cSecenegi.setEnabled(true);
        dSecenegi.setEnabled(true);
        eSecenegi.setEnabled(true);
        aSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.acikmavi)));
        bSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.acikmavi)));
        cSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.acikmavi)));
        dSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.acikmavi)));
        eSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.acikmavi)));
        generated.clear();
        if (gelenDersAdi.equals("Tarih")) {
            headerDersImage.setImageResource(R.drawable.tarih);
            headerBaslik.setText("TARİH TESTLERİ");
            soruSayisi.setText("Soru Sayısı: " + totalSoru + "/" + gelenSoruSayisi);
            for (int i = 0; i < gelenSoruSayisi; i++) {
                while (true) {
                    Integer next = rng.nextInt(TestClass.TarihSoru.length);
                    if (!generated.contains(next)) {
                        // Done for this iteration
                        generated.add(next);
                        break;
                    }
                }
            }
            if (sorulanSoru == generated.size()) {
                finishQuiz();
                return;
            } else {
                soru.setText(TestClass.TarihSoru[generated.get(soruIndex)]);
                aSecenegi.setText(TestClass.TarihSiklar[generated.get(soruIndex)][0]);
                bSecenegi.setText(TestClass.TarihSiklar[generated.get(soruIndex)][1]);
                cSecenegi.setText(TestClass.TarihSiklar[generated.get(soruIndex)][2]);
                dSecenegi.setText(TestClass.TarihSiklar[generated.get(soruIndex)][3]);
                eSecenegi.setText(TestClass.TarihSiklar[generated.get(soruIndex)][4]);
            }
        } else if (gelenDersAdi.equals("Matematik")) {
            headerDersImage.setImageResource(R.drawable.matematik);
            headerBaslik.setText("MATEMATİK TESTLERİ");
            soruSayisi.setText("Soru Sayısı: " + totalSoru + "/" + gelenSoruSayisi);
            for (int i = 0; i < gelenSoruSayisi; i++) {
                while (true) {
                    Integer next = rng.nextInt(TestClass.MatematikSoru.length);
                    if (!generated.contains(next)) {
                        // Done for this iteration
                        generated.add(next);
                        break;
                    }
                }
            }
            if (sorulanSoru == generated.size()) {
                finishQuiz();
                return;
            } else {
                soru.setText(TestClass.MatematikSoru[generated.get(soruIndex)]);
                aSecenegi.setText(TestClass.MatematikSiklar[generated.get(soruIndex)][0]);
                bSecenegi.setText(TestClass.MatematikSiklar[generated.get(soruIndex)][1]);
                cSecenegi.setText(TestClass.MatematikSiklar[generated.get(soruIndex)][2]);
                dSecenegi.setText(TestClass.MatematikSiklar[generated.get(soruIndex)][3]);
                eSecenegi.setText(TestClass.MatematikSiklar[generated.get(soruIndex)][4]);
            }
        }
        if (gelenDersAdi.equals("Türkçe")) {
            headerDersImage.setImageResource(R.drawable.turkce);
            headerBaslik.setText("TÜRKÇE TESTLERİ");
            soruSayisi.setText("Soru Sayısı: " + totalSoru + "/" + gelenSoruSayisi);
            for (int i = 0; i < gelenSoruSayisi; i++) {
                while (true) {
                    Integer next = rng.nextInt(TestClass.TurkceSoru.length);
                    if (!generated.contains(next)) {
                        // Done for this iteration
                        generated.add(next);
                        break;
                    }
                }
            }
            if (sorulanSoru == generated.size()) {
                finishQuiz();
                return;
            } else {
                soru.setText(TestClass.TurkceSoru[generated.get(soruIndex)]);
                aSecenegi.setText(TestClass.TurkceSiklar[generated.get(soruIndex)][0]);
                bSecenegi.setText(TestClass.TurkceSiklar[generated.get(soruIndex)][1]);
                cSecenegi.setText(TestClass.TurkceSiklar[generated.get(soruIndex)][2]);
                dSecenegi.setText(TestClass.TurkceSiklar[generated.get(soruIndex)][3]);
                eSecenegi.setText(TestClass.TurkceSiklar[generated.get(soruIndex)][4]);
            }
        }
        if (gelenDersAdi.equals("Coğrafya")) {
            headerDersImage.setImageResource(R.drawable.cografya);
            headerBaslik.setText("COĞRAFYA TESTLERİ");
            soruSayisi.setText("Soru Sayısı: " + totalSoru + "/" + gelenSoruSayisi);
            for (int i = 0; i < gelenSoruSayisi; i++) {
                while (true) {
                    Integer next = rng.nextInt(TestClass.CografyaSoru.length);
                    if (!generated.contains(next)) {
                        // Done for this iteration
                        generated.add(next);
                        break;
                    }
                }
            }
            if (sorulanSoru == generated.size()) {
                finishQuiz();
                return;
            } else {
                soru.setText(TestClass.CografyaSoru[generated.get(soruIndex)]);
                aSecenegi.setText(TestClass.CografyaSıklar[generated.get(soruIndex)][0]);
                bSecenegi.setText(TestClass.CografyaSıklar[generated.get(soruIndex)][1]);
                cSecenegi.setText(TestClass.CografyaSıklar[generated.get(soruIndex)][2]);
                dSecenegi.setText(TestClass.CografyaSıklar[generated.get(soruIndex)][3]);
                eSecenegi.setText(TestClass.CografyaSıklar[generated.get(soruIndex)][4]);
            }
        }
        if (gelenDersAdi.equals("Kimya")) {
            headerDersImage.setImageResource(R.drawable.kimyatest);
            headerBaslik.setText("KİMYA TESTLERİ");
            soruSayisi.setText("Soru Sayısı: " + totalSoru + "/" + gelenSoruSayisi);
            for (int i = 0; i < gelenSoruSayisi; i++) {
                while (true) {
                    Integer next = rng.nextInt(TestClass.KimyaSorular.length);
                    if (!generated.contains(next)) {
                        // Done for this iteration
                        generated.add(next);
                        break;
                    }
                }
            }
            if (sorulanSoru == generated.size()) {
                finishQuiz();
                return;
            } else {
                soru.setText(TestClass.KimyaSorular[generated.get(soruIndex)]);
                aSecenegi.setText(TestClass.KimyaSıklar[generated.get(soruIndex)][0]);
                bSecenegi.setText(TestClass.KimyaSıklar[generated.get(soruIndex)][1]);
                cSecenegi.setText(TestClass.KimyaSıklar[generated.get(soruIndex)][2]);
                dSecenegi.setText(TestClass.KimyaSıklar[generated.get(soruIndex)][3]);
                eSecenegi.setText(TestClass.KimyaSıklar[generated.get(soruIndex)][4]);
            }
        }
        sorulanSoru++;
    }

    private void finishQuiz() {
        if (dogruCevap > gelenSoruSayisi * 0.60) {
            durumMesaji = "Tebrikler!!";
        } else {
            durumMesaji = "Çalışmaya Devam Birlikte Başarabiliriz";
        }
        new AlertDialog.Builder(this).setTitle("Durum").setMessage("Toplam Soru Sayısı: " + gelenSoruSayisi + "\n" + "Doğru Cevap Sayısı: " + dogruCevap + "\n" + durumMesaji)
                .setPositiveButton("Tekrar Deneyin", ((dialogInterface, i) -> restartQuiz())).setNegativeButton("Çıkış", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(TestlerActivity.this, HomeActivity.class);
                        intent.putExtra("intentDeger", "Test");
                        startActivity(intent);
                    }
                }).setCancelable(false).show();
    }

    private void restartQuiz() {
        soruIndex = 0;
        dogruCevap = 0;
        yanlisCevap = 0;
        totalSoru = 0;
        sorulanSoru = 0;
        yanlisSayisi.setText("0");
        dogruSayisi.setText("0");
        loadNewQuestion();
    }

    public void onClick(View view) {
        sonrakiSoru.setEnabled(true);
        Button clickedButton = (Button) view;
        String secilenCevap = clickedButton.getText().toString();
        sonrakiSoru.setVisibility(View.VISIBLE);
        if (gelenDersAdi.equals("Tarih")) {
            if (secilenCevap.equals(TestClass.TarihCevaplar[generated.get(soruIndex)])) {
                clickedButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                soruIndex++;
                dogruCevap++;
                totalSoru++;
                dogruSayisi.setText(String.valueOf(dogruCevap));
            } else {
                clickedButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                if (aSecenegi.getText().equals(TestClass.TarihCevaplar[generated.get(soruIndex)])) {
                    aSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (bSecenegi.getText().equals(TestClass.TarihCevaplar[generated.get(soruIndex)])) {
                    bSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (cSecenegi.getText().equals(TestClass.TarihCevaplar[generated.get(soruIndex)])) {
                    cSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (dSecenegi.getText().equals(TestClass.TarihCevaplar[generated.get(soruIndex)])) {
                    dSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (eSecenegi.getText().equals(TestClass.TarihCevaplar[generated.get(soruIndex)])) {
                    eSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                soruIndex++;
                yanlisCevap++;
                totalSoru++;
                yanlisSayisi.setText(String.valueOf(yanlisCevap));
            }
        }
        if (gelenDersAdi.equals("Matematik")) {
            if (secilenCevap.equals(TestClass.MatematikCevap[generated.get(soruIndex)])) {
                clickedButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                soruIndex++;
                dogruCevap++;
                totalSoru++;
                dogruSayisi.setText(String.valueOf(dogruCevap));
            } else {
                clickedButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                if (aSecenegi.getText().equals(TestClass.MatematikCevap[generated.get(soruIndex)])) {
                    aSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (bSecenegi.getText().equals(TestClass.MatematikCevap[generated.get(soruIndex)])) {
                    bSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (cSecenegi.getText().equals(TestClass.MatematikCevap[generated.get(soruIndex)])) {
                    cSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (dSecenegi.getText().equals(TestClass.MatematikCevap[generated.get(soruIndex)])) {
                    dSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (eSecenegi.getText().equals(TestClass.MatematikCevap[generated.get(soruIndex)])) {
                    eSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                soruIndex++;
                yanlisCevap++;
                totalSoru++;
                yanlisSayisi.setText(String.valueOf(yanlisCevap));
            }
        }
        if (gelenDersAdi.equals("Türkçe")) {
            if (secilenCevap.equals(TestClass.TurkceCevap[generated.get(soruIndex)])) {
                clickedButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                soruIndex++;
                dogruCevap++;
                totalSoru++;
                dogruSayisi.setText(String.valueOf(dogruCevap));
            } else {
                clickedButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                if (aSecenegi.getText().equals(TestClass.TurkceCevap[generated.get(soruIndex)])) {
                    aSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (bSecenegi.getText().equals(TestClass.TurkceCevap[generated.get(soruIndex)])) {
                    bSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (cSecenegi.getText().equals(TestClass.TurkceCevap[generated.get(soruIndex)])) {
                    cSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (dSecenegi.getText().equals(TestClass.TurkceCevap[generated.get(soruIndex)])) {
                    dSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (eSecenegi.getText().equals(TestClass.TurkceCevap[generated.get(soruIndex)])) {
                    eSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                soruIndex++;
                yanlisCevap++;
                totalSoru++;
                yanlisSayisi.setText(String.valueOf(yanlisCevap));
            }
        }
        if (gelenDersAdi.equals("Coğrafya")) {
            if (secilenCevap.equals(TestClass.CografyaCevap[generated.get(soruIndex)])) {
                clickedButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                soruIndex++;
                dogruCevap++;
                totalSoru++;
                dogruSayisi.setText(String.valueOf(dogruCevap));
            } else {
                clickedButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                if (aSecenegi.getText().equals(TestClass.CografyaCevap[generated.get(soruIndex)])) {
                    aSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (bSecenegi.getText().equals(TestClass.CografyaCevap[generated.get(soruIndex)])) {
                    bSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (cSecenegi.getText().equals(TestClass.CografyaCevap[generated.get(soruIndex)])) {
                    cSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (dSecenegi.getText().equals(TestClass.CografyaCevap[generated.get(soruIndex)])) {
                    dSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (eSecenegi.getText().equals(TestClass.CografyaCevap[generated.get(soruIndex)])) {
                    eSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                soruIndex++;
                yanlisCevap++;
                totalSoru++;
                yanlisSayisi.setText(String.valueOf(yanlisCevap));
            }
        }
        if (gelenDersAdi.equals("Kimya")) {
            if (secilenCevap.equals(TestClass.KimyaCevaplar[generated.get(soruIndex)])) {
                clickedButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                soruIndex++;
                dogruCevap++;
                totalSoru++;
                dogruSayisi.setText(String.valueOf(dogruCevap));
            } else {
                clickedButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                if (aSecenegi.getText().equals(TestClass.KimyaCevaplar[generated.get(soruIndex)])) {
                    aSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (bSecenegi.getText().equals(TestClass.KimyaCevaplar[generated.get(soruIndex)])) {
                    bSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (cSecenegi.getText().equals(TestClass.KimyaCevaplar[generated.get(soruIndex)])) {
                    cSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (dSecenegi.getText().equals(TestClass.KimyaCevaplar[generated.get(soruIndex)])) {
                    dSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                if (eSecenegi.getText().equals(TestClass.KimyaCevaplar[generated.get(soruIndex)])) {
                    eSecenegi.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                }
                soruIndex++;
                yanlisCevap++;
                totalSoru++;
                yanlisSayisi.setText(String.valueOf(yanlisCevap));
            }
        }
        aSecenegi.setEnabled(false);
        bSecenegi.setEnabled(false);
        cSecenegi.setEnabled(false);
        dSecenegi.setEnabled(false);
        eSecenegi.setEnabled(false);
    }
}