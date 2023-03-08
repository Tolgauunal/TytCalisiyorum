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
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKonuları.KonularRecylerviewAdapter;
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKonuları.KonularSinifi;
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
            "Temel Kavramlar", "Sayılar", "Bölme-Bölünebilme Kuralları", "Asal Çarpanlara Ayırma", "EBOB-EKOK", "Birinci Dereceden Denklemler", "Rasyonel Sayılar", "Eşitsizlikler", "Mutlak Değer", "Üslü Sayılar", "Köklü Sayılar", "Çarpanlarına Ayırma", "Oran-Orantı", "Problemler", "Kümeler", "İşlem ve Modüler Aritmetik", "Permütasyon – Kombinasyon", "Olasılık", "Olasılık", "Tablo ve Grafikler", "Sayısal Mantık", "Geometri", "Sözcükte Anlam", "Cümlede Anlam", "Paragrafta Anlam", "Anlatım Bozuklukları", "Ses Bilgisi", "Yapı Bilgisi", "Sözcük Türleri", "Cümle Bilgisi", "Yazım Kuralları", "Noktalama İşaretleri", "Sözel Mantık", "İslamiyet Öncesi Türk Tarihi", "İlk Türk İslam Devletleri", "Anadolu Selçuklu Dönemi ve Beylikler Dönemi", "Türk-İslam Devletlerinde Kültür ve Medeniyet", "Osmanlı Devleti Kuruluş Dönemi", "Osmanlı Devleti Yükselme Dönemi", "17. Yüzyılda Osmanlı Devleti Duraklama Dönemi", "18. Yüzyılda Osmanlı Devleti Gerileme Dönemi ve Islahatları", "19. Yüzyılda Osmanlı Devleti Dağılma Dönemi ve Islahatları", "20. Yüzyılda Osmanlı Devleti", "Kurtuluş Savaşı Hazırlık Dönemi", "I. TBMM Dönemi ve Ayaklanmalar", "Kurtuluş Savaşı Muharebeler ve Antlaşmalar Dönemi", "Cumhuriyet Dönemi", "Atatürk Dönemi Türk İç ve Dış Politikası", "Atatürk İlkeleri", "Çağdaş Türk ve Dünya Tarihi", "Ülkeler Coğrafyası", "Coğrafi Konum",
            "Dünyanın Şekli ve Hareketleri", "Harita Bilgisi", "İklim", "İç ve Dış Kuvvetler", "Türkiye’nin Beşeri Özellikleri", "Türkiyenin Ekonomik Coğrafyası", "Türkiye’nin Coğrafi Bölgeleri"
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

    @SuppressLint("NotifyDataSetChanged")
    public ArrayList<KonularSinifi> getKonularSinifis(ArrayList<KonularSinifi> konularSinifis) {
        if (kontrol != true) {
            konularSinifis.add(new KonularSinifi("EBOB-EKOK", R.drawable.matematik5, "Matematik"));
            konularSinifis.add(new KonularSinifi("Rasyonel Sayılar", R.drawable.matematik2, "Matematik"));
            konularSinifis.add(new KonularSinifi("Mutlak Değer", R.drawable.matematik11, "Matematik"));
            konularSinifis.add(new KonularSinifi("Çarpanlarına Ayırma", R.drawable.matematik7, "Matematik"));
            konularSinifis.add(new KonularSinifi("Oran-Orantı", R.drawable.matematik13, "Matematik"));
            konularSinifis.add(new KonularSinifi("Problemler", R.drawable.matematik14, "Matematik"));
            konularSinifis.add(new KonularSinifi("Olasılık", R.drawable.matematik22, "Matematik"));
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
            konularSinifis.add(new KonularSinifi("Rasyonel Sayılar", R.drawable.matematik2, "Matematik"));
            konularSinifis.add(new KonularSinifi("Mutlak Değer", R.drawable.matematik11, "Matematik"));
            konularSinifis.add(new KonularSinifi("Çarpanlarına Ayırma", R.drawable.matematik7, "Matematik"));
            konularSinifis.add(new KonularSinifi("Oran-Orantı", R.drawable.matematik13, "Matematik"));
            konularSinifis.add(new KonularSinifi("Problemler", R.drawable.matematik14, "Matematik"));
            konularSinifis.add(new KonularSinifi("Olasılık", R.drawable.matematik22, "Matematik"));
        } else if (dersKategorileri.getDersAdi().matches("Türkçe")) {
            konularSinifis.add(new KonularSinifi("Sözcükte Anlam", R.drawable.turkce3, "Türkçe"));
            konularSinifis.add(new KonularSinifi("Cümlede Anlam", R.drawable.turkce11, "Türkçe"));
            konularSinifis.add(new KonularSinifi("Paragrafta Anlam", R.drawable.turkce12, "Türkçe"));
            konularSinifis.add(new KonularSinifi("Anlatım Bozuklukları", R.drawable.turkce2, "Türkçe"));
            konularSinifis.add(new KonularSinifi("Ses Bilgisi", R.drawable.turkce9, "Türkçe"));
        } else if (dersKategorileri.getDersAdi().matches("Tarih")) {
            konularSinifis.add(new KonularSinifi("Türk-İslam Devletlerinde Kültür ve Medeniyet", R.drawable.tarih4, "Tarih"));
            konularSinifis.add(new KonularSinifi("Osmanlı Devleti Kuruluş Dönemi", R.drawable.tarih5, "Tarih"));
            konularSinifis.add(new KonularSinifi("Osmanlı Devleti Yükselme Dönemi", R.drawable.tarih6, "Tarih"));
            konularSinifis.add(new KonularSinifi("17. Yüzyılda Osmanlı Devleti Duraklama Dönemi", R.drawable.tarih7, "Tarih"));
            konularSinifis.add(new KonularSinifi("20. Yüzyılda Osmanlı Devleti", R.drawable.tarih10, "Tarih"));
            konularSinifis.add(new KonularSinifi("I. TBMM Dönemi ve Ayaklanmalar", R.drawable.tarih12, "Tarih"));
            konularSinifis.add(new KonularSinifi("Kurtuluş Savaşı Muharebeler ve Antlaşmalar Dönemi", R.drawable.tarih13, "Tarih"));
            konularSinifis.add(new KonularSinifi("Cumhuriyet Dönemi", R.drawable.tarih14, "Tarih"));
        } else if (dersKategorileri.getDersAdi().matches("Coğrafya")) {
            konularSinifis.add(new KonularSinifi("Coğrafi Konum", R.drawable.cografya2, "Coğrafya"));
            konularSinifis.add(new KonularSinifi("Dünyanın Şekli ve Hareketleri", R.drawable.cografya3, "Coğrafya"));
            konularSinifis.add(new KonularSinifi("Harita Bilgisi", R.drawable.cografya4, "Coğrafya"));
            konularSinifis.add(new KonularSinifi("Türkiye’nin Beşeri Özellikleri", R.drawable.cografya7, "Coğrafya"));
            konularSinifis.add(new KonularSinifi("Türkiye’nin Coğrafi Bölgeleri", R.drawable.cografya9, "Coğrafya"));
        } else if (dersKategorileri.getDersAdi().matches("Biyoloji")) {
            konularSinifis.add(new KonularSinifi("Hücre Bölünmesi ve Üreme", R.drawable.biy5, "Biyoloji"));
            konularSinifis.add(new KonularSinifi("Kalıtım", R.drawable.biy6, "Biyoloji"));
            konularSinifis.add(new KonularSinifi("Modern Genetik Uygulamaları", R.drawable.biy7, "Biyoloji"));
            konularSinifis.add(new KonularSinifi("Ekosistem Ekolojisi", R.drawable.biy8, "Biyoloji"));
        } else if (dersKategorileri.getDersAdi().matches("Fizik")) {
            konularSinifis.add(new KonularSinifi("Madde ve Özellikleri", R.drawable.fiz2, "Fizik"));
            konularSinifis.add(new KonularSinifi("Hareket ve Kuvvet", R.drawable.fiz3, "Fizik"));
            konularSinifis.add(new KonularSinifi("Enerji", R.drawable.fiz4, "Fizik"));
            konularSinifis.add(new KonularSinifi("Isı ve Sıcaklık", R.drawable.fiz5, "Fizik"));
        } else if (dersKategorileri.getDersAdi().matches("Kimya")) {
            konularSinifis.add(new KonularSinifi("Kimya Bilimi", R.drawable.kim1, "Kimya"));
            konularSinifis.add(new KonularSinifi("Kimyasal Türler Arası Tepkimeler", R.drawable.kim4, "Kimya"));
            konularSinifis.add(new KonularSinifi("Karışımlar", R.drawable.kim9, "Kimya"));
            konularSinifis.add(new KonularSinifi("Kimyasal Türler Arası Tepkimeler", R.drawable.kim4, "Kimya"));
        } else if (dersKategorileri.getDersAdi().matches("Din Kültürü")) {
            konularSinifis.add(new KonularSinifi("İnsan ve Din", R.drawable.din2, "Din Kültürü"));
            konularSinifis.add(new KonularSinifi("İslam ve İbadetler", R.drawable.din3, "Din Kültürü"));
            konularSinifis.add(new KonularSinifi("İslam Düşüncesinde Yorumlar, Mezhepler", R.drawable.din4, "Din Kültürü"));
            konularSinifis.add(new KonularSinifi("Muhammed’in Hayatı, Örnekliği ve Onu Anlama.", R.drawable.din5, "Din Kültürü"));
        } else if (dersKategorileri.getDersAdi().matches("Felsefe")) {
            konularSinifis.add(new KonularSinifi("Bilgi Felsefesi", R.drawable.fel2, "Felsefe"));
            konularSinifis.add(new KonularSinifi("Varlık Felsefesi", R.drawable.fel3, "Felsefe"));
            konularSinifis.add(new KonularSinifi("Ahlak Felsefesi", R.drawable.fel4, "Felsefe"));
            konularSinifis.add(new KonularSinifi("Sanat Felsefesi", R.drawable.fel5, "Felsefe"));
        } else if (dersKategorileri.getDersAdi().matches("Geometri")) {
            konularSinifis.add(new KonularSinifi("Üçgende Eşlik ve Benzerlik", R.drawable.geo8, "Geometri"));
            konularSinifis.add(new KonularSinifi("Üçgende Açı-Kenar Bağıntıları", R.drawable.geo9, "Geometri"));
            konularSinifis.add(new KonularSinifi("Çokgenler", R.drawable.geo10, "Geometri"));
            konularSinifis.add(new KonularSinifi("Dörtgenler", R.drawable.geo11, "Geometri"));
            konularSinifis.add(new KonularSinifi("Yamuk", R.drawable.geo12, "Geometri"));
            konularSinifis.add(new KonularSinifi("Paralelkenar", R.drawable.geo13, "Geometri"));
            konularSinifis.add(new KonularSinifi("Eşkenar Dörtgen – Deltoid", R.drawable.geo14, "Geometri"));
            konularSinifis.add(new KonularSinifi("Dikdörtgen", R.drawable.geo15, "Geometri"));
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