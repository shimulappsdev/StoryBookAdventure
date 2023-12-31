package com.storybookadventure.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.storybookadventure.R;
import com.storybookadventure.activities.ContainerActivity;
import com.storybookadventure.adapters.PopularAdapter;
import com.storybookadventure.databinding.FragmentPopularBinding;
import com.storybookadventure.models.Book;

import java.util.ArrayList;
import java.util.List;

public class PopularFragment extends Fragment {

    FragmentPopularBinding binding;
    PopularAdapter popularAdapter;
    List<Book> bookList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPopularBinding.inflate(getLayoutInflater(), container, false);

        bookList = new ArrayList<>();
        bookList.add(new Book(1, 3, "Avatar", "James Cameron", "https://images.squarespace-cdn.com/content/v1/5c71cf6a11f7846b13579e90/1551577934392-AFZCBVWPUD4TJF6QF44U/STL037798-430x661.jpg?format=1500w",""));
        bookList.add(new Book(2, 4, "Sherlock Holmes", "Arthur Conan Doyle", "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1328867843i/3588.jpg",""));
        bookList.add(new Book(2, 4, "Game of Throne", "George R. R. Martin", "https://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781608872190/game-of-thrones-9781608872190_lg.jpg",""));
        bookList.add(new Book(2, 4, "House of Dragon", "George R. R. Martin", "https://m.media-amazon.com/images/I/51dvQ6QgdwL._SY291_BO1,204,203,200_QL40_FMwebp_.jpg",""));
        bookList.add(new Book(2, 4, "The Black Cat", "Edgar Allan Poe", "https://pictures.abebooks.com/isbn/9781502990259-us.jpg",""));
        bookList.add(new Book(2, 4, "Feluda", "Satyajit Roy", "https://m.media-amazon.com/images/I/61xUKTeqN8L._SY291_BO1,204,203,200_QL40_FMwebp_.jpg",""));
        bookList.add(new Book(2, 4, "Byomkesh Bakshi", "Sharadindu Bandyopadhyay", "https://bdebooks.com/wp-content/uploads/2023/01/Byomkesh-Shamagra-Sharadindu-Bandyopadhyay-280x428.jpg",""));
        bookList.add(new Book(2, 4, "Tenida", "Narayan Gangopadhyay", "https://m.media-amazon.com/images/I/41DSdD5BhnL._SY264_BO1,204,203,200_QL40_FMwebp_.jpg",""));
        bookList.add(new Book(1, 3, "Avatar", "James Cameron", "https://images.squarespace-cdn.com/content/v1/5c71cf6a11f7846b13579e90/1551577934392-AFZCBVWPUD4TJF6QF44U/STL037798-430x661.jpg?format=1500w",""));
        bookList.add(new Book(2, 4, "Sherlock Holmes", "Arthur Conan Doyle", "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1328867843i/3588.jpg",""));
        bookList.add(new Book(2, 4, "Game of Throne", "George R. R. Martin", "https://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781608872190/game-of-thrones-9781608872190_lg.jpg",""));
        bookList.add(new Book(2, 4, "House of Dragon", "George R. R. Martin", "https://m.media-amazon.com/images/I/51dvQ6QgdwL._SY291_BO1,204,203,200_QL40_FMwebp_.jpg",""));
        bookList.add(new Book(2, 4, "The Black Cat", "Edgar Allan Poe", "https://pictures.abebooks.com/isbn/9781502990259-us.jpg",""));
        bookList.add(new Book(2, 4, "Feluda", "Satyajit Roy", "https://m.media-amazon.com/images/I/61xUKTeqN8L._SY291_BO1,204,203,200_QL40_FMwebp_.jpg",""));
        bookList.add(new Book(2, 4, "Byomkesh Bakshi", "Sharadindu Bandyopadhyay", "https://bdebooks.com/wp-content/uploads/2023/01/Byomkesh-Shamagra-Sharadindu-Bandyopadhyay-280x428.jpg",""));
        bookList.add(new Book(2, 4, "Tenida", "Narayan Gangopadhyay", "https://m.media-amazon.com/images/I/41DSdD5BhnL._SY264_BO1,204,203,200_QL40_FMwebp_.jpg",""));

        popularAdapter = new PopularAdapter(getActivity(), bookList);
        binding.popularRecyclerView.setAdapter(popularAdapter);

        binding.allPopular.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), ContainerActivity.class);
            intent.putExtra("seeAll", "seeAll");
            intent.putExtra("headText", "Popular");
            startActivity(intent);
        });


        return binding.getRoot();
    }
}