package com.example.admin.retrofit.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.retrofit.R;
import com.example.admin.retrofit.model.gooksModel.GoogleBook;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class GooksAdapter extends RecyclerView.Adapter<GooksAdapter.GooksViewHolder> {

    private ArrayList<GoogleBook> books;
    private int bookcount;
    private String authors;

    public GooksAdapter(List<GoogleBook> books, int bookcount) {
        this.books = new ArrayList<>(books);
        this.bookcount = bookcount;
    }


    @Override
    public GooksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_book, parent, false);
        return new GooksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GooksViewHolder holder, int position) {
        if (books.get(position).getVolumeInfo().getTitle() != null)
            holder.title.setText(books.get(position).getVolumeInfo().getTitle());
        if (books.get(position).getVolumeInfo().getSubtitle() != null)
            holder.subtitle.setText(books.get(position).getVolumeInfo().getSubtitle());
        if (books.get(position).getVolumeInfo().getImageLinks().getThumbnail() != null)
            Picasso.with(holder.itemView.getContext()).load(books.get(position).getVolumeInfo().getImageLinks().getThumbnail()).into(holder.thumbnail);
        if (books.get(position).getVolumeInfo().getAuthors() != null) {
            authors = "";
            for (String author : books.get(position).getVolumeInfo().getAuthors()) {
                authors = authors.concat(author + " | ");
            }
            holder.authors.setText(authors);
        }
        System.out.println("subtitulo aqui:"+books.get(position).getVolumeInfo().getSubtitle() );
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class GooksViewHolder extends RecyclerView.ViewHolder {

        TextView title, authors, subtitle;
        ImageView thumbnail;

        GooksViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.book_title);
            authors = itemView.findViewById(R.id.book_author);
            thumbnail = itemView.findViewById(R.id.book_thumbnail);
            subtitle = itemView.findViewById(R.id.book_subtitle);
        }
    }


}
