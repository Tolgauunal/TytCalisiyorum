package com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKonuları;

import android.os.Parcel;
import android.os.Parcelable;

public class KonularSinifi implements Parcelable {
    String konuAdi;
    int konuIcon;
    String DersAdi;

    public KonularSinifi(String konuAdi, int konuIcon, String dersAdi) {
        this.konuAdi = konuAdi;
        this.konuIcon = konuIcon;
        this.DersAdi = dersAdi;
    }

    public KonularSinifi(Parcel in) {
        konuAdi = in.readString();
        konuIcon = in.readInt();
        DersAdi = in.readString();
    }

    public static final Creator<KonularSinifi> CREATOR = new Creator<KonularSinifi>() {
        @Override
        public KonularSinifi createFromParcel(Parcel in) {
            return new KonularSinifi(in);
        }

        @Override
        public KonularSinifi[] newArray(int size) {
            return new KonularSinifi[size];
        }
    };

    public String getKonuAdi() {
        return konuAdi;
    }

    public void setKonuAdi(String konuAdi) {
        this.konuAdi = konuAdi;
    }

    public int getKonuIcon() {
        return konuIcon;
    }

    public void setKonuIcon(int konuIcon) {
        this.konuIcon = konuIcon;
    }

    public String getDersAdi() {
        return DersAdi;
    }

    public void setDersAdi(String dersAdi) {
        DersAdi = dersAdi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(konuAdi);
        parcel.writeInt(konuIcon);
        parcel.writeString(DersAdi);
    }
}
