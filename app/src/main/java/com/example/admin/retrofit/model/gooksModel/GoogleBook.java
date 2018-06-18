package com.example.admin.retrofit.model.gooksModel;

import com.google.gson.annotations.SerializedName;

public class GoogleBook {
    @SerializedName("volumeInfo")
    VolumeInfo volumeInfo;


    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    public GoogleBook(VolumeInfo volumeInfo) {

        this.volumeInfo = volumeInfo;
    }
}
