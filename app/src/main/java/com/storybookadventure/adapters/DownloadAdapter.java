package com.storybookadventure.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.storybookadventure.R;
import com.storybookadventure.models.Book;
import com.storybookadventure.viewholders.DownloadViewHolder;

import java.util.List;

public class DownloadAdapter extends RecyclerView.Adapter<DownloadViewHolder> {

    private Context context;
    private List<Book> bookList;

    public DownloadAdapter(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public DownloadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DownloadViewHolder(LayoutInflater.from(context).inflate(R.layout.download_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DownloadViewHolder holder, int position) {

        Book book = bookList.get(position);
        holder.downloadBookName.setText(book.getBook_name());
        holder.downloadBookAuthorName.setText("By "+book.getAuthor_name());
        holder.downloadBookShortDescription.setText(book.getBook_short_description());
        Glide.with(context).load(book.getBook_image()).placeholder(R.drawable.placeholder).into(holder.downloadBookImage);

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}
