package com.storybookadventure.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.storybookadventure.R;

public class DownloadViewHolder extends RecyclerView.ViewHolder {
    public ImageView downloadBookImage, favouriteBtn, optionBtn;
    public TextView downloadBookName, downloadBookAuthorName, downloadBookShortDescription;
    public RatingBar ratting_bar;
    public DownloadViewHolder(@NonNull View itemView) {
        super(itemView);
        downloadBookImage = itemView.findViewById(R.id.downloadBookImage);
        downloadBookName = itemView.findViewById(R.id.downloadBookName);
        downloadBookAuthorName = itemView.findViewById(R.id.downloadBookAuthorName);
        downloadBookShortDescription = itemView.findViewById(R.id.downloadBookShortDescription);
        optionBtn = itemView.findViewById(R.id.optionBtn);
        ratting_bar = itemView.findViewById(R.id.ratting_bar);
    }
}
