package com.storybookadventure.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.storybookadventure.R;
import com.storybookadventure.models.Book;
import com.storybookadventure.viewholders.BookViewHolder;

import java.util.List;

public class PopularAdapter extends RecyclerView.Adapter<BookViewHolder> {

    private Context context;
    private List<Book> bookList;

    public PopularAdapter(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookViewHolder(LayoutInflater.from(context).inflate(R.layout.book_card_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {

        Book book = bookList.get(position);
        Glide.with(context).load(book.getBook_image()).placeholder(R.drawable.placeholder).into(holder.book_image);
        holder.book_name.setText(book.getBook_name());
        holder.author_name.setText(book.getAuthor_name());

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}
