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
        } else if (secilenKonu.equals("Say??lar")) {
            icerik.setText(BilgiKartlariClass.Sayilar[sayac]);
            toplamBilgi = BilgiKartlariClass.Sayilar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("B??lme-B??l??nebilme Kurallar??")) {
            icerik.setText(BilgiKartlariClass.B??lme[sayac]);
            toplamBilgi = BilgiKartlariClass.B??lme.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Asal ??arpanlara Ay??rma")) {
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
        } else if (secilenKonu.equals("Rasyonel Say??lar")) {
            icerik.setText(BilgiKartlariClass.rasyonel[sayac]);
            toplamBilgi = BilgiKartlariClass.rasyonel.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("E??itsizlikler")) {
            icerik.setText(BilgiKartlariClass.Esitsizlikler[sayac]);
            toplamBilgi = BilgiKartlariClass.Esitsizlikler.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Mutlak De??er")) {
            icerik.setText(BilgiKartlariClass.mutlak[sayac]);
            toplamBilgi = BilgiKartlariClass.mutlak.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??sl?? Say??lar")) {
            icerik.setText(BilgiKartlariClass.uslu[sayac]);
            toplamBilgi = BilgiKartlariClass.uslu.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("K??kl?? Say??lar")) {
            icerik.setText(BilgiKartlariClass.koklu[sayac]);
            toplamBilgi = BilgiKartlariClass.koklu.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??arpanlar??na Ay??rma")) {
            icerik.setText(BilgiKartlariClass.carpanlar[sayac]);
            toplamBilgi = BilgiKartlariClass.carpanlar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Oran-Orant??")) {
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
        } else if (secilenKonu.equals("K??meler")) {
            icerik.setText(BilgiKartlariClass.K??meler[sayac]);
            toplamBilgi = BilgiKartlariClass.K??meler.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("????lem ve Mod??ler Aritmetik")) {
            icerik.setText(BilgiKartlariClass.ort[sayac]);
            toplamBilgi = BilgiKartlariClass.ort.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Perm??tasyon ??? Kombinasyon - Binom")) {
            icerik.setText(BilgiKartlariClass.Per[sayac]);
            toplamBilgi = BilgiKartlariClass.Per.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Olas??l??k")) {
            icerik.setText(BilgiKartlariClass.olas??l??k[sayac]);
            toplamBilgi = BilgiKartlariClass.olas??l??k.length - 1;
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
        } else if (secilenKonu.equals("Say??sal Mant??k")) {
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
        } else if (secilenKonu.equals("??statistik")) {
            icerik.setText(BilgiKartlariClass.istatistik[sayac]);
            toplamBilgi = BilgiKartlariClass.istatistik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("2.Dereceden Denklemler")) {
            icerik.setText(BilgiKartlariClass.??kinciDerece[sayac]);
            toplamBilgi = BilgiKartlariClass.??kinciDerece.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("S??zc??kte Anlam")) {
            icerik.setText(BilgiKartlariClass.S??zc??kteAnlam[sayac]);
            toplamBilgi = BilgiKartlariClass.S??zc??kteAnlam.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("C??mlede Anlam")) {
            icerik.setText(BilgiKartlariClass.C??mledeAnlam[sayac]);
            toplamBilgi = BilgiKartlariClass.C??mledeAnlam.length - 1;
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
        } else if (secilenKonu.equals("Anlat??m Bozukluklar??")) {
            icerik.setText(BilgiKartlariClass.AnlatimBozukluklari[sayac]);
            toplamBilgi = BilgiKartlariClass.AnlatimBozukluklari.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Yap?? Bilgisi")) {
            icerik.setText(BilgiKartlariClass.YapiBilgis[sayac]);
            toplamBilgi = BilgiKartlariClass.YapiBilgis.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("S??zc??k T??rleri")) {
            icerik.setText(BilgiKartlariClass.SozcukTurleri[sayac]);
            toplamBilgi = BilgiKartlariClass.SozcukTurleri.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("C??mle Bilgisi")) {
            icerik.setText(BilgiKartlariClass.CumleBilgisi[sayac]);
            toplamBilgi = BilgiKartlariClass.CumleBilgisi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Yaz??m Kurallar??")) {
            icerik.setText(BilgiKartlariClass.YazimKurallari[sayac]);
            toplamBilgi = BilgiKartlariClass.YazimKurallari.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Noktalama ????aretleri")) {
            icerik.setText(BilgiKartlariClass.NoktalamaIsaretleri[sayac]);
            toplamBilgi = BilgiKartlariClass.NoktalamaIsaretleri.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Edat Ba??la?? ??nlem")) {
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
        } else if (secilenKonu.equals("Fiillerde ??at??")) {
            icerik.setText(BilgiKartlariClass.fiildecat??[sayac]);
            toplamBilgi = BilgiKartlariClass.fiildecat??.length - 1;
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
        } else if (secilenKonu.equals("??slamiyet ??ncesi T??rk Tarihi")) {
            icerik.setText(BilgiKartlariClass.IslamiyetOncesi[sayac]);
            toplamBilgi = BilgiKartlariClass.IslamiyetOncesi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??lk T??rk ??slam Devletleri")) {
            icerik.setText(BilgiKartlariClass.IlkTurkIslamDevletleri[sayac]);
            toplamBilgi = BilgiKartlariClass.IlkTurkIslamDevletleri.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Anadolu Sel??uklu D??nemi ve Beylikler D??nemi")) {
            icerik.setText(BilgiKartlariClass.AnadoluSelcuklu[sayac]);
            toplamBilgi = BilgiKartlariClass.AnadoluSelcuklu.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("T??rk-??slam Devletlerinde K??lt??r ve Medeniyet")) {
            System.out.println("??uan burada");
            icerik.setText(BilgiKartlariClass.KulturVeMedeniyet[sayac]);
            toplamBilgi = BilgiKartlariClass.KulturVeMedeniyet.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Osmanl?? Devleti Kurulu?? D??nemi")) {
            icerik.setText(BilgiKartlariClass.Kurtulus[sayac]);
            toplamBilgi = BilgiKartlariClass.Kurtulus.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Osmanl?? Devleti Y??kselme D??nemi")) {
            icerik.setText(BilgiKartlariClass.Osmanl??Yukselis[sayac]);
            toplamBilgi = BilgiKartlariClass.Osmanl??Yukselis.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("17. Y??zy??lda Osmanl?? Devleti Duraklama D??nemi")) {
            icerik.setText(BilgiKartlariClass.DuraklamaDonemi[sayac]);
            toplamBilgi = BilgiKartlariClass.DuraklamaDonemi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("18. Y??zy??lda Osmanl?? Devleti Gerileme D??nemi ve Islahatlar??")) {
            icerik.setText(BilgiKartlariClass.GerilemeDonemi[sayac]);
            toplamBilgi = BilgiKartlariClass.GerilemeDonemi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("19. Y??zy??lda Osmanl?? Devleti Da????lma D??nemi ve Islahatlar??")) {
            icerik.setText(BilgiKartlariClass.DagilmaDonemi[sayac]);
            toplamBilgi = BilgiKartlariClass.DagilmaDonemi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("20. Y??zy??lda Osmanl?? Devleti")) {
            icerik.setText(BilgiKartlariClass.SonDonem[sayac]);
            toplamBilgi = BilgiKartlariClass.SonDonem.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Kurtulu?? Sava???? Haz??rl??k D??nemi")) {
            icerik.setText(BilgiKartlariClass.Kurtulus[sayac]);
            toplamBilgi = BilgiKartlariClass.Kurtulus.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("I. TBMM D??nemi ve Ayaklanmalar")) {
            icerik.setText(BilgiKartlariClass.TbmmAyaklamalar[sayac]);
            toplamBilgi = BilgiKartlariClass.TbmmAyaklamalar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Kurtulu?? Sava???? Muharebeler ve Antla??malar D??nemi")) {
            icerik.setText(BilgiKartlariClass.KurtulusSavasiAnlasmalar[sayac]);
            toplamBilgi = BilgiKartlariClass.KurtulusSavasiAnlasmalar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Cumhuriyet D??nemi")) {
            icerik.setText(BilgiKartlariClass.CumhuriyetDonemiNotlar[sayac]);
            toplamBilgi = BilgiKartlariClass.CumhuriyetDonemiNotlar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Atat??rk D??nemi T??rk ???? ve D???? Politikas??")) {
            icerik.setText(BilgiKartlariClass.IcveDis[sayac]);
            toplamBilgi = BilgiKartlariClass.IcveDis.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Atat??rk ??lkeleri")) {
            icerik.setText(BilgiKartlariClass.AtaturkIlkeleri[sayac]);
            toplamBilgi = BilgiKartlariClass.AtaturkIlkeleri.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??a??da?? T??rk ve D??nya Tarihi")) {
            icerik.setText(BilgiKartlariClass.CagdasDunyaTarihi[sayac]);
            toplamBilgi = BilgiKartlariClass.CagdasDunyaTarihi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Uygarl??????n Do??u??u ve ??lk Uygarl??klar")) {
            icerik.setText(BilgiKartlariClass.uygarl??k[sayac]);
            toplamBilgi = BilgiKartlariClass.uygarl??k.length - 1;
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
        } else if (secilenKonu.equals("??lkeler Co??rafyas??")) {
            icerik.setText(BilgiKartlariClass.UlkelerCografyasiBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.UlkelerCografyasiBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Co??rafi Konum")) {
            icerik.setText(BilgiKartlariClass.CografiKonumBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.CografiKonumBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("D??nyan??n ??ekli ve Hareketleri")) {
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
        } else if (secilenKonu.equals("??klim")) {
            icerik.setText(BilgiKartlariClass.??klimBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.??klimBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("???? ve D???? Kuvvetler")) {
            icerik.setText(BilgiKartlariClass.IcDisKuvvetlerBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.IcDisKuvvetlerBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("T??rkiye???nin Be??eri ??zellikleri")) {
            icerik.setText(BilgiKartlariClass.BeseriBilgiler[sayac]);
            toplamBilgi = BilgiKartlariClass.BeseriBilgiler.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("T??rkiyenin Ekonomik Co??rafyas??")) {
            icerik.setText(BilgiKartlariClass.EkonomikBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.EkonomikBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("T??rkiye???nin Co??rafi B??lgeleri")) {
            icerik.setText(BilgiKartlariClass.CografiBolgeleriBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.CografiBolgeleriBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Do??al Afetler")) {
            icerik.setText(BilgiKartlariClass.DogalAfetler[sayac]);
            toplamBilgi = BilgiKartlariClass.DogalAfetler.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Ula????m Yollar??")) {
            icerik.setText(BilgiKartlariClass.Ulas??m[sayac]);
            toplamBilgi = BilgiKartlariClass.Ulas??m.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Yerle??meler")) {
            icerik.setText(BilgiKartlariClass.Yerle??me[sayac]);
            toplamBilgi = BilgiKartlariClass.Yerle??me.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("G????")) {
            icerik.setText(BilgiKartlariClass.Goc[sayac]);
            toplamBilgi = BilgiKartlariClass.Goc.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("N??fus")) {
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
        } else if (secilenKonu.equals("Su Kaynaklar??")) {
            icerik.setText(BilgiKartlariClass.SuKay[sayac]);
            toplamBilgi = BilgiKartlariClass.SuKay.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Yerin ??ekillenmesi")) {
            icerik.setText(BilgiKartlariClass.YerSekilleri[sayac]);
            toplamBilgi = BilgiKartlariClass.YerSekilleri.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("T??rkiye'nin ??klimi")) {
            icerik.setText(BilgiKartlariClass.tr??klim[sayac]);
            toplamBilgi = BilgiKartlariClass.tr??klim.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??klim Tipleri ve Bitki ??rt??s??")) {
            icerik.setText(BilgiKartlariClass.??klimBilgi[sayac]);
            toplamBilgi = BilgiKartlariClass.??klimBilgi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Nemlilik ve Ya??????")) {
            icerik.setText(BilgiKartlariClass.nemlilik[sayac]);
            toplamBilgi = BilgiKartlariClass.nemlilik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Bas??n?? ve R??zgarlar")) {
            icerik.setText(BilgiKartlariClass.BasincVe[sayac]);
            toplamBilgi = BilgiKartlariClass.BasincVe.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("S??cakl??k")) {
            icerik.setText(BilgiKartlariClass.sicaklik[sayac]);
            toplamBilgi = BilgiKartlariClass.sicaklik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Do??a ve ??nsan")) {
            icerik.setText(BilgiKartlariClass.dogaveinsan[sayac]);
            toplamBilgi = BilgiKartlariClass.dogaveinsan.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Fizik Bilimine Giri??")) {
            icerik.setText(BilgiKartlariClass.FizikGiris[sayac]);
            toplamBilgi = BilgiKartlariClass.FizikGiris.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Madde ve ??zellikleri")) {
            icerik.setText(BilgiKartlariClass.MaddeveOz[sayac]);
            toplamBilgi = BilgiKartlariClass.MaddeveOz.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Bas??n?? ve Kald??rma Kuvveti")) {
            icerik.setText(BilgiKartlariClass.basinc[sayac]);
            toplamBilgi = BilgiKartlariClass.basinc.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Is?? ve S??cakl??k")) {
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
        } else if (secilenKonu.equals("D??nya ve Uzay")) {
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
        } else if (secilenKonu.equals("Kimyasal T??rler Aras?? Tepkimeler")) {
            icerik.setText(BilgiKartlariClass.tepkime[sayac]);
            toplamBilgi = BilgiKartlariClass.tepkime.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Mol Kavram??")) {
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
        } else if (secilenKonu.equals("Kar??????mlar")) {
            icerik.setText(BilgiKartlariClass.karisimlar[sayac]);
            toplamBilgi = BilgiKartlariClass.karisimlar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("End??stride ve Canl??larda Enerji")) {
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
        } else if (secilenKonu.equals("Canl??lar??n Yap??s??nda Bulunan Temel Bile??enler")) {
            icerik.setText(BilgiKartlariClass.canlilarinyapisi[sayac]);
            toplamBilgi = BilgiKartlariClass.canlilarinyapisi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("H??crenin Yap??s?? ve ????levi")) {
            icerik.setText(BilgiKartlariClass.hucre[sayac]);
            toplamBilgi = BilgiKartlariClass.hucre.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Canl??lar??n ??e??itlili??i ve S??n??fland??rmas??")) {
            icerik.setText(BilgiKartlariClass.cablicesitliligi[sayac]);
            toplamBilgi = BilgiKartlariClass.cablicesitliligi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("H??cre B??l??nmesi ve ??reme")) {
            icerik.setText(BilgiKartlariClass.hucrebolunmesi[sayac]);
            toplamBilgi = BilgiKartlariClass.hucrebolunmesi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??nsanda ??reme Sistemi")) {
            icerik.setText(BilgiKartlariClass.insandaureme[sayac]);
            toplamBilgi = BilgiKartlariClass.insandaureme.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Kal??t??m")) {
            icerik.setText(BilgiKartlariClass.kalitim[sayac]);
            toplamBilgi = BilgiKartlariClass.kalitim.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Modern Genetik Uygulamalar??")) {
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
        } else if (secilenKonu.equals("Canl??larda Enerji D??n??????m??")) {
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
        } else if (secilenKonu.equals("??nsan Fizyolojisi")) {
            icerik.setText(BilgiKartlariClass.insanfizyolojisi[sayac]);
            toplamBilgi = BilgiKartlariClass.insanfizyolojisi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Kominite ve Pop??lasyon Ekolojisi")) {
            icerik.setText(BilgiKartlariClass.populasyon[sayac]);
            toplamBilgi = BilgiKartlariClass.populasyon.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Hayat??n Ba??lang??c?? ve Evrim")) {
            icerik.setText(BilgiKartlariClass.evrim[sayac]);
            toplamBilgi = BilgiKartlariClass.evrim.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Felsefe???nin Konusu")) {
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
        } else if (secilenKonu.equals("Varl??k Felsefesi")) {
            icerik.setText(BilgiKartlariClass.varl??kFelsefesi[sayac]);
            toplamBilgi = BilgiKartlariClass.varl??kFelsefesi.length - 1;
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
        } else if (secilenKonu.equals("Bilgi ve ??nan??")) {
            icerik.setText(BilgiKartlariClass.inanc[sayac]);
            toplamBilgi = BilgiKartlariClass.inanc.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??nsan ve Din")) {
            icerik.setText(BilgiKartlariClass.insanvedin[sayac]);
            toplamBilgi = BilgiKartlariClass.insanvedin.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??slam ve ??badetler")) {
            icerik.setText(BilgiKartlariClass.islamveibadet[sayac]);
            toplamBilgi = BilgiKartlariClass.islamveibadet.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??slam D??????ncesinde Yorumlar, Mezhepler")) {
            icerik.setText(BilgiKartlariClass.islamdusuncesi[sayac]);
            toplamBilgi = BilgiKartlariClass.islamdusuncesi.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Muhammed???in Hayat??, ??rnekli??i ve Onu Anlama")) {
            icerik.setText(BilgiKartlariClass.HzMuhammed[sayac]);
            toplamBilgi = BilgiKartlariClass.HzMuhammed.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??slam ve Bilim, Estetik, Bar????")) {
            icerik.setText(BilgiKartlariClass.islamvebilim[sayac]);
            toplamBilgi = BilgiKartlariClass.islamvebilim.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Ya??ayan Dinler ve Benzer ??zellikleri")) {
            icerik.setText(BilgiKartlariClass.dinler[sayac]);
            toplamBilgi = BilgiKartlariClass.dinler.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Do??ruda ve ????gende A????lar")) {
            icerik.setText(BilgiKartlariClass.dogruda[sayac]);
            toplamBilgi = BilgiKartlariClass.dogruda.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("Dik ????gende Trigonemetrik Ba????nt??lar")) {
            icerik.setText(BilgiKartlariClass.dik[sayac]);
            toplamBilgi = BilgiKartlariClass.dik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??kizkenar ve E??kenar ????gen")) {
            icerik.setText(BilgiKartlariClass.ikiz[sayac]);
            toplamBilgi = BilgiKartlariClass.ikiz.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("????gende Alanlar")) {
            icerik.setText(BilgiKartlariClass.ucgenalan[sayac]);
            toplamBilgi = BilgiKartlariClass.ucgenalan.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("????gende A????ortay Ba????nt??lar??")) {
            icerik.setText(BilgiKartlariClass.ucgenaciortay[sayac]);
            toplamBilgi = BilgiKartlariClass.ucgenaciortay.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("????gende Kenarortay Ba????nt??lar??")) {
            icerik.setText(BilgiKartlariClass.ucgenkenarort[sayac]);
            toplamBilgi = BilgiKartlariClass.ucgenkenarort.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("????gende E??lik ve Benzerlik")) {
            icerik.setText(BilgiKartlariClass.ucgendeeslik[sayac]);
            toplamBilgi = BilgiKartlariClass.ucgendeeslik.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("????gende A????-Kenar Ba????nt??lar??")) {
            icerik.setText(BilgiKartlariClass.ucgendeacikenar[sayac]);
            toplamBilgi = BilgiKartlariClass.ucgendeacikenar.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??okgenler")) {
            icerik.setText(BilgiKartlariClass.cokgen[sayac]);
            toplamBilgi = BilgiKartlariClass.cokgen.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("D??rtgenler")) {
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
        } else if (secilenKonu.equals("E??kenar D??rtgen ??? Deltoid - Dikd??rtgen")) {
            icerik.setText(BilgiKartlariClass.eskenardortgen[sayac]);
            toplamBilgi = BilgiKartlariClass.eskenardortgen.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??emberde A????lar")) {
            icerik.setText(BilgiKartlariClass.cemberdeac??[sayac]);
            toplamBilgi = BilgiKartlariClass.cemberdeac??.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        } else if (secilenKonu.equals("??emberde Uzunluk")) {
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
        } else if (secilenKonu.equals("K??re")) {
            icerik.setText(BilgiKartlariClass.kure[sayac]);
            toplamBilgi = BilgiKartlariClass.kure.length - 1;
            progressBar.setMax(toplamBilgi);
            progressBar.setProgress(sayac);
            if (sayac == toplamBilgi) {
                ileri.setVisibility(View.INVISIBLE);
            }
        }else if (secilenKonu.equals("Koordinat D??zlemi ve Noktan??n Analiti??i")) {
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