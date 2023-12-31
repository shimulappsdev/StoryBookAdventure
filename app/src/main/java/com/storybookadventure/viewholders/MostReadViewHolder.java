package com.storybookadventure.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.storybookadventure.R;

public class MostReadViewHolder extends RecyclerView.ViewHolder {
    public ImageView book_image;
    public TextView book_name, author_name, bookOtherMonthShortDescription;
    public RatingBar ratting_bar;

    public MostReadViewHolder(@NonNull View itemView) {
        super(itemView);

        book_image = itemView.findViewById(R.id.book_image);
        book_name = itemView.findViewById(R.id.book_name);
        author_name = itemView.findViewById(R.id.author_name);
        bookOtherMonthShortDescription = itemView.findViewById(R.id.bookOtherMonthShortDescription);
        ratting_bar = itemView.findViewById(R.id.ratting_bar);
    }
}
