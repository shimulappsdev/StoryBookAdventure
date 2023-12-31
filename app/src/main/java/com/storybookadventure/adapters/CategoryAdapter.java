package com.storybookadventure.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.storybookadventure.R;
import com.storybookadventure.models.Book;
import com.storybookadventure.models.Category;
import com.storybookadventure.viewholders.CategoryViewHolder;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    private Context context;
    private List<Category> categoryList;

    public CategoryAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.category_card_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

        Category category = categoryList.get(position);
        Glide.with(context).load(category.getCategory_image()).placeholder(R.drawable.placeholder).into(holder.category_image);
        holder.category_name.setText(category.getCategory_name());
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}
