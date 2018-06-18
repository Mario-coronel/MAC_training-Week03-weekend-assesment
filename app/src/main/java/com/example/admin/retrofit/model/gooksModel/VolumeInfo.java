package com.example.admin.retrofit.model.gooksModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VolumeInfo {
    @SerializedName("title")
    String title;
    @SerializedName("subtitle")
    String subtitle;
    @SerializedName("authors")
    String[] authors;
    @SerializedName("imageLinks")
    ImageLinks imageLinks;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }


    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public ImageLinks getImageLinks() {
        return imageLinks;
    }

    public void setImageLinks(ImageLinks imageLinks) {
        this.imageLinks = imageLinks;
    }

    public VolumeInfo(String title, String subtitle, String description, String previewLink, String[] authors, ImageLinks imageLinks) {

        this.title = title;
        this.subtitle = subtitle;
        this.authors = authors;
        this.imageLinks = imageLinks;
    }
}
