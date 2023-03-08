package com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.DersKategorileri;

import android.os.Parcel;
import android.os.Parcelable;

public class DersKategorileri implements Parcelable {
    private String dersAdi;
    private int dersIcon;
    private int dersIconWhite;

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public int getDersIcon() {
        return dersIcon;
    }

    public void setDersIcon(int dersIcon) {
        this.dersIcon = dersIcon;
    }

    public int getDersIconWhite() {
        return dersIconWhite;
    }

    public void setDersIconWhite(int dersIconWhite) {
        this.dersIconWhite = dersIconWhite;
    }

    public static Parcelable.Creator<DersKategorileri> getCREATOR() {
        return CREATOR;
    }

    public DersKategorileri(String dersAdi, int dersIcon, int dersIconWhite) {
        this.dersAdi = dersAdi;
        this.dersIcon = dersIcon;
        this.dersIconWhite = dersIconWhite;
    }

    protected DersKategorileri(Parcel in) {
        dersAdi = in.readString();
        dersIcon = in.readInt();
        dersIconWhite = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(dersAdi);
        dest.writeInt(dersIcon);
        dest.writeInt(dersIconWhite);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<DersKategorileri> CREATOR = new Parcelable.Creator<DersKategorileri>() {
        @Override
        public DersKategorileri createFromParcel(Parcel in) {
            return new DersKategorileri(in);
        }

        @Override
        public DersKategorileri[] newArray(int size) {
            return new DersKategorileri[size];
        }
    };
}
