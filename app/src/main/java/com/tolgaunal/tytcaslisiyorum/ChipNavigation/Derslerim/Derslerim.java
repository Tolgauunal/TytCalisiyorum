package com.tolgaunal.tytcaslisiyorum.ChipNavigation.Derslerim;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tolgaunal.tytcaslisiyorum.BilgiKartlari.BilgiKartlari;
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKategorileri.DersKategorileri;
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKategorileri.DersKategorileriRecylerViewAdapter;
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKonuları.KonularSinifi;
import com.tolgaunal.tytcaslisiyorum.KonuIcerikActivity;
import com.tolgaunal.tytcaslisiyorum.R;

import java.util.ArrayList;


public class Derslerim extends Fragment implements DersKategorileriRecylerViewAdapter.DerslerListener, DerslerimKonularRecylerviewAdapter.DersKonularListener {
    View view;
    ArrayList<DersKategorileri> dersKatArraylist = new ArrayList<>();
    DersKategorileriRecylerViewAdapter dersKategorileriRecylerViewAdapter;
    RecyclerView dersAdlariRecylerview;
    ArrayList<KonularSinifi> tumKonular = new ArrayList<>();
    DerslerimKonularRecylerviewAdapter tumKonularRecylerViewAdapter;
    RecyclerView tumKonularRecylerview;
    boolean kontrol = false;
    boolean intentKontrol = false;
    String intentDers = "Matematik";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_derslerim, container, false);
        dersAdlariRecylerview = view.findViewById(R.id.DersAdlariRecylerview);

        dersKategorileriRecylerViewAdapter = new DersKategorileriRecylerViewAdapter((AppCompatActivity) getActivity(), this);
        dersKatArraylist = dersKategorileriRecylerViewAdapter.getDersKategorileris();
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        dersAdlariRecylerview.setLayoutManager(layoutManager);
        if (isAdded()) {
            dersAdlariRecylerview.setAdapter(dersKategorileriRecylerViewAdapter);
        }
        tumKonularRecylerViewAdapter = new DerslerimKonularRecylerviewAdapter((AppCompatActivity) getActivity(), this);
        tumKonular = tumKonularRecylerViewAdapter.getDersKonularSinidi();
        tumKonularRecylerview = view.findViewById(R.id.TumKonularRecylerView);
        tumKonularRecylerview.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
        if (isAdded()) {
            tumKonularRecylerview.setAdapter(tumKonularRecylerViewAdapter);
        }
        getDersAdlari(dersKatArraylist);
        getDersKonularSinifi(tumKonular);
        return view;
    }

    private ArrayList<DersKategorileri> getDersAdlari(ArrayList<DersKategorileri> dersKategorileri) {
        dersKategorileri.add(new DersKategorileri("Matematik", R.drawable.matematik, R.drawable.matematikwhite));
        dersKategorileri.add(new DersKategorileri("Türkçe", R.drawable.turkce, R.drawable.turkcewhite));
        dersKategorileri.add(new DersKategorileri("Tarih", R.drawable.tarih, R.drawable.tarihwhite));
        dersKategorileri.add(new DersKategorileri("Coğrafya", R.drawable.cografya, R.drawable.cografyawhite));
        dersKategorileri.add(new DersKategorileri("Biyoloji", R.drawable.biy11, R.drawable.matematikwhite));
        dersKategorileri.add(new DersKategorileri("Fizik", R.drawable.fiz, R.drawable.turkcewhite));
        dersKategorileri.add(new DersKategorileri("Kimya", R.drawable.kim, R.drawable.tarihwhite));
        dersKategorileri.add(new DersKategorileri("Din Kültürü", R.drawable.din, R.drawable.cografyawhite));
        dersKategorileri.add(new DersKategorileri("Felsefe", R.drawable.fel, R.drawable.cografyawhite));
        dersKategorileri.add(new DersKategorileri("Geometri", R.drawable.cografya, R.drawable.cografyawhite));
        return dersKategorileri;
    }

    @Override
    public void derslerListener(DersKategorileri dersKategorileri) {
        tumKonular.clear();
        kontrol = true;
        intentDers = dersKategorileri.getDersAdi();
        intentKontrol = true;
        if (dersKategorileri.getDersAdi().matches("Matematik")) {
            tumKonular.add(new KonularSinifi("Temel Kavramlar", R.drawable.matematik1, "Matematik"));
            tumKonular.add(new KonularSinifi("Sayılar", R.drawable.matematik12, "Matematik"));
            tumKonular.add(new KonularSinifi("Bölme-Bölünebilme Kuralları", R.drawable.matematik3, "Matematik"));
            tumKonular.add(new KonularSinifi("Asal Çarpanlara Ayırma", R.drawable.matematik4, "Matematik"));
            tumKonular.add(new KonularSinifi("EBOB-EKOK", R.drawable.matematik5, "Matematik"));
            tumKonular.add(new KonularSinifi("Birinci Dereceden Denklemler", R.drawable.matematik6, "Matematik"));
            tumKonular.add(new KonularSinifi("Rasyonel Sayılar", R.drawable.matematik2, "Matematik"));
            tumKonular.add(new KonularSinifi("Eşitsizlikler", R.drawable.matematik8, "Matematik"));
            tumKonular.add(new KonularSinifi("Mutlak Değer", R.drawable.matematik11, "Matematik"));
            tumKonular.add(new KonularSinifi("Üslü Sayılar", R.drawable.matematik15, "Matematik"));
            tumKonular.add(new KonularSinifi("Köklü Sayılar", R.drawable.matematik18, "Matematik"));
            tumKonular.add(new KonularSinifi("Çarpanlarına Ayırma", R.drawable.matematik7, "Matematik"));
            tumKonular.add(new KonularSinifi("Oran-Orantı", R.drawable.matematik13, "Matematik"));
            tumKonular.add(new KonularSinifi("Problemler", R.drawable.matematik14, "Matematik"));
            tumKonular.add(new KonularSinifi("Kümeler", R.drawable.matematik10, "Matematik"));
            tumKonular.add(new KonularSinifi("Fonksiyonlar", R.drawable.matematik21, "Matematik"));
            tumKonular.add(new KonularSinifi("Permütasyon – Kombinasyon - Binom", R.drawable.matematik17, "Matematik"));
            tumKonular.add(new KonularSinifi("Olasılık", R.drawable.matematik22, "Matematik"));
            tumKonular.add(new KonularSinifi("İstatistik", R.drawable.matematik16, "Matematik"));
            tumKonular.add(new KonularSinifi("2.Dereceden Denklemler", R.drawable.matematik19, "Matematik"));
            tumKonular.add(new KonularSinifi("Polinomlar", R.drawable.matematik20, "Matematik"));
        } else if (dersKategorileri.getDersAdi().matches("Türkçe")) {
            tumKonular.add(new KonularSinifi("Sözcükte Anlam", R.drawable.turkce3, "Türkçe"));
            tumKonular.add(new KonularSinifi("Cümlede Anlam", R.drawable.turkce11, "Türkçe"));
            tumKonular.add(new KonularSinifi("Paragrafta Anlam", R.drawable.turkce12, "Türkçe"));
            tumKonular.add(new KonularSinifi("Ses Bilgisi", R.drawable.turkce9, "Türkçe"));
            tumKonular.add(new KonularSinifi("Yazım Kuralları", R.drawable.turkce1, "Türkçe"));
            tumKonular.add(new KonularSinifi("Noktalama İşaretleri", R.drawable.turkce4, "Türkçe"));
            tumKonular.add(new KonularSinifi("Yapı Bilgisi", R.drawable.turkce5, "Türkçe"));
            tumKonular.add(new KonularSinifi("Sözcük Türleri", R.drawable.turkce8, "Türkçe"));
            tumKonular.add(new KonularSinifi("Edat Bağlaç Ünlem", R.drawable.turkce7, "Türkçe"));
            tumKonular.add(new KonularSinifi("Fiiller", R.drawable.turkce6, "Türkçe"));
            tumKonular.add(new KonularSinifi("Ek Fiiller", R.drawable.turkce14, "Türkçe"));
            tumKonular.add(new KonularSinifi("Fiillerde Çatı", R.drawable.turkce13, "Türkçe"));
            tumKonular.add(new KonularSinifi("Fiilimsi", R.drawable.turkce10, "Türkçe"));
            tumKonular.add(new KonularSinifi("Anlatım Bozuklukları", R.drawable.turkce2, "Türkçe"));
            tumKonular.add(new KonularSinifi("Cümle Bilgisi", R.drawable.turkce7, "Türkçe"));

        } else if (dersKategorileri.getDersAdi().matches("Tarih")) {
            tumKonular.add(new KonularSinifi("Tarih Bilimi", R.drawable.tarih17, "Tarih"));
            tumKonular.add(new KonularSinifi("Uygarlığın Doğuşu ve İlk Uygarlıklar", R.drawable.tarih18, "Tarih"));
            tumKonular.add(new KonularSinifi("İslamiyet Öncesi Türk Tarihi", R.drawable.tarih1, "Tarih"));
            tumKonular.add(new KonularSinifi("İlk Türk İslam Devletleri", R.drawable.tarih2, "Tarih"));
            tumKonular.add(new KonularSinifi("Anadolu Selçuklu Dönemi ve Beylikler Dönemi", R.drawable.tarih3, "Tarih"));
            tumKonular.add(new KonularSinifi("Türk-İslam Devletlerinde Kültür ve Medeniyet", R.drawable.tarih4, "Tarih"));
            tumKonular.add(new KonularSinifi("Osmanlı Devleti Kuruluş Dönemi", R.drawable.tarih5, "Tarih"));
            tumKonular.add(new KonularSinifi("Osmanlı Devleti Yükselme Dönemi", R.drawable.tarih6, "Tarih"));
            tumKonular.add(new KonularSinifi("17. Yüzyılda Osmanlı Devleti Duraklama Dönemi", R.drawable.tarih7, "Tarih"));
            tumKonular.add(new KonularSinifi("18. Yüzyılda Osmanlı Devleti Gerileme Dönemi ve Islahatları", R.drawable.tarih8, "Tarih"));
            tumKonular.add(new KonularSinifi("19. Yüzyılda Osmanlı Devleti Dağılma Dönemi ve Islahatları", R.drawable.tarih9, "Tarih"));
            tumKonular.add(new KonularSinifi("20. Yüzyılda Osmanlı Devleti", R.drawable.tarih10, "Tarih"));
            tumKonular.add(new KonularSinifi("Kurtuluş Savaşı Hazırlık Dönemi", R.drawable.tarih11, "Tarih"));
            tumKonular.add(new KonularSinifi("I. TBMM Dönemi ve Ayaklanmalar", R.drawable.tarih12, "Tarih"));
            tumKonular.add(new KonularSinifi("Kurtuluş Savaşı Muharebeler ve Antlaşmalar Dönemi", R.drawable.tarih13, "Tarih"));
            tumKonular.add(new KonularSinifi("Cumhuriyet Dönemi", R.drawable.tarih14, "Tarih"));
            tumKonular.add(new KonularSinifi("Atatürk Dönemi Türk İç ve Dış Politikası", R.drawable.tarih15, "Tarih"));
            tumKonular.add(new KonularSinifi("Atatürk İlkeleri", R.drawable.tarih16, "Tarih"));
        } else if (dersKategorileri.getDersAdi().matches("Coğrafya")) {
            tumKonular.add(new KonularSinifi("Doğa ve İnsan", R.drawable.cografya10, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Harita Bilgisi", R.drawable.cografya4, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Coğrafi Konum", R.drawable.cografya5, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Dünyanın Şekli ve Hareketleri", R.drawable.cografya3, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Sıcaklık", R.drawable.cografya11, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Basınç ve Rüzgarlar", R.drawable.cografya12, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Nemlilik ve Yağış", R.drawable.cografya13, "Coğrafya"));
            tumKonular.add(new KonularSinifi("İklim Tipleri ve Bitki Örtüsü", R.drawable.cografya14, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Türkiye'nin İklimi", R.drawable.cografya5, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Yerin Şekillenmesi", R.drawable.cografya15, "Coğrafya"));
            tumKonular.add(new KonularSinifi("İç ve Dış Kuvvetler", R.drawable.cografya6, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Su Kaynakları", R.drawable.cografya16, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Topraklar", R.drawable.cografya18, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Bitkiler", R.drawable.cografya17, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Nüfus", R.drawable.cografya19, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Göç", R.drawable.cografya20, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Yerleşmeler", R.drawable.cografya21, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Ülkeler Coğrafyası", R.drawable.cografya22, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Ulaşım Yolları", R.drawable.cografya25, "Coğrafya"));
            tumKonular.add(new KonularSinifi("Doğal Afetler", R.drawable.cografya23, "Coğrafya"));
        } else if (dersKategorileri.getDersAdi().matches("Geometri")) {
            tumKonular.add(new KonularSinifi("Doğruda ve Üçgende Açılar", R.drawable.geo1, "Geometri"));
            tumKonular.add(new KonularSinifi("Dik Üçgende Trigonemetrik Bağıntılar", R.drawable.geo3, "Geometri"));
            tumKonular.add(new KonularSinifi("İkizkenar ve Eşkenar Üçgen", R.drawable.geo4, "Geometri"));
            tumKonular.add(new KonularSinifi("Üçgende Alanlar", R.drawable.geo5, "Geometri"));
            tumKonular.add(new KonularSinifi("Üçgende Açıortay Bağıntıları", R.drawable.geo6, "Geometri"));
            tumKonular.add(new KonularSinifi("Üçgende Kenarortay Bağıntıları", R.drawable.geo7, "Geometri"));
            tumKonular.add(new KonularSinifi("Üçgende Eşlik ve Benzerlik", R.drawable.geo8, "Geometri"));
            tumKonular.add(new KonularSinifi("Üçgende Açı-Kenar Bağıntıları", R.drawable.geo9, "Geometri"));
            tumKonular.add(new KonularSinifi("Çokgenler", R.drawable.geo10, "Geometri"));
            tumKonular.add(new KonularSinifi("Dörtgenler", R.drawable.geo11, "Geometri"));
            tumKonular.add(new KonularSinifi("Yamuk", R.drawable.geo12, "Geometri"));
            tumKonular.add(new KonularSinifi("Paralelkenar", R.drawable.geo13, "Geometri"));
            tumKonular.add(new KonularSinifi("Eşkenar Dörtgen – Deltoid - Dikdörtgen", R.drawable.geo14, "Geometri"));
            tumKonular.add(new KonularSinifi("Çemberde Açılar", R.drawable.geo16, "Geometri"));
            tumKonular.add(new KonularSinifi("Çemberde Uzunluk", R.drawable.geo17, "Geometri"));
            tumKonular.add(new KonularSinifi("Daire", R.drawable.geo18, "Geometri"));
            tumKonular.add(new KonularSinifi("Prizmalar", R.drawable.geo19, "Geometri"));
            tumKonular.add(new KonularSinifi("Piramitler", R.drawable.geo20, "Geometri"));
            tumKonular.add(new KonularSinifi("Küre", R.drawable.geo21, "Geometri"));
            tumKonular.add(new KonularSinifi("Koordinat Düzlemi ve Noktanın Analitiği", R.drawable.geo22, "Geometri"));
        } else if (dersKategorileri.getDersAdi().matches("Fizik")) {
            tumKonular.add(new KonularSinifi("Fizik Bilimine Giriş", R.drawable.fiz1, "Fizik"));
            tumKonular.add(new KonularSinifi("Madde ve Özellikleri", R.drawable.fiz2, "Fizik"));
            tumKonular.add(new KonularSinifi("Basınç ve Kaldırma Kuvveti", R.drawable.fiz, "Fizik"));
            tumKonular.add(new KonularSinifi("Isı ve Sıcaklık", R.drawable.fiz5, "Fizik"));
            tumKonular.add(new KonularSinifi("Enerji", R.drawable.fiz4, "Fizik"));
            tumKonular.add(new KonularSinifi("Elektrostatik", R.drawable.fiz6, "Fizik"));
            tumKonular.add(new KonularSinifi("Hareket ve Kuvvet", R.drawable.fiz3, "Fizik"));
            tumKonular.add(new KonularSinifi("Elektrik ve Manyetizma", R.drawable.fiz7, "Fizik"));
            tumKonular.add(new KonularSinifi("Optik", R.drawable.fiz9, "Fizik"));
            tumKonular.add(new KonularSinifi("Dalgalar", R.drawable.fiz13, "Fizik"));
            tumKonular.add(new KonularSinifi("Dünya ve Uzay", R.drawable.fiz14, "Fizik"));
            tumKonular.add(new KonularSinifi("Basit Makineler", R.drawable.fiz12, "Fizik"));
        } else if (dersKategorileri.getDersAdi().matches("Kimya")) {
            tumKonular.add(new KonularSinifi("Kimya Bilimi", R.drawable.kim1, "Kimya"));
            tumKonular.add(new KonularSinifi("Atom ve Periyodik Sistem", R.drawable.kim2, "Kimya"));
            tumKonular.add(new KonularSinifi("Modern Atom Teorisi", R.drawable.kim3, "Kimya"));
            tumKonular.add(new KonularSinifi("Kimyasal Türler Arası Tepkimeler", R.drawable.kim4, "Kimya"));
            tumKonular.add(new KonularSinifi("Mol Kavramı", R.drawable.kim5, "Kimya"));
            tumKonular.add(new KonularSinifi("Kimyasal Hesaplamalar", R.drawable.kim6, "Kimya"));
            tumKonular.add(new KonularSinifi("Asit, Baz ve Tuz", R.drawable.kim7, "Kimya"));
            tumKonular.add(new KonularSinifi("Maddenin Halleri", R.drawable.kim8, "Kimya"));
            tumKonular.add(new KonularSinifi("Karışımlar", R.drawable.kim9, "Kimya"));
            tumKonular.add(new KonularSinifi("Endüstride ve Canlılarda Enerji", R.drawable.kim10, "Kimya"));
            tumKonular.add(new KonularSinifi("Kimya Her Yerde", R.drawable.kim11, "Kimya"));
        } else if (dersKategorileri.getDersAdi().matches("Biyoloji")) {
            tumKonular.add(new KonularSinifi("Biyoloji Bilimi", R.drawable.biy1, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Canlıların Yapısında Bulunan Temel Bileşenler", R.drawable.biy2, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Hücrenin Yapısı ve İşlevi", R.drawable.biy3, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Canlıların Çeşitliliği ve Sınıflandırması", R.drawable.biy4, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Hücre Bölünmesi ve Üreme", R.drawable.biy5, "Biyoloji"));
            tumKonular.add(new KonularSinifi("İnsanda Üreme Sistemi", R.drawable.biy15, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Kalıtım", R.drawable.biy6, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Modern Genetik Uygulamaları", R.drawable.biy7, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Ekosistem Ekolojisi", R.drawable.biy8, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Canlılarda Enerji Dönüşümü", R.drawable.biy10, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Solunum", R.drawable.biy14, "Biyoloji"));
            tumKonular.add(new KonularSinifi("İnsan Fizyolojisi", R.drawable.biy17, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Kominite ve Popülasyon Ekolojisi", R.drawable.biy16, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Hayatın Başlangıcı ve Evrim", R.drawable.biy13, "Biyoloji"));
        } else if (dersKategorileri.getDersAdi().matches("Felsefe")) {
            tumKonular.add(new KonularSinifi("Felsefe’nin Konusu", R.drawable.fel1, "Felsefe"));
            tumKonular.add(new KonularSinifi("Bilgi Felsefesi", R.drawable.fel2, "Felsefe"));
            tumKonular.add(new KonularSinifi("Bilim Felsefesi", R.drawable.fel8, "Felsefe"));
            tumKonular.add(new KonularSinifi("Varlık Felsefesi", R.drawable.fel3, "Felsefe"));
            tumKonular.add(new KonularSinifi("Ahlak Felsefesi", R.drawable.fel4, "Felsefe"));
            tumKonular.add(new KonularSinifi("Sanat Felsefesi", R.drawable.fel5, "Felsefe"));
            tumKonular.add(new KonularSinifi("Din Felsefesi", R.drawable.fel6, "Felsefe"));
            tumKonular.add(new KonularSinifi("Siyaset Felsefesi", R.drawable.fel7, "Felsefe"));
        } else if (dersKategorileri.getDersAdi().matches("Din Kültürü")) {
            tumKonular.add(new KonularSinifi("Bilgi ve İnanç", R.drawable.din1, "Din Kültürü"));
            tumKonular.add(new KonularSinifi("İnsan ve Din", R.drawable.din2, "Din Kültürü"));
            tumKonular.add(new KonularSinifi("İslam ve İbadetler", R.drawable.din3, "Din Kültürü"));
            tumKonular.add(new KonularSinifi("İslam Düşüncesinde Yorumlar, Mezhepler", R.drawable.din4, "Din Kültürü"));
            tumKonular.add(new KonularSinifi("Muhammed’in Hayatı, Örnekliği ve Onu Anlama", R.drawable.din5, "Din Kültürü"));
            tumKonular.add(new KonularSinifi("İslam ve Bilim, Estetik, Barış", R.drawable.din6, "Din Kültürü"));
            tumKonular.add(new KonularSinifi("Yaşayan Dinler ve Benzer Özellikleri", R.drawable.din7, "Din Kültürü"));
        }
        getDersKonularSinifi(tumKonular);
    }

    public ArrayList<KonularSinifi> getDersKonularSinifi(ArrayList<KonularSinifi> tumKonular) {
        if (kontrol != true) {
            tumKonular.add(new KonularSinifi("Temel Kavramlar", R.drawable.matematik1, "Matematik"));
            tumKonular.add(new KonularSinifi("Sayılar", R.drawable.matematik12, "Matematik"));
            tumKonular.add(new KonularSinifi("Bölme-Bölünebilme Kuralları", R.drawable.matematik3, "Matematik"));
            tumKonular.add(new KonularSinifi("Asal Çarpanlara Ayırma", R.drawable.matematik4, "Matematik"));
            tumKonular.add(new KonularSinifi("EBOB-EKOK", R.drawable.matematik5, "Matematik"));
            tumKonular.add(new KonularSinifi("Birinci Dereceden Denklemler", R.drawable.matematik6, "Matematik"));
            tumKonular.add(new KonularSinifi("Rasyonel Sayılar", R.drawable.matematik2, "Matematik"));
            tumKonular.add(new KonularSinifi("Eşitsizlikler", R.drawable.matematik8, "Matematik"));
            tumKonular.add(new KonularSinifi("Mutlak Değer", R.drawable.matematik11, "Matematik"));
            tumKonular.add(new KonularSinifi("Üslü Sayılar", R.drawable.matematik15, "Matematik"));
            tumKonular.add(new KonularSinifi("Köklü Sayılar", R.drawable.matematik18, "Matematik"));
            tumKonular.add(new KonularSinifi("Çarpanlarına Ayırma", R.drawable.matematik7, "Matematik"));
            tumKonular.add(new KonularSinifi("Oran-Orantı", R.drawable.matematik13, "Matematik"));
            tumKonular.add(new KonularSinifi("Problemler", R.drawable.matematik14, "Matematik"));
            tumKonular.add(new KonularSinifi("Kümeler", R.drawable.matematik10, "Matematik"));
            tumKonular.add(new KonularSinifi("Fonksiyonlar", R.drawable.matematik21, "Matematik"));
            tumKonular.add(new KonularSinifi("Permütasyon – Kombinasyon - Binom", R.drawable.matematik17, "Matematik"));
            tumKonular.add(new KonularSinifi("Olasılık", R.drawable.matematik22, "Matematik"));
            tumKonular.add(new KonularSinifi("İstatistik", R.drawable.matematik16, "Matematik"));
            tumKonular.add(new KonularSinifi("2.Dereceden Denklemler", R.drawable.matematik19, "Matematik"));
            tumKonular.add(new KonularSinifi("Polinomlar", R.drawable.matematik20, "Matematik"));
        }
        tumKonularRecylerViewAdapter.notifyDataSetChanged();
        return tumKonular;
    }

    @Override
    public void dersKonularListener(KonularSinifi konularSinifi) {
        showDialog(konularSinifi);
    }

    private void showDialog(KonularSinifi konularSinifi) {
        Dialog dialog = new Dialog(getContext());
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.custom_dialog_design);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.custom_dialog_bg);
        ImageView close = dialog.findViewById(R.id.dialog_close);
        TextView konuAdi = dialog.findViewById(R.id.dialog_konuAdi);
        ImageView konuicon = dialog.findViewById(R.id.dialog_konuicon);
        ImageView konuStart = dialog.findViewById(R.id.dialog_konuplay);
        ImageView testStart = dialog.findViewById(R.id.dialog_testplay);
        TextView bilgiKartlari = dialog.findViewById(R.id.soruSayisi);
        ImageView icon = dialog.findViewById(R.id.bilgi_kartlari_dialog_icon);
        if (konularSinifi.getKonuAdi().equals("Tablo ve Grafikler") || konularSinifi.getKonuAdi().equals("Sayısal Mantık") || konularSinifi.getKonuAdi().equals("Geometri") || konularSinifi.getKonuAdi().equals("Sözel Mantık")) {
            testStart.setVisibility(View.GONE);
            bilgiKartlari.setVisibility(View.GONE);
            icon.setVisibility(View.GONE);
        }
        konuAdi.setText(konularSinifi.getKonuAdi());
        konuicon.setImageResource(konularSinifi.getKonuIcon());
        close.setOnClickListener(view -> dialog.dismiss());
        konuStart.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), KonuIcerikActivity.class);
            intent.putExtra("Info", konularSinifi);
            startActivity(intent);
        });
        testStart.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), BilgiKartlari.class);
            String secilenKonu = konularSinifi.getKonuAdi();
            intent.putExtra("secilenKonu", secilenKonu);
            startActivity(intent);
        });
        dialog.show();
    }

    @Override
    public void onStop() {
        super.onStop();
        kontrol = false;
    }
}