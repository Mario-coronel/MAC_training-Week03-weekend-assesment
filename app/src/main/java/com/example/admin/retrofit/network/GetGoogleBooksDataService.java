package com.example.admin.retrofit.network;

import com.example.admin.retrofit.model.EmployeeList;
import com.example.admin.retrofit.model.gooksModel.GoogleBookList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetGoogleBooksDataService {

    @GET("books/v1/volumes")
    Call<GoogleBookList> getGoogleBookListCall(@Query("q") String search);

}
