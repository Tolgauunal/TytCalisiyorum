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
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKonular─▒.KonularSinifi;
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
        dersKategorileri.add(new DersKategorileri("T├╝rk├že", R.drawable.turkce, R.drawable.turkcewhite));
        dersKategorileri.add(new DersKategorileri("Tarih", R.drawable.tarih, R.drawable.tarihwhite));
        dersKategorileri.add(new DersKategorileri("Co─črafya", R.drawable.cografya, R.drawable.cografyawhite));
        dersKategorileri.add(new DersKategorileri("Biyoloji", R.drawable.biy11, R.drawable.matematikwhite));
        dersKategorileri.add(new DersKategorileri("Fizik", R.drawable.fiz, R.drawable.turkcewhite));
        dersKategorileri.add(new DersKategorileri("Kimya", R.drawable.kim, R.drawable.tarihwhite));
        dersKategorileri.add(new DersKategorileri("Din K├╝lt├╝r├╝", R.drawable.din, R.drawable.cografyawhite));
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
            tumKonular.add(new KonularSinifi("Say─▒lar", R.drawable.matematik12, "Matematik"));
            tumKonular.add(new KonularSinifi("B├Âlme-B├Âl├╝nebilme Kurallar─▒", R.drawable.matematik3, "Matematik"));
            tumKonular.add(new KonularSinifi("Asal ├çarpanlara Ay─▒rma", R.drawable.matematik4, "Matematik"));
            tumKonular.add(new KonularSinifi("EBOB-EKOK", R.drawable.matematik5, "Matematik"));
            tumKonular.add(new KonularSinifi("Birinci Dereceden Denklemler", R.drawable.matematik6, "Matematik"));
            tumKonular.add(new KonularSinifi("Rasyonel Say─▒lar", R.drawable.matematik2, "Matematik"));
            tumKonular.add(new KonularSinifi("E┼čitsizlikler", R.drawable.matematik8, "Matematik"));
            tumKonular.add(new KonularSinifi("Mutlak De─čer", R.drawable.matematik11, "Matematik"));
            tumKonular.add(new KonularSinifi("├ťsl├╝ Say─▒lar", R.drawable.matematik15, "Matematik"));
            tumKonular.add(new KonularSinifi("K├Âkl├╝ Say─▒lar", R.drawable.matematik18, "Matematik"));
            tumKonular.add(new KonularSinifi("├çarpanlar─▒na Ay─▒rma", R.drawable.matematik7, "Matematik"));
            tumKonular.add(new KonularSinifi("Oran-Orant─▒", R.drawable.matematik13, "Matematik"));
            tumKonular.add(new KonularSinifi("Problemler", R.drawable.matematik14, "Matematik"));
            tumKonular.add(new KonularSinifi("K├╝meler", R.drawable.matematik10, "Matematik"));
            tumKonular.add(new KonularSinifi("Fonksiyonlar", R.drawable.matematik21, "Matematik"));
            tumKonular.add(new KonularSinifi("Perm├╝tasyon ÔÇô Kombinasyon - Binom", R.drawable.matematik17, "Matematik"));
            tumKonular.add(new KonularSinifi("Olas─▒l─▒k", R.drawable.matematik22, "Matematik"));
            tumKonular.add(new KonularSinifi("─░statistik", R.drawable.matematik16, "Matematik"));
            tumKonular.add(new KonularSinifi("2.Dereceden Denklemler", R.drawable.matematik19, "Matematik"));
            tumKonular.add(new KonularSinifi("Polinomlar", R.drawable.matematik20, "Matematik"));
        } else if (dersKategorileri.getDersAdi().matches("T├╝rk├že")) {
            tumKonular.add(new KonularSinifi("S├Âzc├╝kte Anlam", R.drawable.turkce3, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("C├╝mlede Anlam", R.drawable.turkce11, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("Paragrafta Anlam", R.drawable.turkce12, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("Ses Bilgisi", R.drawable.turkce9, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("Yaz─▒m Kurallar─▒", R.drawable.turkce1, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("Noktalama ─░┼čaretleri", R.drawable.turkce4, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("Yap─▒ Bilgisi", R.drawable.turkce5, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("S├Âzc├╝k T├╝rleri", R.drawable.turkce8, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("Edat Ba─čla├ž ├ťnlem", R.drawable.turkce7, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("Fiiller", R.drawable.turkce6, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("Ek Fiiller", R.drawable.turkce14, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("Fiillerde ├çat─▒", R.drawable.turkce13, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("Fiilimsi", R.drawable.turkce10, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("Anlat─▒m Bozukluklar─▒", R.drawable.turkce2, "T├╝rk├že"));
            tumKonular.add(new KonularSinifi("C├╝mle Bilgisi", R.drawable.turkce7, "T├╝rk├že"));

        } else if (dersKategorileri.getDersAdi().matches("Tarih")) {
            tumKonular.add(new KonularSinifi("Tarih Bilimi", R.drawable.tarih17, "Tarih"));
            tumKonular.add(new KonularSinifi("Uygarl─▒─č─▒n Do─ču┼ču ve ─░lk Uygarl─▒klar", R.drawable.tarih18, "Tarih"));
            tumKonular.add(new KonularSinifi("─░slamiyet ├ľncesi T├╝rk Tarihi", R.drawable.tarih1, "Tarih"));
            tumKonular.add(new KonularSinifi("─░lk T├╝rk ─░slam Devletleri", R.drawable.tarih2, "Tarih"));
            tumKonular.add(new KonularSinifi("Anadolu Sel├žuklu D├Ânemi ve Beylikler D├Ânemi", R.drawable.tarih3, "Tarih"));
            tumKonular.add(new KonularSinifi("T├╝rk-─░slam Devletlerinde K├╝lt├╝r ve Medeniyet", R.drawable.tarih4, "Tarih"));
            tumKonular.add(new KonularSinifi("Osmanl─▒ Devleti Kurulu┼č D├Ânemi", R.drawable.tarih5, "Tarih"));
            tumKonular.add(new KonularSinifi("Osmanl─▒ Devleti Y├╝kselme D├Ânemi", R.drawable.tarih6, "Tarih"));
            tumKonular.add(new KonularSinifi("17. Y├╝zy─▒lda Osmanl─▒ Devleti Duraklama D├Ânemi", R.drawable.tarih7, "Tarih"));
            tumKonular.add(new KonularSinifi("18. Y├╝zy─▒lda Osmanl─▒ Devleti Gerileme D├Ânemi ve Islahatlar─▒", R.drawable.tarih8, "Tarih"));
            tumKonular.add(new KonularSinifi("19. Y├╝zy─▒lda Osmanl─▒ Devleti Da─č─▒lma D├Ânemi ve Islahatlar─▒", R.drawable.tarih9, "Tarih"));
            tumKonular.add(new KonularSinifi("20. Y├╝zy─▒lda Osmanl─▒ Devleti", R.drawable.tarih10, "Tarih"));
            tumKonular.add(new KonularSinifi("Kurtulu┼č Sava┼č─▒ Haz─▒rl─▒k D├Ânemi", R.drawable.tarih11, "Tarih"));
            tumKonular.add(new KonularSinifi("I. TBMM D├Ânemi ve Ayaklanmalar", R.drawable.tarih12, "Tarih"));
            tumKonular.add(new KonularSinifi("Kurtulu┼č Sava┼č─▒ Muharebeler ve Antla┼čmalar D├Ânemi", R.drawable.tarih13, "Tarih"));
            tumKonular.add(new KonularSinifi("Cumhuriyet D├Ânemi", R.drawable.tarih14, "Tarih"));
            tumKonular.add(new KonularSinifi("Atat├╝rk D├Ânemi T├╝rk ─░├ž ve D─▒┼č Politikas─▒", R.drawable.tarih15, "Tarih"));
            tumKonular.add(new KonularSinifi("Atat├╝rk ─░lkeleri", R.drawable.tarih16, "Tarih"));
        } else if (dersKategorileri.getDersAdi().matches("Co─črafya")) {
            tumKonular.add(new KonularSinifi("Do─ča ve ─░nsan", R.drawable.cografya10, "Co─črafya"));
            tumKonular.add(new KonularSinifi("Harita Bilgisi", R.drawable.cografya4, "Co─črafya"));
            tumKonular.add(new KonularSinifi("Co─črafi Konum", R.drawable.cografya5, "Co─črafya"));
            tumKonular.add(new KonularSinifi("D├╝nyan─▒n ┼×ekli ve Hareketleri", R.drawable.cografya3, "Co─črafya"));
            tumKonular.add(new KonularSinifi("S─▒cakl─▒k", R.drawable.cografya11, "Co─črafya"));
            tumKonular.add(new KonularSinifi("Bas─▒n├ž ve R├╝zgarlar", R.drawable.cografya12, "Co─črafya"));
            tumKonular.add(new KonularSinifi("Nemlilik ve Ya─č─▒┼č", R.drawable.cografya13, "Co─črafya"));
            tumKonular.add(new KonularSinifi("─░klim Tipleri ve Bitki ├ľrt├╝s├╝", R.drawable.cografya14, "Co─črafya"));
            tumKonular.add(new KonularSinifi("T├╝rkiye'nin ─░klimi", R.drawable.cografya5, "Co─črafya"));
            tumKonular.add(new KonularSinifi("Yerin ┼×ekillenmesi", R.drawable.cografya15, "Co─črafya"));
            tumKonular.add(new KonularSinifi("─░├ž ve D─▒┼č Kuvvetler", R.drawable.cografya6, "Co─črafya"));
            tumKonular.add(new KonularSinifi("Su Kaynaklar─▒", R.drawable.cografya16, "Co─črafya"));
            tumKonular.add(new KonularSinifi("Topraklar", R.drawable.cografya18, "Co─črafya"));
            tumKonular.add(new KonularSinifi("Bitkiler", R.drawable.cografya17, "Co─črafya"));
            tumKonular.add(new KonularSinifi("N├╝fus", R.drawable.cografya19, "Co─črafya"));
            tumKonular.add(new KonularSinifi("G├Â├ž", R.drawable.cografya20, "Co─črafya"));
            tumKonular.add(new KonularSinifi("Yerle┼čmeler", R.drawable.cografya21, "Co─črafya"));
            tumKonular.add(new KonularSinifi("├ťlkeler Co─črafyas─▒", R.drawable.cografya22, "Co─črafya"));
            tumKonular.add(new KonularSinifi("Ula┼č─▒m Yollar─▒", R.drawable.cografya25, "Co─črafya"));
            tumKonular.add(new KonularSinifi("Do─čal Afetler", R.drawable.cografya23, "Co─črafya"));
        } else if (dersKategorileri.getDersAdi().matches("Geometri")) {
            tumKonular.add(new KonularSinifi("Do─čruda ve ├ť├žgende A├ž─▒lar", R.drawable.geo1, "Geometri"));
            tumKonular.add(new KonularSinifi("Dik ├ť├žgende Trigonemetrik Ba─č─▒nt─▒lar", R.drawable.geo3, "Geometri"));
            tumKonular.add(new KonularSinifi("─░kizkenar ve E┼čkenar ├ť├žgen", R.drawable.geo4, "Geometri"));
            tumKonular.add(new KonularSinifi("├ť├žgende Alanlar", R.drawable.geo5, "Geometri"));
            tumKonular.add(new KonularSinifi("├ť├žgende A├ž─▒ortay Ba─č─▒nt─▒lar─▒", R.drawable.geo6, "Geometri"));
            tumKonular.add(new KonularSinifi("├ť├žgende Kenarortay Ba─č─▒nt─▒lar─▒", R.drawable.geo7, "Geometri"));
            tumKonular.add(new KonularSinifi("├ť├žgende E┼člik ve Benzerlik", R.drawable.geo8, "Geometri"));
            tumKonular.add(new KonularSinifi("├ť├žgende A├ž─▒-Kenar Ba─č─▒nt─▒lar─▒", R.drawable.geo9, "Geometri"));
            tumKonular.add(new KonularSinifi("├çokgenler", R.drawable.geo10, "Geometri"));
            tumKonular.add(new KonularSinifi("D├Ârtgenler", R.drawable.geo11, "Geometri"));
            tumKonular.add(new KonularSinifi("Yamuk", R.drawable.geo12, "Geometri"));
            tumKonular.add(new KonularSinifi("Paralelkenar", R.drawable.geo13, "Geometri"));
            tumKonular.add(new KonularSinifi("E┼čkenar D├Ârtgen ÔÇô Deltoid - Dikd├Ârtgen", R.drawable.geo14, "Geometri"));
            tumKonular.add(new KonularSinifi("├çemberde A├ž─▒lar", R.drawable.geo16, "Geometri"));
            tumKonular.add(new KonularSinifi("├çemberde Uzunluk", R.drawable.geo17, "Geometri"));
            tumKonular.add(new KonularSinifi("Daire", R.drawable.geo18, "Geometri"));
            tumKonular.add(new KonularSinifi("Prizmalar", R.drawable.geo19, "Geometri"));
            tumKonular.add(new KonularSinifi("Piramitler", R.drawable.geo20, "Geometri"));
            tumKonular.add(new KonularSinifi("K├╝re", R.drawable.geo21, "Geometri"));
            tumKonular.add(new KonularSinifi("Koordinat D├╝zlemi ve Noktan─▒n Analiti─či", R.drawable.geo22, "Geometri"));
        } else if (dersKategorileri.getDersAdi().matches("Fizik")) {
            tumKonular.add(new KonularSinifi("Fizik Bilimine Giri┼č", R.drawable.fiz1, "Fizik"));
            tumKonular.add(new KonularSinifi("Madde ve ├ľzellikleri", R.drawable.fiz2, "Fizik"));
            tumKonular.add(new KonularSinifi("Bas─▒n├ž ve Kald─▒rma Kuvveti", R.drawable.fiz, "Fizik"));
            tumKonular.add(new KonularSinifi("Is─▒ ve S─▒cakl─▒k", R.drawable.fiz5, "Fizik"));
            tumKonular.add(new KonularSinifi("Enerji", R.drawable.fiz4, "Fizik"));
            tumKonular.add(new KonularSinifi("Elektrostatik", R.drawable.fiz6, "Fizik"));
            tumKonular.add(new KonularSinifi("Hareket ve Kuvvet", R.drawable.fiz3, "Fizik"));
            tumKonular.add(new KonularSinifi("Elektrik ve Manyetizma", R.drawable.fiz7, "Fizik"));
            tumKonular.add(new KonularSinifi("Optik", R.drawable.fiz9, "Fizik"));
            tumKonular.add(new KonularSinifi("Dalgalar", R.drawable.fiz13, "Fizik"));
            tumKonular.add(new KonularSinifi("D├╝nya ve Uzay", R.drawable.fiz14, "Fizik"));
            tumKonular.add(new KonularSinifi("Basit Makineler", R.drawable.fiz12, "Fizik"));
        } else if (dersKategorileri.getDersAdi().matches("Kimya")) {
            tumKonular.add(new KonularSinifi("Kimya Bilimi", R.drawable.kim1, "Kimya"));
            tumKonular.add(new KonularSinifi("Atom ve Periyodik Sistem", R.drawable.kim2, "Kimya"));
            tumKonular.add(new KonularSinifi("Modern Atom Teorisi", R.drawable.kim3, "Kimya"));
            tumKonular.add(new KonularSinifi("Kimyasal T├╝rler Aras─▒ Tepkimeler", R.drawable.kim4, "Kimya"));
            tumKonular.add(new KonularSinifi("Mol Kavram─▒", R.drawable.kim5, "Kimya"));
            tumKonular.add(new KonularSinifi("Kimyasal Hesaplamalar", R.drawable.kim6, "Kimya"));
            tumKonular.add(new KonularSinifi("Asit, Baz ve Tuz", R.drawable.kim7, "Kimya"));
            tumKonular.add(new KonularSinifi("Maddenin Halleri", R.drawable.kim8, "Kimya"));
            tumKonular.add(new KonularSinifi("Kar─▒┼č─▒mlar", R.drawable.kim9, "Kimya"));
            tumKonular.add(new KonularSinifi("End├╝stride ve Canl─▒larda Enerji", R.drawable.kim10, "Kimya"));
            tumKonular.add(new KonularSinifi("Kimya Her Yerde", R.drawable.kim11, "Kimya"));
        } else if (dersKategorileri.getDersAdi().matches("Biyoloji")) {
            tumKonular.add(new KonularSinifi("Biyoloji Bilimi", R.drawable.biy1, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Canl─▒lar─▒n Yap─▒s─▒nda Bulunan Temel Bile┼čenler", R.drawable.biy2, "Biyoloji"));
            tumKonular.add(new KonularSinifi("H├╝crenin Yap─▒s─▒ ve ─░┼člevi", R.drawable.biy3, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Canl─▒lar─▒n ├çe┼čitlili─či ve S─▒n─▒fland─▒rmas─▒", R.drawable.biy4, "Biyoloji"));
            tumKonular.add(new KonularSinifi("H├╝cre B├Âl├╝nmesi ve ├ťreme", R.drawable.biy5, "Biyoloji"));
            tumKonular.add(new KonularSinifi("─░nsanda ├ťreme Sistemi", R.drawable.biy15, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Kal─▒t─▒m", R.drawable.biy6, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Modern Genetik Uygulamalar─▒", R.drawable.biy7, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Ekosistem Ekolojisi", R.drawable.biy8, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Canl─▒larda Enerji D├Ân├╝┼č├╝m├╝", R.drawable.biy10, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Solunum", R.drawable.biy14, "Biyoloji"));
            tumKonular.add(new KonularSinifi("─░nsan Fizyolojisi", R.drawable.biy17, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Kominite ve Pop├╝lasyon Ekolojisi", R.drawable.biy16, "Biyoloji"));
            tumKonular.add(new KonularSinifi("Hayat─▒n Ba┼člang─▒c─▒ ve Evrim", R.drawable.biy13, "Biyoloji"));
        } else if (dersKategorileri.getDersAdi().matches("Felsefe")) {
            tumKonular.add(new KonularSinifi("FelsefeÔÇÖnin Konusu", R.drawable.fel1, "Felsefe"));
            tumKonular.add(new KonularSinifi("Bilgi Felsefesi", R.drawable.fel2, "Felsefe"));
            tumKonular.add(new KonularSinifi("Bilim Felsefesi", R.drawable.fel8, "Felsefe"));
            tumKonular.add(new KonularSinifi("Varl─▒k Felsefesi", R.drawable.fel3, "Felsefe"));
            tumKonular.add(new KonularSinifi("Ahlak Felsefesi", R.drawable.fel4, "Felsefe"));
            tumKonular.add(new KonularSinifi("Sanat Felsefesi", R.drawable.fel5, "Felsefe"));
            tumKonular.add(new KonularSinifi("Din Felsefesi", R.drawable.fel6, "Felsefe"));
            tumKonular.add(new KonularSinifi("Siyaset Felsefesi", R.drawable.fel7, "Felsefe"));
        } else if (dersKategorileri.getDersAdi().matches("Din K├╝lt├╝r├╝")) {
            tumKonular.add(new KonularSinifi("Bilgi ve ─░nan├ž", R.drawable.din1, "Din K├╝lt├╝r├╝"));
            tumKonular.add(new KonularSinifi("─░nsan ve Din", R.drawable.din2, "Din K├╝lt├╝r├╝"));
            tumKonular.add(new KonularSinifi("─░slam ve ─░badetler", R.drawable.din3, "Din K├╝lt├╝r├╝"));
            tumKonular.add(new KonularSinifi("─░slam D├╝┼č├╝ncesinde Yorumlar, Mezhepler", R.drawable.din4, "Din K├╝lt├╝r├╝"));
            tumKonular.add(new KonularSinifi("MuhammedÔÇÖin Hayat─▒, ├ľrnekli─či ve Onu Anlama", R.drawable.din5, "Din K├╝lt├╝r├╝"));
            tumKonular.add(new KonularSinifi("─░slam ve Bilim, Estetik, Bar─▒┼č", R.drawable.din6, "Din K├╝lt├╝r├╝"));
            tumKonular.add(new KonularSinifi("Ya┼čayan Dinler ve Benzer ├ľzellikleri", R.drawable.din7, "Din K├╝lt├╝r├╝"));
        }
        getDersKonularSinifi(tumKonular);
    }

    public ArrayList<KonularSinifi> getDersKonularSinifi(ArrayList<KonularSinifi> tumKonular) {
        if (kontrol != true) {
            tumKonular.add(new KonularSinifi("Temel Kavramlar", R.drawable.matematik1, "Matematik"));
            tumKonular.add(new KonularSinifi("Say─▒lar", R.drawable.matematik12, "Matematik"));
            tumKonular.add(new KonularSinifi("B├Âlme-B├Âl├╝nebilme Kurallar─▒", R.drawable.matematik3, "Matematik"));
            tumKonular.add(new KonularSinifi("Asal ├çarpanlara Ay─▒rma", R.drawable.matematik4, "Matematik"));
            tumKonular.add(new KonularSinifi("EBOB-EKOK", R.drawable.matematik5, "Matematik"));
            tumKonular.add(new KonularSinifi("Birinci Dereceden Denklemler", R.drawable.matematik6, "Matematik"));
            tumKonular.add(new KonularSinifi("Rasyonel Say─▒lar", R.drawable.matematik2, "Matematik"));
            tumKonular.add(new KonularSinifi("E┼čitsizlikler", R.drawable.matematik8, "Matematik"));
            tumKonular.add(new KonularSinifi("Mutlak De─čer", R.drawable.matematik11, "Matematik"));
            tumKonular.add(new KonularSinifi("├ťsl├╝ Say─▒lar", R.drawable.matematik15, "Matematik"));
            tumKonular.add(new KonularSinifi("K├Âkl├╝ Say─▒lar", R.drawable.matematik18, "Matematik"));
            tumKonular.add(new KonularSinifi("├çarpanlar─▒na Ay─▒rma", R.drawable.matematik7, "Matematik"));
            tumKonular.add(new KonularSinifi("Oran-Orant─▒", R.drawable.matematik13, "Matematik"));
            tumKonular.add(new KonularSinifi("Problemler", R.drawable.matematik14, "Matematik"));
            tumKonular.add(new KonularSinifi("K├╝meler", R.drawable.matematik10, "Matematik"));
            tumKonular.add(new KonularSinifi("Fonksiyonlar", R.drawable.matematik21, "Matematik"));
            tumKonular.add(new KonularSinifi("Perm├╝tasyon ÔÇô Kombinasyon - Binom", R.drawable.matematik17, "Matematik"));
            tumKonular.add(new KonularSinifi("Olas─▒l─▒k", R.drawable.matematik22, "Matematik"));
            tumKonular.add(new KonularSinifi("─░statistik", R.drawable.matematik16, "Matematik"));
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
        if (konularSinifi.getKonuAdi().equals("Tablo ve Grafikler") || konularSinifi.getKonuAdi().equals("Say─▒sal Mant─▒k") || konularSinifi.getKonuAdi().equals("Geometri") || konularSinifi.getKonuAdi().equals("S├Âzel Mant─▒k")) {
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