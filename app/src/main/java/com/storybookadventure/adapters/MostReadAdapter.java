package com.storybookadventure.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.storybookadventure.R;
import com.storybookadventure.models.Book;
import com.storybookadventure.viewholders.MostReadViewHolder;

import java.util.List;

public class MostReadAdapter extends RecyclerView.Adapter<MostReadViewHolder> {

    private Context context;
    private List<Book> bookList;

    public MostReadAdapter(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public MostReadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MostReadViewHolder(LayoutInflater.from(context).inflate(R.layout.most_read_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MostReadViewHolder holder, int position) {

        Book book = bookList.get(position);
        Glide.with(context).load(book.getBook_image()).placeholder(R.drawable.placeholder).into(holder.book_image);
        holder.book_name.setText(book.getBook_name());
        holder.author_name.setText(book.getAuthor_name());
        holder.bookOtherMonthShortDescription.setText(book.getBook_short_description());

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}
