package com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;

import com.tolgaunal.tytcaslisiyorum.BilgiKartlari.BilgiKartlari;
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKategorileri.DersKategorileri;
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKategorileri.DersKategorileriRecylerViewAdapter;
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKonular─▒.KonularRecylerviewAdapter;
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKonular─▒.KonularSinifi;
import com.tolgaunal.tytcaslisiyorum.KonuIcerikActivity;
import com.tolgaunal.tytcaslisiyorum.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomeFragment extends Fragment implements DersKategorileriRecylerViewAdapter.DerslerListener, KonularRecylerviewAdapter.KonularListener {
    View view;
    ArrayList<DersKategorileri> dersKategorileri = new ArrayList<>();
    DersKategorileriRecylerViewAdapter dersKategorileriRecylerViewAdapter;
    RecyclerView dersKategorilerRecylerView;
    TextView homeName;
    CircleImageView homeImage;
    ArrayList<KonularSinifi> konularSinifis = new ArrayList<>();
    KonularRecylerviewAdapter konularRecylerviewAdapter;
    RecyclerView konularRecylerView;
    boolean kontrol = false;
    boolean intentKontrol = false;
    String intentDers = "Matematik";
    AutoCompleteTextView search;
    private static final String[] searchKonular = new String[]{
            "Temel Kavramlar", "Say─▒lar", "B├Âlme-B├Âl├╝nebilme Kurallar─▒", "Asal ├çarpanlara Ay─▒rma", "EBOB-EKOK", "Birinci Dereceden Denklemler", "Rasyonel Say─▒lar", "E┼čitsizlikler", "Mutlak De─čer", "├ťsl├╝ Say─▒lar", "K├Âkl├╝ Say─▒lar", "├çarpanlar─▒na Ay─▒rma", "Oran-Orant─▒", "Problemler", "K├╝meler", "─░┼člem ve Mod├╝ler Aritmetik", "Perm├╝tasyon ÔÇô Kombinasyon", "Olas─▒l─▒k", "Olas─▒l─▒k", "Tablo ve Grafikler", "Say─▒sal Mant─▒k", "Geometri", "S├Âzc├╝kte Anlam", "C├╝mlede Anlam", "Paragrafta Anlam", "Anlat─▒m Bozukluklar─▒", "Ses Bilgisi", "Yap─▒ Bilgisi", "S├Âzc├╝k T├╝rleri", "C├╝mle Bilgisi", "Yaz─▒m Kurallar─▒", "Noktalama ─░┼čaretleri", "S├Âzel Mant─▒k", "─░slamiyet ├ľncesi T├╝rk Tarihi", "─░lk T├╝rk ─░slam Devletleri", "Anadolu Sel├žuklu D├Ânemi ve Beylikler D├Ânemi", "T├╝rk-─░slam Devletlerinde K├╝lt├╝r ve Medeniyet", "Osmanl─▒ Devleti Kurulu┼č D├Ânemi", "Osmanl─▒ Devleti Y├╝kselme D├Ânemi", "17. Y├╝zy─▒lda Osmanl─▒ Devleti Duraklama D├Ânemi", "18. Y├╝zy─▒lda Osmanl─▒ Devleti Gerileme D├Ânemi ve Islahatlar─▒", "19. Y├╝zy─▒lda Osmanl─▒ Devleti Da─č─▒lma D├Ânemi ve Islahatlar─▒", "20. Y├╝zy─▒lda Osmanl─▒ Devleti", "Kurtulu┼č Sava┼č─▒ Haz─▒rl─▒k D├Ânemi", "I. TBMM D├Ânemi ve Ayaklanmalar", "Kurtulu┼č Sava┼č─▒ Muharebeler ve Antla┼čmalar D├Ânemi", "Cumhuriyet D├Ânemi", "Atat├╝rk D├Ânemi T├╝rk ─░├ž ve D─▒┼č Politikas─▒", "Atat├╝rk ─░lkeleri", "├ça─čda┼č T├╝rk ve D├╝nya Tarihi", "├ťlkeler Co─črafyas─▒", "Co─črafi Konum",
            "D├╝nyan─▒n ┼×ekli ve Hareketleri", "Harita Bilgisi", "─░klim", "─░├ž ve D─▒┼č Kuvvetler", "T├╝rkiyeÔÇÖnin Be┼čeri ├ľzellikleri", "T├╝rkiyenin Ekonomik Co─črafyas─▒", "T├╝rkiyeÔÇÖnin Co─črafi B├Âlgeleri"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        homeName = view.findViewById(R.id.home_name);
        homeImage = view.findViewById(R.id.home_image);
        search = view.findViewById(R.id.home_search);
        dersKategorileriRecylerViewAdapter = new DersKategorileriRecylerViewAdapter((AppCompatActivity) getActivity(), this);
        dersKategorileri = dersKategorileriRecylerViewAdapter.getDersKategorileris();
        dersKategorilerRecylerView = view.findViewById(R.id.categorieRecylerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        dersKategorilerRecylerView.setLayoutManager(layoutManager);
        if (isAdded()) {
            dersKategorilerRecylerView.setAdapter(dersKategorileriRecylerViewAdapter);

        }

        konularRecylerviewAdapter = new KonularRecylerviewAdapter((AppCompatActivity) getActivity(), this);
        konularSinifis = konularRecylerviewAdapter.getKonularSinifis();
        konularRecylerView = view.findViewById(R.id.dersKonulariRecylerView);
        konularRecylerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
        if (isAdded()) {
            konularRecylerView.setAdapter(konularRecylerviewAdapter);
        }
        getDersAdlari(dersKategorileri);
        getKonularSinifis(konularSinifis);
        databaseVerileriniGetir();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, searchKonular);
        search.setAdapter(adapter);
        search.setOnItemClickListener((adapterView, view, i, l) -> {
            String secilenKonu = String.valueOf(search.getText());
            Intent intent = new Intent(getContext(), KonuIcerikActivity.class);
            intent.putExtra("searchInfo", secilenKonu);
            startActivity(intent);
            search.setText("");
        });
        return view;
    }

    @SuppressLint("SetTextI18n")
    private void databaseVerileriniGetir() {
        try {
            SQLiteDatabase sqLiteDatabase = getContext().openOrCreateDatabase("Profil", Context.MODE_PRIVATE, null);
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS profil (image BLOB)");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ad (name VARCHAR)");
            Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM profil", null);
            Cursor cursor1 = sqLiteDatabase.rawQuery("SELECT * FROM ad", null);
            if (cursor.getCount() > 0) {
                int index = cursor.getColumnIndex("image");
                while (cursor.moveToNext()) {
                    byte[] bytes = cursor.getBlob(index);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                    homeImage.setImageBitmap(bitmap);
                }
            }
            cursor.close();
            if (cursor1.getCount() > 0) {
                int index = cursor1.getColumnIndex("name");
                while (cursor1.moveToNext()) {
                    homeName.setText("Merhaba," + " " + cursor1.getString(index) + "!");
                }
            }
            cursor1.close();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
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

    @SuppressLint("NotifyDataSetChanged")
    public ArrayList<KonularSinifi> getKonularSinifis(ArrayList<KonularSinifi> konularSinifis) {
        if (kontrol != true) {
            konularSinifis.add(new KonularSinifi("EBOB-EKOK", R.drawable.matematik5, "Matematik"));
            konularSinifis.add(new KonularSinifi("Rasyonel Say─▒lar", R.drawable.matematik2, "Matematik"));
            konularSinifis.add(new KonularSinifi("Mutlak De─čer", R.drawable.matematik11, "Matematik"));
            konularSinifis.add(new KonularSinifi("├çarpanlar─▒na Ay─▒rma", R.drawable.matematik7, "Matematik"));
            konularSinifis.add(new KonularSinifi("Oran-Orant─▒", R.drawable.matematik13, "Matematik"));
            konularSinifis.add(new KonularSinifi("Problemler", R.drawable.matematik14, "Matematik"));
            konularSinifis.add(new KonularSinifi("Olas─▒l─▒k", R.drawable.matematik22, "Matematik"));
        }
        konularRecylerviewAdapter.notifyDataSetChanged();
        return konularSinifis;
    }

    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void derslerListener(DersKategorileri dersKategorileri) {
        konularSinifis.clear();
        intentDers = dersKategorileri.getDersAdi();
        kontrol = true;
        intentKontrol = true;
        if (dersKategorileri.getDersAdi().matches("Matematik")) {
            konularSinifis.add(new KonularSinifi("EBOB-EKOK", R.drawable.matematik5, "Matematik"));
            konularSinifis.add(new KonularSinifi("Rasyonel Say─▒lar", R.drawable.matematik2, "Matematik"));
            konularSinifis.add(new KonularSinifi("Mutlak De─čer", R.drawable.matematik11, "Matematik"));
            konularSinifis.add(new KonularSinifi("├çarpanlar─▒na Ay─▒rma", R.drawable.matematik7, "Matematik"));
            konularSinifis.add(new KonularSinifi("Oran-Orant─▒", R.drawable.matematik13, "Matematik"));
            konularSinifis.add(new KonularSinifi("Problemler", R.drawable.matematik14, "Matematik"));
            konularSinifis.add(new KonularSinifi("Olas─▒l─▒k", R.drawable.matematik22, "Matematik"));
        } else if (dersKategorileri.getDersAdi().matches("T├╝rk├že")) {
            konularSinifis.add(new KonularSinifi("S├Âzc├╝kte Anlam", R.drawable.turkce3, "T├╝rk├že"));
            konularSinifis.add(new KonularSinifi("C├╝mlede Anlam", R.drawable.turkce11, "T├╝rk├že"));
            konularSinifis.add(new KonularSinifi("Paragrafta Anlam", R.drawable.turkce12, "T├╝rk├že"));
            konularSinifis.add(new KonularSinifi("Anlat─▒m Bozukluklar─▒", R.drawable.turkce2, "T├╝rk├že"));
            konularSinifis.add(new KonularSinifi("Ses Bilgisi", R.drawable.turkce9, "T├╝rk├že"));
        } else if (dersKategorileri.getDersAdi().matches("Tarih")) {
            konularSinifis.add(new KonularSinifi("T├╝rk-─░slam Devletlerinde K├╝lt├╝r ve Medeniyet", R.drawable.tarih4, "Tarih"));
            konularSinifis.add(new KonularSinifi("Osmanl─▒ Devleti Kurulu┼č D├Ânemi", R.drawable.tarih5, "Tarih"));
            konularSinifis.add(new KonularSinifi("Osmanl─▒ Devleti Y├╝kselme D├Ânemi", R.drawable.tarih6, "Tarih"));
            konularSinifis.add(new KonularSinifi("17. Y├╝zy─▒lda Osmanl─▒ Devleti Duraklama D├Ânemi", R.drawable.tarih7, "Tarih"));
            konularSinifis.add(new KonularSinifi("20. Y├╝zy─▒lda Osmanl─▒ Devleti", R.drawable.tarih10, "Tarih"));
            konularSinifis.add(new KonularSinifi("I. TBMM D├Ânemi ve Ayaklanmalar", R.drawable.tarih12, "Tarih"));
            konularSinifis.add(new KonularSinifi("Kurtulu┼č Sava┼č─▒ Muharebeler ve Antla┼čmalar D├Ânemi", R.drawable.tarih13, "Tarih"));
            konularSinifis.add(new KonularSinifi("Cumhuriyet D├Ânemi", R.drawable.tarih14, "Tarih"));
        } else if (dersKategorileri.getDersAdi().matches("Co─črafya")) {
            konularSinifis.add(new KonularSinifi("Co─črafi Konum", R.drawable.cografya2, "Co─črafya"));
            konularSinifis.add(new KonularSinifi("D├╝nyan─▒n ┼×ekli ve Hareketleri", R.drawable.cografya3, "Co─črafya"));
            konularSinifis.add(new KonularSinifi("Harita Bilgisi", R.drawable.cografya4, "Co─črafya"));
            konularSinifis.add(new KonularSinifi("T├╝rkiyeÔÇÖnin Be┼čeri ├ľzellikleri", R.drawable.cografya7, "Co─črafya"));
            konularSinifis.add(new KonularSinifi("T├╝rkiyeÔÇÖnin Co─črafi B├Âlgeleri", R.drawable.cografya9, "Co─črafya"));
        } else if (dersKategorileri.getDersAdi().matches("Biyoloji")) {
            konularSinifis.add(new KonularSinifi("H├╝cre B├Âl├╝nmesi ve ├ťreme", R.drawable.biy5, "Biyoloji"));
            konularSinifis.add(new KonularSinifi("Kal─▒t─▒m", R.drawable.biy6, "Biyoloji"));
            konularSinifis.add(new KonularSinifi("Modern Genetik Uygulamalar─▒", R.drawable.biy7, "Biyoloji"));
            konularSinifis.add(new KonularSinifi("Ekosistem Ekolojisi", R.drawable.biy8, "Biyoloji"));
        } else if (dersKategorileri.getDersAdi().matches("Fizik")) {
            konularSinifis.add(new KonularSinifi("Madde ve ├ľzellikleri", R.drawable.fiz2, "Fizik"));
            konularSinifis.add(new KonularSinifi("Hareket ve Kuvvet", R.drawable.fiz3, "Fizik"));
            konularSinifis.add(new KonularSinifi("Enerji", R.drawable.fiz4, "Fizik"));
            konularSinifis.add(new KonularSinifi("Is─▒ ve S─▒cakl─▒k", R.drawable.fiz5, "Fizik"));
        } else if (dersKategorileri.getDersAdi().matches("Kimya")) {
            konularSinifis.add(new KonularSinifi("Kimya Bilimi", R.drawable.kim1, "Kimya"));
            konularSinifis.add(new KonularSinifi("Kimyasal T├╝rler Aras─▒ Tepkimeler", R.drawable.kim4, "Kimya"));
            konularSinifis.add(new KonularSinifi("Kar─▒┼č─▒mlar", R.drawable.kim9, "Kimya"));
            konularSinifis.add(new KonularSinifi("Kimyasal T├╝rler Aras─▒ Tepkimeler", R.drawable.kim4, "Kimya"));
        } else if (dersKategorileri.getDersAdi().matches("Din K├╝lt├╝r├╝")) {
            konularSinifis.add(new KonularSinifi("─░nsan ve Din", R.drawable.din2, "Din K├╝lt├╝r├╝"));
            konularSinifis.add(new KonularSinifi("─░slam ve ─░badetler", R.drawable.din3, "Din K├╝lt├╝r├╝"));
            konularSinifis.add(new KonularSinifi("─░slam D├╝┼č├╝ncesinde Yorumlar, Mezhepler", R.drawable.din4, "Din K├╝lt├╝r├╝"));
            konularSinifis.add(new KonularSinifi("MuhammedÔÇÖin Hayat─▒, ├ľrnekli─či ve Onu Anlama.", R.drawable.din5, "Din K├╝lt├╝r├╝"));
        } else if (dersKategorileri.getDersAdi().matches("Felsefe")) {
            konularSinifis.add(new KonularSinifi("Bilgi Felsefesi", R.drawable.fel2, "Felsefe"));
            konularSinifis.add(new KonularSinifi("Varl─▒k Felsefesi", R.drawable.fel3, "Felsefe"));
            konularSinifis.add(new KonularSinifi("Ahlak Felsefesi", R.drawable.fel4, "Felsefe"));
            konularSinifis.add(new KonularSinifi("Sanat Felsefesi", R.drawable.fel5, "Felsefe"));
        } else if (dersKategorileri.getDersAdi().matches("Geometri")) {
            konularSinifis.add(new KonularSinifi("├ť├žgende E┼člik ve Benzerlik", R.drawable.geo8, "Geometri"));
            konularSinifis.add(new KonularSinifi("├ť├žgende A├ž─▒-Kenar Ba─č─▒nt─▒lar─▒", R.drawable.geo9, "Geometri"));
            konularSinifis.add(new KonularSinifi("├çokgenler", R.drawable.geo10, "Geometri"));
            konularSinifis.add(new KonularSinifi("D├Ârtgenler", R.drawable.geo11, "Geometri"));
            konularSinifis.add(new KonularSinifi("Yamuk", R.drawable.geo12, "Geometri"));
            konularSinifis.add(new KonularSinifi("Paralelkenar", R.drawable.geo13, "Geometri"));
            konularSinifis.add(new KonularSinifi("E┼čkenar D├Ârtgen ÔÇô Deltoid", R.drawable.geo14, "Geometri"));
            konularSinifis.add(new KonularSinifi("Dikd├Ârtgen", R.drawable.geo15, "Geometri"));
        }
        getKonularSinifis(konularSinifis);
    }

    @Override
    public void konularListener(KonularSinifi konularSinifi) {
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