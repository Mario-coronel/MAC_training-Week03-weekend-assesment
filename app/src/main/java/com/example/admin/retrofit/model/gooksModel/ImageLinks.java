package com.example.admin.retrofit.model.gooksModel;

import com.google.gson.annotations.SerializedName;

public class ImageLinks {
    @SerializedName("smallThumbnail")
    String smallThumbnail;
    @SerializedName("thumbnail")
    String thumbnail;
    @SerializedName("small")
    String small;
    @SerializedName("medium")
    String medium;
    @SerializedName("large")
    String large;
    @SerializedName("extraLarge")
    String extraLarge;


    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getExtraLarge() {
        return extraLarge;
    }

    public void setExtraLarge(String extraLarge) {
        this.extraLarge = extraLarge;
    }

    public ImageLinks(String smallThumbnail, String thumbnail, String small, String medium, String large, String extraLarge) {

        this.smallThumbnail = smallThumbnail;
        this.thumbnail = thumbnail;
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.extraLarge = extraLarge;
    }
}
