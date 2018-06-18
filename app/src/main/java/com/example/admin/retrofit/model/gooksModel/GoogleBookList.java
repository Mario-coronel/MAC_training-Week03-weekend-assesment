package com.example.admin.retrofit.model.gooksModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GoogleBookList {

    @SerializedName("kind")
    String kind;
    @SerializedName("totalItems")
    int totalItems;
    @SerializedName("items")
    List<GoogleBook> googleBooks;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public List<GoogleBook> getGoogleBooks() {
        return googleBooks;
    }

    public void setGoogleBooks(List<GoogleBook> googleBooks) {
        this.googleBooks = googleBooks;
    }

    public GoogleBookList(String kind, int totalItems, List<GoogleBook> googleBooks) {

        this.kind = kind;
        this.totalItems = totalItems;
        this.googleBooks = googleBooks;
    }
}
