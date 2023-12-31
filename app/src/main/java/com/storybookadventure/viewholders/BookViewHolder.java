package com.storybookadventure.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.storybookadventure.R;

public class BookViewHolder extends RecyclerView.ViewHolder {

    public ImageView book_image;
    public TextView book_name, author_name;
    public RatingBar ratting_bar;

    public BookViewHolder(@NonNull View itemView) {
        super(itemView);

        book_image = itemView.findViewById(R.id.book_image);
        book_name = itemView.findViewById(R.id.book_name);
        author_name = itemView.findViewById(R.id.author_name);
        ratting_bar = itemView.findViewById(R.id.ratting_bar);

    }
}
