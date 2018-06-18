package com.example.admin.retrofit.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.retrofit.R;
import com.example.admin.retrofit.model.gooksModel.GoogleBookList;
import com.example.admin.retrofit.adapter.GooksAdapter;
import com.example.admin.retrofit.network.GetGoogleBooksDataService;
import com.example.admin.retrofit.network.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private GooksAdapter adapter;
    private RecyclerView recyclerView;
    EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search = (EditText) findViewById(R.id.et_search);


    }

    /*Method to generate List of employees using RecyclerView with custom adapter*/
    private void generateGoogleBooksList(GoogleBookList books) {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_book_list);

        adapter = new GooksAdapter(books.getGoogleBooks(), books.getTotalItems());

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(MainActivity.this, 3);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    public void searchBooks(View view) {
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        GetGoogleBooksDataService service = RetrofitInstance.getRetrofitInstance().create(GetGoogleBooksDataService.class);
        Call<GoogleBookList> call = service.getGoogleBookListCall(search.getText().toString());
        Log.wtf("URL Called", call.request().url() + "");
        call.enqueue(new Callback<GoogleBookList>() {
            @Override
            public void onResponse(Call<GoogleBookList> call, Response<GoogleBookList> response) {
                generateGoogleBooksList(response.body());

            }

            @Override
            public void onFailure(Call<GoogleBookList> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }


        });

    }
}
