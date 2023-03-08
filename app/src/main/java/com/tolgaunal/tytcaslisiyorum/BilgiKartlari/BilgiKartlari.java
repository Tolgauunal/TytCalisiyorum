package com.tolgaunal.tytcaslisiyorum.BilgiKartlari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.tolgaunal.tytcaslisiyorum.databinding.ActivityBilgiKartlariBinding;

public class BilgiKartlari extends AppCompatActivity {
    ActivityBilgiKartlariBinding binding;
    ProgressBar progressBar;
    String secilenKonu;
    TextView baslik, icerik;
    Button ileri, geri;
    int sayac = 0, toplamBilgi, reklamSayac = 0;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBilgiKartlariBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        secilenKonu = getIntent().getStringExtra("secilenKonu");
        progressBar = binding.bilgiKartlariProgressBar;
        baslik = binding.bilgiKartlariBaslik;
        baslik.setText(secilenKonu);
        icerik = binding.bilgiKartlariIcerik;
        ileri = binding.bilgikartlariIleri;
        geri = binding.bilgikartlariGeri;
        loadNewBilgi();
        if (sayac == 0) {
            geri.setVisibility(View.INVISIBLE);
        }
        ileri.setOnClickListener(view1 -> {
            sayac++;
            reklamSayac++;
            geri.setVisibility(View.VISIBLE);
            if (sayac > toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            } else {
                loadNewBilgi();
              /*
              if (reklamSayac==10){
                  if (mInterstitialAd!=null){
                      mInterstitialAd.show(BilgiKartlari.this);
                  }
                  reklamSayac=0;
                  reklamYukle();
              }*/
            }
        });
        geri.setOnClickListener(view13 -> {
            sayac--;
            ileri.setVisibility(View.VISIBLE);
            loadNewBilgi();
            if (sayac == 0) {
                geri.setVisibility(View.INVISIBLE);
            }
        });
        //reklamYukle();
    }

    private void loadNewBilgi() {
        if (secilenKonu.equals("Temel Kavramlar")) {
            icerik.setText(BilgiKartlariClass.TemelKavramlar[sayac]);
            toplamBilgi = BilgiKartlariClass.TemelKavramlar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Sayılar")) {
            icerik.setText(BilgiKartlariClass.Sayilar[sayac]);
            toplamBilgi = BilgiKartlariClass.Sayilar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Bölme-Bölünebilme Kuralları")) {
            icerik.setText(BilgiKartlariClass.Bölme[sayac]);
            toplamBilgi = BilgiKartlariClass.Bölme.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Asal Çarpanlara Ayırma")) {
            icerik.setText(BilgiKartlariClass.asal[sayac]);
            toplamBilgi = BilgiKartlariClass.asal.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("EBOB-EKOK")) {
            icerik.setText(BilgiKartlariClass.Ebob[sayac]);
            toplamBilgi = BilgiKartlariClass.Ebob.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Birinci Dereceden Denklemler")) {
            icerik.setText(BilgiKartlariClass.birinci[sayac]);
            toplamBilgi = BilgiKartlariClass.birinci.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Rasyonel Sayılar")) {
            icerik.setText(BilgiKartlariClass.rasyonel[sayac]);
            toplamBilgi = BilgiKartlariClass.rasyonel.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Eşitsizlikler")) {
            icerik.setText(BilgiKartlariClass.Esitsizlikler[sayac]);
            toplamBilgi = BilgiKartlariClass.Esitsizlikler.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Mutlak Değer")) {
            icerik.setText(BilgiKartlariClass.mutlak[sayac]);
            toplamBilgi = BilgiKartlariClass.mutlak.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Üslü Sayılar")) {
            icerik.setText(BilgiKartlariClass.uslu[sayac]);
            toplamBilgi = BilgiKartlariClass.uslu.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Köklü Sayılar")) {
            icerik.setText(BilgiKartlariClass.koklu[sayac]);
            toplamBilgi = BilgiKartlariClass.koklu.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Çarpanlarına Ayırma")) {
            icerik.setText(BilgiKartlariClass.carpanlar[sayac]);
            toplamBilgi = BilgiKartlariClass.carpanlar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Oran-Orantı")) {
            icerik.setText(BilgiKartlariClass.oran[sayac]);
            toplamBilgi = BilgiKartlariClass.oran.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Problemler")) {
            icerik.setText(BilgiKartlariClass.problemler[sayac]);
            toplamBilgi = BilgiKartlariClass.problemler.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Kümeler")) {
            icerik.setText(BilgiKartlariClass.Kümeler[sayac]);
            toplamBilgi = BilgiKartlariClass.Kümeler.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İşlem ve Modüler Aritmetik")) {
            icerik.setText(BilgiKartlariClass.ort[sayac]);
            toplamBilgi = BilgiKartlariClass.ort.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Permütasyon – Kombinasyon - Binom")) {
            icerik.setText(BilgiKartlariClass.Per[sayac]);
            toplamBilgi = BilgiKartlariClass.Per.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Olasılık")) {
            icerik.setText(BilgiKartlariClass.olasılık[sayac]);
            toplamBilgi = BilgiKartlariClass.olasılık.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Tablo ve Grafikler")) {
            icerik.setText(BilgiKartlariClass.tablo[sayac]);
            toplamBilgi = BilgiKartlariClass.tablo.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Sayısal Mantık")) {
            icerik.setText(BilgiKartlariClass.sayisalMantik[sayac]);
            toplamBilgi = BilgiKartlariClass.sayisalMantik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Geometri")) {
            icerik.setText(BilgiKartlariClass.geometri[sayac]);
            toplamBilgi = BilgiKartlariClass.geometri.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Polinomlar")) {
            icerik.setText(BilgiKartlariClass.Polinomlar[sayac]);
            toplamBilgi = BilgiKartlariClass.Polinomlar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İstatistik")) {
            icerik.setText(BilgiKartlariClass.istatistik[sayac]);
            toplamBilgi = BilgiKartlariClass.istatistik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("2.Dereceden Denklemler")) {
            icerik.setText(BilgiKartlariClass.İkinciDerece[sayac]);
            toplamBilgi = BilgiKartlariClass.İkinciDerece.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Sözcükte Anlam")) {
            icerik.setText(BilgiKartlariClass.SözcükteAnlam[sayac]);
            toplamBilgi = BilgiKartlariClass.SözcükteAnlam.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Cümlede Anlam")) {
            icerik.setText(BilgiKartlariClass.CümledeAnlam[sayac]);
            toplamBilgi = BilgiKartlariClass.CümledeAnlam.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Paragrafta Anlam")) {
            icerik.setText(BilgiKartlariClass.ParagraftaAnlam[sayac]);
            toplamBilgi = BilgiKartlariClass.ParagraftaAnlam.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Ses Bilgisi")) {
            icerik.setText(BilgiKartlariClass.SesBilgisi[sayac]);
            toplamBilgi = BilgiKartlariClass.SesBilgisi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Anlatım Bozuklukları")) {
            icerik.setText(BilgiKartlariClass.AnlatimBozukluklari[sayac]);
            toplamBilgi = BilgiKartlariClass.AnlatimBozukluklari.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Yapı Bilgisi")) {
            icerik.setText(BilgiKartlariClass.YapiBilgis[sayac]);
            toplamBilgi = BilgiKartlariClass.YapiBilgis.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Sözcük Türleri")) {
            icerik.setText(BilgiKartlariClass.SozcukTurleri[sayac]);
            toplamBilgi = BilgiKartlariClass.SozcukTurleri.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Cümle Bilgisi")) {
            icerik.setText(BilgiKartlariClass.CumleBilgisi[sayac]);
            toplamBilgi = BilgiKartlariClass.CumleBilgisi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Yazım Kuralları")) {
            icerik.setText(BilgiKartlariClass.YazimKurallari[sayac]);
            toplamBilgi = BilgiKartlariClass.YazimKurallari.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Noktalama İşaretleri")) {
            icerik.setText(BilgiKartlariClass.NoktalamaIsaretleri[sayac]);
            toplamBilgi = BilgiKartlariClass.NoktalamaIsaretleri.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Edat Bağlaç Ünlem")) {
            icerik.setText(BilgiKartlariClass.edatbaglac[sayac]);
            toplamBilgi = BilgiKartlariClass.edatbaglac.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Fiiller")) {
            icerik.setText(BilgiKartlariClass.fiiller[sayac]);
            toplamBilgi = BilgiKartlariClass.fiiller.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Ek Fiiller")) {
            icerik.setText(BilgiKartlariClass.ekfiiller[sayac]);
            toplamBilgi = BilgiKartlariClass.ekfiiller.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Fiillerde Çatı")) {
            icerik.setText(BilgiKartlariClass.fiildecatı[sayac]);
            toplamBilgi = BilgiKartlariClass.fiildecatı.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Fiilimsi")) {
            icerik.setText(BilgiKartlariClass.fiilimsi[sayac]);
            toplamBilgi = BilgiKartlariClass.fiilimsi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İslamiyet Öncesi Türk Tarihi")) {
            icerik.setText(BilgiKartlariClass.IslamiyetOncesi[sayac]);
            toplamBilgi = BilgiKartlariClass.IslamiyetOncesi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İlk Türk İslam Devletleri")) {
            icerik.setText(BilgiKartlariClass.IlkTurkIslamDevletleri[sayac]);
            toplamBilgi = BilgiKartlariClass.IlkTurkIslamDevletleri.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Anadolu Selçuklu Dönemi ve Beylikler Dönemi")) {
            icerik.setText(BilgiKartlariClass.AnadoluSelcuklu[sayac]);
            toplamBilgi = BilgiKartlariClass.AnadoluSelcuklu.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Türk-İslam Devletlerinde Kültür ve Medeniyet")) {
            System.out.println("şuan burada");
            icerik.setText(BilgiKartlariClass.KulturVeMedeniyet[sayac]);
            toplamBilgi = BilgiKartlariClass.KulturVeMedeniyet.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Osmanlı Devleti Kuruluş Dönemi")) {
            icerik.setText(BilgiKartlariClass.Kurtulus[sayac]);
            toplamBilgi = BilgiKartlariClass.Kurtulus.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Osmanlı Devleti Yükselme Dönemi")) {
            icerik.setText(BilgiKartlariClass.OsmanlıYukselis[sayac]);
            toplamBilgi = BilgiKartlariClass.OsmanlıYukselis.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("17. Yüzyılda Osmanlı Devleti Duraklama Dönemi")) {
            icerik.setText(BilgiKartlariClass.DuraklamaDonemi[sayac]);
            toplamBilgi = BilgiKartlariClass.DuraklamaDonemi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("18. Yüzyılda Osmanlı Devleti Gerileme Dönemi ve Islahatları")) {
            icerik.setText(BilgiKartlariClass.GerilemeDonemi[sayac]);
            toplamBilgi = BilgiKartlariClass.GerilemeDonemi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("19. Yüzyılda Osmanlı Devleti Dağılma Dönemi ve Islahatları")) {
            icerik.setText(BilgiKartlariClass.DagilmaDonemi[sayac]);
            toplamBilgi = BilgiKartlariClass.DagilmaDonemi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("20. Yüzyılda Osmanlı Devleti")) {
            icerik.setText(BilgiKartlariClass.SonDonem[sayac]);
            toplamBilgi = BilgiKartlariClass.SonDonem.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Kurtuluş Savaşı Hazırlık Dönemi")) {
            icerik.setText(BilgiKartlariClass.Kurtulus[sayac]);
            toplamBilgi = BilgiKartlariClass.Kurtulus.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("I. TBMM Dönemi ve Ayaklanmalar")) {
            icerik.setText(BilgiKartlariClass.TbmmAyaklamalar[sayac]);
            toplamBilgi = BilgiKartlariClass.TbmmAyaklamalar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Kurtuluş Savaşı Muharebeler ve Antlaşmalar Dönemi")) {
            icerik.setText(BilgiKartlariClass.KurtulusSavasiAnlasmalar[sayac]);
            toplamBilgi = BilgiKartlariClass.KurtulusSavasiAnlasmalar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Cumhuriyet Dönemi")) {
            icerik.setText(BilgiKartlariClass.CumhuriyetDonemiNotlar[sayac]);
            toplamBilgi = BilgiKartlariClass.CumhuriyetDonemiNotlar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Atatürk Dönemi Türk İç ve Dış Politikası")) {
            icerik.setText(BilgiKartlariClass.IcveDis[sayac]);
            toplamBilgi = BilgiKartlariClass.IcveDis.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Atatürk İlkeleri")) {
            icerik.setText(BilgiKartlariClass.AtaturkIlkeleri[sayac]);
            toplamBilgi = BilgiKartlariClass.AtaturkIlkeleri.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Çağdaş Türk ve Dünya Tarihi")) {
            icerik.setText(BilgiKartlariClass.CagdasDunyaTarihi[sayac]);
            toplamBilgi = BilgiKartlariClass.CagdasDunyaTarihi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Uygarlığın Doğuşu ve İlk Uygarlıklar")) {
            icerik.setText(BilgiKartlariClass.uygarlık[sayac]);
            toplamBilgi = BilgiKartlariClass.uygarlık.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Tarih Bilimi")) {
            icerik.setText(BilgiKartlariClass.tarihBilimi[sayac]);
            toplamBilgi = BilgiKartlariClass.tarihBilimi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Ülkeler Coğrafyası")) {
            icerik.setText(BilgiKartlariClass.UlkelerCografyasiBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.UlkelerCografyasiBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Coğrafi Konum")) {
            icerik.setText(BilgiKartlariClass.CografiKonumBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.CografiKonumBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Dünyanın Şekli ve Hareketleri")) {
            icerik.setText(BilgiKartlariClass.DunyaSekliBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.DunyaSekliBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Harita Bilgisi")) {
            icerik.setText(BilgiKartlariClass.HaritaBilgisiBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.HaritaBilgisiBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İklim")) {
            icerik.setText(BilgiKartlariClass.İklimBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.İklimBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İç ve Dış Kuvvetler")) {
            icerik.setText(BilgiKartlariClass.IcDisKuvvetlerBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.IcDisKuvvetlerBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Türkiye’nin Beşeri Özellikleri")) {
            icerik.setText(BilgiKartlariClass.BeseriBilgiler[sayac]);
            toplamBilgi = BilgiKartlariClass.BeseriBilgiler.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Türkiyenin Ekonomik Coğrafyası")) {
            icerik.setText(BilgiKartlariClass.EkonomikBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.EkonomikBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Türkiye’nin Coğrafi Bölgeleri")) {
            icerik.setText(BilgiKartlariClass.CografiBolgeleriBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.CografiBolgeleriBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Doğal Afetler")) {
            icerik.setText(BilgiKartlariClass.DogalAfetler[sayac]);
            toplamBilgi = BilgiKartlariClass.DogalAfetler.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Ulaşım Yolları")) {
            icerik.setText(BilgiKartlariClass.Ulasım[sayac]);
            toplamBilgi = BilgiKartlariClass.Ulasım.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Yerleşmeler")) {
            icerik.setText(BilgiKartlariClass.Yerleşme[sayac]);
            toplamBilgi = BilgiKartlariClass.Yerleşme.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Göç")) {
            icerik.setText(BilgiKartlariClass.Goc[sayac]);
            toplamBilgi = BilgiKartlariClass.Goc.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Nüfus")) {
            icerik.setText(BilgiKartlariClass.Nufus[sayac]);
            toplamBilgi = BilgiKartlariClass.Nufus.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Bitkiler")) {
            icerik.setText(BilgiKartlariClass.Bitkiler[sayac]);
            toplamBilgi = BilgiKartlariClass.Bitkiler.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Topraklar")) {
            icerik.setText(BilgiKartlariClass.Topraklar[sayac]);
            toplamBilgi = BilgiKartlariClass.Topraklar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Su Kaynakları")) {
            icerik.setText(BilgiKartlariClass.SuKay[sayac]);
            toplamBilgi = BilgiKartlariClass.SuKay.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Yerin Şekillenmesi")) {
            icerik.setText(BilgiKartlariClass.YerSekilleri[sayac]);
            toplamBilgi = BilgiKartlariClass.YerSekilleri.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Türkiye'nin İklimi")) {
            icerik.setText(BilgiKartlariClass.trİklim[sayac]);
            toplamBilgi = BilgiKartlariClass.trİklim.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İklim Tipleri ve Bitki Örtüsü")) {
            icerik.setText(BilgiKartlariClass.İklimBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.İklimBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Nemlilik ve Yağış")) {
            icerik.setText(BilgiKartlariClass.nemlilik[sayac]);
            toplamBilgi = BilgiKartlariClass.nemlilik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Basınç ve Rüzgarlar")) {
            icerik.setText(BilgiKartlariClass.BasincVe[sayac]);
            toplamBilgi = BilgiKartlariClass.BasincVe.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Sıcaklık")) {
            icerik.setText(BilgiKartlariClass.sicaklik[sayac]);
            toplamBilgi = BilgiKartlariClass.sicaklik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Doğa ve İnsan")) {
            icerik.setText(BilgiKartlariClass.dogaveinsan[sayac]);
            toplamBilgi = BilgiKartlariClass.dogaveinsan.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Fizik Bilimine Giriş")) {
            icerik.setText(BilgiKartlariClass.FizikGiris[sayac]);
            toplamBilgi = BilgiKartlariClass.FizikGiris.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Madde ve Özellikleri")) {
            icerik.setText(BilgiKartlariClass.MaddeveOz[sayac]);
            toplamBilgi = BilgiKartlariClass.MaddeveOz.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Basınç ve Kaldırma Kuvveti")) {
            icerik.setText(BilgiKartlariClass.basinc[sayac]);
            toplamBilgi = BilgiKartlariClass.basinc.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Isı ve Sıcaklık")) {
            icerik.setText(BilgiKartlariClass.isi[sayac]);
            toplamBilgi = BilgiKartlariClass.isi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Enerji")) {
            icerik.setText(BilgiKartlariClass.enerji[sayac]);
            toplamBilgi = BilgiKartlariClass.enerji.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Elektrostatik")) {
            icerik.setText(BilgiKartlariClass.elektrostatik[sayac]);
            toplamBilgi = BilgiKartlariClass.elektrostatik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Hareket ve Kuvvet")) {
            icerik.setText(BilgiKartlariClass.haraket[sayac]);
            toplamBilgi = BilgiKartlariClass.haraket.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Elektrik ve Manyetizma")) {
            icerik.setText(BilgiKartlariClass.elektrik[sayac]);
            toplamBilgi = BilgiKartlariClass.elektrik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Optik")) {
            icerik.setText(BilgiKartlariClass.optik[sayac]);
            toplamBilgi = BilgiKartlariClass.optik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Dalgalar")) {
            icerik.setText(BilgiKartlariClass.dalgalar[sayac]);
            toplamBilgi = BilgiKartlariClass.dalgalar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Dünya ve Uzay")) {
            icerik.setText(BilgiKartlariClass.dunyaveuzay[sayac]);
            toplamBilgi = BilgiKartlariClass.dunyaveuzay.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Basit Makineler")) {
            icerik.setText(BilgiKartlariClass.basitmakineler[sayac]);
            toplamBilgi = BilgiKartlariClass.basitmakineler.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Kimya Bilimi")) {
            icerik.setText(BilgiKartlariClass.Kimyabil[sayac]);
            toplamBilgi = BilgiKartlariClass.Kimyabil.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Atom ve Periyodik Sistem")) {
            icerik.setText(BilgiKartlariClass.atomveperiyot[sayac]);
            toplamBilgi = BilgiKartlariClass.atomveperiyot.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Modern Atom Teorisi")) {
            icerik.setText(BilgiKartlariClass.modern[sayac]);
            toplamBilgi = BilgiKartlariClass.modern.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Kimyasal Türler Arası Tepkimeler")) {
            icerik.setText(BilgiKartlariClass.tepkime[sayac]);
            toplamBilgi = BilgiKartlariClass.tepkime.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Mol Kavramı")) {
            icerik.setText(BilgiKartlariClass.mol[sayac]);
            toplamBilgi = BilgiKartlariClass.mol.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Kimyasal Hesaplamalar")) {
            icerik.setText(BilgiKartlariClass.kimyasalhesap[sayac]);
            toplamBilgi = BilgiKartlariClass.kimyasalhesap.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Asit, Baz ve Tuz")) {
            icerik.setText(BilgiKartlariClass.asitvebaz[sayac]);
            toplamBilgi = BilgiKartlariClass.asitvebaz.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Maddenin Halleri")) {
            icerik.setText(BilgiKartlariClass.maddeninHalleri[sayac]);
            toplamBilgi = BilgiKartlariClass.maddeninHalleri.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Karışımlar")) {
            icerik.setText(BilgiKartlariClass.karisimlar[sayac]);
            toplamBilgi = BilgiKartlariClass.karisimlar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Endüstride ve Canlılarda Enerji")) {
            icerik.setText(BilgiKartlariClass.canlilar[sayac]);
            toplamBilgi = BilgiKartlariClass.canlilar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Kimya Her Yerde")) {
            icerik.setText(BilgiKartlariClass.kimyaher[sayac]);
            toplamBilgi = BilgiKartlariClass.kimyaher.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Biyoloji Bilimi")) {
            icerik.setText(BilgiKartlariClass.biyolojiBilimi[sayac]);
            toplamBilgi = BilgiKartlariClass.biyolojiBilimi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Canlıların Yapısında Bulunan Temel Bileşenler")) {
            icerik.setText(BilgiKartlariClass.canlilarinyapisi[sayac]);
            toplamBilgi = BilgiKartlariClass.canlilarinyapisi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Hücrenin Yapısı ve İşlevi")) {
            icerik.setText(BilgiKartlariClass.hucre[sayac]);
            toplamBilgi = BilgiKartlariClass.hucre.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Canlıların Çeşitliliği ve Sınıflandırması")) {
            icerik.setText(BilgiKartlariClass.cablicesitliligi[sayac]);
            toplamBilgi = BilgiKartlariClass.cablicesitliligi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Hücre Bölünmesi ve Üreme")) {
            icerik.setText(BilgiKartlariClass.hucrebolunmesi[sayac]);
            toplamBilgi = BilgiKartlariClass.hucrebolunmesi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İnsanda Üreme Sistemi")) {
            icerik.setText(BilgiKartlariClass.insandaureme[sayac]);
            toplamBilgi = BilgiKartlariClass.insandaureme.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Kalıtım")) {
            icerik.setText(BilgiKartlariClass.kalitim[sayac]);
            toplamBilgi = BilgiKartlariClass.kalitim.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Modern Genetik Uygulamaları")) {
            icerik.setText(BilgiKartlariClass.moderngenetik[sayac]);
            toplamBilgi = BilgiKartlariClass.moderngenetik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Ekosistem Ekolojisi")) {
            icerik.setText(BilgiKartlariClass.ekosistem[sayac]);
            toplamBilgi = BilgiKartlariClass.ekosistem.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Canlılarda Enerji Dönüşümü")) {
            icerik.setText(BilgiKartlariClass.cablilardaenerjidon[sayac]);
            toplamBilgi = BilgiKartlariClass.cablilardaenerjidon.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Solunum")) {
            icerik.setText(BilgiKartlariClass.solunum[sayac]);
            toplamBilgi = BilgiKartlariClass.solunum.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İnsan Fizyolojisi")) {
            icerik.setText(BilgiKartlariClass.insanfizyolojisi[sayac]);
            toplamBilgi = BilgiKartlariClass.insanfizyolojisi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Kominite ve Popülasyon Ekolojisi")) {
            icerik.setText(BilgiKartlariClass.populasyon[sayac]);
            toplamBilgi = BilgiKartlariClass.populasyon.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Hayatın Başlangıcı ve Evrim")) {
            icerik.setText(BilgiKartlariClass.evrim[sayac]);
            toplamBilgi = BilgiKartlariClass.evrim.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Felsefe’nin Konusu")) {
            icerik.setText(BilgiKartlariClass.felsefekonusu[sayac]);
            toplamBilgi = BilgiKartlariClass.felsefekonusu.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Bilgi Felsefesi")) {
            icerik.setText(BilgiKartlariClass.bilgifelsefesi[sayac]);
            toplamBilgi = BilgiKartlariClass.bilgifelsefesi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Bilim Felsefesi")) {
            icerik.setText(BilgiKartlariClass.bilimfelsefesi[sayac]);
            toplamBilgi = BilgiKartlariClass.bilimfelsefesi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Varlık Felsefesi")) {
            icerik.setText(BilgiKartlariClass.varlıkFelsefesi[sayac]);
            toplamBilgi = BilgiKartlariClass.varlıkFelsefesi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Ahlak Felsefesi")) {
            icerik.setText(BilgiKartlariClass.ahlakfelsefesi[sayac]);
            toplamBilgi = BilgiKartlariClass.ahlakfelsefesi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Sanat Felsefesi")) {
            icerik.setText(BilgiKartlariClass.sanatFelsefesi[sayac]);
            toplamBilgi = BilgiKartlariClass.sanatFelsefesi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Din Felsefesi")) {
            icerik.setText(BilgiKartlariClass.dinFelsefesi[sayac]);
            toplamBilgi = BilgiKartlariClass.dinFelsefesi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Siyaset Felsefesi")) {
            icerik.setText(BilgiKartlariClass.siyasefFelsefesi[sayac]);
            toplamBilgi = BilgiKartlariClass.siyasefFelsefesi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Bilgi ve İnanç")) {
            icerik.setText(BilgiKartlariClass.inanc[sayac]);
            toplamBilgi = BilgiKartlariClass.inanc.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İnsan ve Din")) {
            icerik.setText(BilgiKartlariClass.insanvedin[sayac]);
            toplamBilgi = BilgiKartlariClass.insanvedin.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İslam ve İbadetler")) {
            icerik.setText(BilgiKartlariClass.islamveibadet[sayac]);
            toplamBilgi = BilgiKartlariClass.islamveibadet.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İslam Düşüncesinde Yorumlar, Mezhepler")) {
            icerik.setText(BilgiKartlariClass.islamdusuncesi[sayac]);
            toplamBilgi = BilgiKartlariClass.islamdusuncesi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Muhammed’in Hayatı, Örnekliği ve Onu Anlama")) {
            icerik.setText(BilgiKartlariClass.HzMuhammed[sayac]);
            toplamBilgi = BilgiKartlariClass.HzMuhammed.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İslam ve Bilim, Estetik, Barış")) {
            icerik.setText(BilgiKartlariClass.islamvebilim[sayac]);
            toplamBilgi = BilgiKartlariClass.islamvebilim.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Yaşayan Dinler ve Benzer Özellikleri")) {
            icerik.setText(BilgiKartlariClass.dinler[sayac]);
            toplamBilgi = BilgiKartlariClass.dinler.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Doğruda ve Üçgende Açılar")) {
            icerik.setText(BilgiKartlariClass.dogruda[sayac]);
            toplamBilgi = BilgiKartlariClass.dogruda.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Dik Üçgende Trigonemetrik Bağıntılar")) {
            icerik.setText(BilgiKartlariClass.dik[sayac]);
            toplamBilgi = BilgiKartlariClass.dik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("İkizkenar ve Eşkenar Üçgen")) {
            icerik.setText(BilgiKartlariClass.ikiz[sayac]);
            toplamBilgi = BilgiKartlariClass.ikiz.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Üçgende Alanlar")) {
            icerik.setText(BilgiKartlariClass.ucgenalan[sayac]);
            toplamBilgi = BilgiKartlariClass.ucgenalan.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Üçgende Açıortay Bağıntıları")) {
            icerik.setText(BilgiKartlariClass.ucgenaciortay[sayac]);
            toplamBilgi = BilgiKartlariClass.ucgenaciortay.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Üçgende Kenarortay Bağıntıları")) {
            icerik.setText(BilgiKartlariClass.ucgenkenarort[sayac]);
            toplamBilgi = BilgiKartlariClass.ucgenkenarort.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Üçgende Eşlik ve Benzerlik")) {
            icerik.setText(BilgiKartlariClass.ucgendeeslik[sayac]);
            toplamBilgi = BilgiKartlariClass.ucgendeeslik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Üçgende Açı-Kenar Bağıntıları")) {
            icerik.setText(BilgiKartlariClass.ucgendeacikenar[sayac]);
            toplamBilgi = BilgiKartlariClass.ucgendeacikenar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Çokgenler")) {
            icerik.setText(BilgiKartlariClass.cokgen[sayac]);
            toplamBilgi = BilgiKartlariClass.cokgen.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Dörtgenler")) {
            icerik.setText(BilgiKartlariClass.dortgen[sayac]);
            toplamBilgi = BilgiKartlariClass.dortgen.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Yamuk")) {
            icerik.setText(BilgiKartlariClass.yamuk[sayac]);
            toplamBilgi = BilgiKartlariClass.yamuk.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Paralelkenar")) {
            icerik.setText(BilgiKartlariClass.paralel[sayac]);
            toplamBilgi = BilgiKartlariClass.paralel.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Eşkenar Dörtgen – Deltoid - Dikdörtgen")) {
            icerik.setText(BilgiKartlariClass.eskenardortgen[sayac]);
            toplamBilgi = BilgiKartlariClass.eskenardortgen.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Çemberde Açılar")) {
            icerik.setText(BilgiKartlariClass.cemberdeacı[sayac]);
            toplamBilgi = BilgiKartlariClass.cemberdeacı.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Çemberde Uzunluk")) {
            icerik.setText(BilgiKartlariClass.cemberdeuzun[sayac]);
            toplamBilgi = BilgiKartlariClass.cemberdeuzun.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Daire")) {
            icerik.setText(BilgiKartlariClass.daire[sayac]);
            toplamBilgi = BilgiKartlariClass.daire.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Prizmalar")) {
            icerik.setText(BilgiKartlariClass.prizma[sayac]);
            toplamBilgi = BilgiKartlariClass.prizma.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Piramitler")) {
            icerik.setText(BilgiKartlariClass.piramit[sayac]);
            toplamBilgi = BilgiKartlariClass.piramit.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Küre")) {
            icerik.setText(BilgiKartlariClass.kure[sayac]);
            toplamBilgi = BilgiKartlariClass.kure.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        }else if (secilenKonu.equals("Koordinat Düzlemi ve Noktanın Analitiği")) {
            icerik.setText(BilgiKartlariClass.koordinatduzlemi[sayac]);
            toplamBilgi = BilgiKartlariClass.koordinatduzlemi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        }
    }
    /*
    private void reklamYukle() {
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this, "ca-app-pub-8004413589484378/9524968128", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        mInterstitialAd = null;
                    }
                });
    }*/
}