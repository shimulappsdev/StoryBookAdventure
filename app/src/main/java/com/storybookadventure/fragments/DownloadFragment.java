package com.storybookadventure.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.storybookadventure.R;
import com.storybookadventure.activities.MainActivity;
import com.storybookadventure.adapters.DownloadAdapter;
import com.storybookadventure.databinding.FragmentDownloadBinding;
import com.storybookadventure.models.Book;

import java.util.ArrayList;
import java.util.List;

public class DownloadFragment extends Fragment {

    FragmentDownloadBinding binding;
    List<Book> bookList;
    DownloadAdapter downloadAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDownloadBinding.inflate(getLayoutInflater(), container, false);

        bookList = new ArrayList<>();

        bookList.add(new Book(1, 3, "Avatar", "James Cameron", "https://images.squarespace-cdn.com/content/v1/5c71cf6a11f7846b13579e90/1551577934392-AFZCBVWPUD4TJF6QF44U/STL037798-430x661.jpg?format=1500w","In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available."));
        bookList.add(new Book(2, 4, "Sherlock Holmes", "Arthur Conan Doyle", "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1328867843i/3588.jpg","In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available."));
        bookList.add(new Book(2, 4, "Game of Throne", "George R. R. Martin", "https://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781608872190/game-of-thrones-9781608872190_lg.jpg","In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available."));
        bookList.add(new Book(2, 4, "House of Dragon", "George R. R. Martin", "https://m.media-amazon.com/images/I/51dvQ6QgdwL._SY291_BO1,204,203,200_QL40_FMwebp_.jpg","In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available."));
        bookList.add(new Book(2, 4, "The Black Cat", "Edgar Allan Poe", "https://pictures.abebooks.com/isbn/9781502990259-us.jpg","In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available."));
        bookList.add(new Book(2, 4, "Sherlock Holmes", "Arthur Conan Doyle", "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1328867843i/3588.jpg","In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available."));
        bookList.add(new Book(2, 4, "Game of Throne", "George R. R. Martin", "https://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781608872190/game-of-thrones-9781608872190_lg.jpg","In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available."));
        bookList.add(new Book(2, 4, "Sherlock Holmes", "Arthur Conan Doyle", "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1328867843i/3588.jpg","In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available."));
        bookList.add(new Book(2, 4, "Game of Throne", "George R. R. Martin", "https://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781608872190/game-of-thrones-9781608872190_lg.jpg","In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available."));

        downloadAdapter = new DownloadAdapter(getContext(), bookList);
        binding.downloadRecyclerView.setAdapter(downloadAdapter);

        binding.backBtn.setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), MainActivity.class));
        });


        return binding.getRoot();
    }
}