package com.storybookadventure.fragments;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import com.storybookadventure.R;
import com.storybookadventure.activities.ContainerActivity;
import com.storybookadventure.activities.MainActivity;
import com.storybookadventure.adapters.CategoryAdapter;
import com.storybookadventure.adapters.FragmentsAdapter;
import com.storybookadventure.adapters.MostReadAdapter;
import com.storybookadventure.adapters.PopularAdapter;
import com.storybookadventure.databinding.FragmentHomeBinding;
import com.storybookadventure.models.Book;
import com.storybookadventure.models.Category;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    ImageCarousel carousel;
    CategoryAdapter categoryAdapter;
    MostReadAdapter mostReadAdapter;
    List<Category> categoryList;
    List<Book> bookList;
    FragmentsAdapter adapter;
    FragmentManager fragmentManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater(), container, false);

        binding.carousel.registerLifecycle(getViewLifecycleOwner());
        List<CarouselItem> list = new ArrayList<>();
        list.add(new CarouselItem(R.drawable.thriller));
        list.add(new CarouselItem(R.drawable.adventure));
        list.add(new CarouselItem(R.drawable.mystrey));
        list.add(new CarouselItem(R.drawable.horror));
        binding.carousel.setData(list);

        fragmentManager = getFragmentManager();
        adapter = new FragmentsAdapter(fragmentManager,100);
        binding.viewPager.setAdapter(adapter);
        binding.tablayout.setupWithViewPager(binding.viewPager);




        categoryList = new ArrayList<>();

        categoryList.add(new Category(1, "Fiction", "https://cdn.pixabay.com/photo/2023/04/08/20/49/science-fiction-7910111_1280.jpg"));
        categoryList.add(new Category(2, "Non-Fiction", "https://images.template.net/wp-content/uploads/2018/04/Free-Non-fiction-Book-Cover.jpg?width=550"));
        categoryList.add(new Category(3, "Children's Books", "https://as2.ftcdn.net/v2/jpg/02/66/24/37/1000_F_266243768_onjOzyPVhDUTzMuhj5jZMrQV9tQV5wlj.jpg"));
        categoryList.add(new Category(4, "Poetry", "https://img.freepik.com/free-vector/open-book-with-mystic-bright-light_1284-12772.jpg?w=740&t=st=1691423775~exp=1691424375~hmac=2fc520f036d2b231a5473282b64171785f8548452b444ee0d46d1b438ba65035"));
        categoryList.add(new Category(5, "Graphic Novels", "https://cdn.kobo.com/book-images/a5996287-c4f2-4191-bcbb-925ab80702eb/353/569/90/False/wings-of-fire-the-hidden-kingdom-a-graphic-novel-wings-of-fire-graphic-novel-3.jpg"));
        categoryList.add(new Category(7, "Fantasy", "https://img.freepik.com/free-photo/night-adventure-with-fairy-glowing-object-generative-ai_188544-12605.jpg?w=1060&t=st=1691424110~exp=1691424710~hmac=53105ed82495889c07c6356c44d7b2dcddcc5bb88891234fb0c5be7b652de7ad"));
        categoryList.add(new Category(8, "Mystery", "https://dreambundles.com/cdn/shop/products/mystery-forest-5-x-8-paperback-book-mockup_60815ad767e7c_grande.jpg?v=1652242694"));
        categoryList.add(new Category(9, "Romance", "https://m.media-amazon.com/images/I/41rbPS0ckCL.jpg"));
        categoryList.add(new Category(11, "Horror", "https://m.media-amazon.com/images/P/B0BTJ8RLP2.01._SCLZZZZZZZ_SX500_.jpg"));
        categoryList.add(new Category(1, "Fiction", "https://cdn.pixabay.com/photo/2023/04/08/20/49/science-fiction-7910111_1280.jpg"));
        categoryList.add(new Category(2, "Non-Fiction", "https://images.template.net/wp-content/uploads/2018/04/Free-Non-fiction-Book-Cover.jpg?width=550"));
        categoryList.add(new Category(3, "Children's Books", "https://as2.ftcdn.net/v2/jpg/02/66/24/37/1000_F_266243768_onjOzyPVhDUTzMuhj5jZMrQV9tQV5wlj.jpg"));
        categoryList.add(new Category(4, "Poetry", "https://img.freepik.com/free-vector/open-book-with-mystic-bright-light_1284-12772.jpg?w=740&t=st=1691423775~exp=1691424375~hmac=2fc520f036d2b231a5473282b64171785f8548452b444ee0d46d1b438ba65035"));
        categoryList.add(new Category(5, "Graphic Novels", "https://cdn.kobo.com/book-images/a5996287-c4f2-4191-bcbb-925ab80702eb/353/569/90/False/wings-of-fire-the-hidden-kingdom-a-graphic-novel-wings-of-fire-graphic-novel-3.jpg"));
        categoryList.add(new Category(7, "Fantasy", "https://img.freepik.com/free-photo/night-adventure-with-fairy-glowing-object-generative-ai_188544-12605.jpg?w=1060&t=st=1691424110~exp=1691424710~hmac=53105ed82495889c07c6356c44d7b2dcddcc5bb88891234fb0c5be7b652de7ad"));
        categoryList.add(new Category(8, "Mystery", "https://dreambundles.com/cdn/shop/products/mystery-forest-5-x-8-paperback-book-mockup_60815ad767e7c_grande.jpg?v=1652242694"));
        categoryList.add(new Category(9, "Romance", "https://m.media-amazon.com/images/I/41rbPS0ckCL.jpg"));

        categoryAdapter = new CategoryAdapter(getActivity(), categoryList);
        binding.categoriesRecyclerView.setAdapter(categoryAdapter);

        bookList = new ArrayList<>();

        bookList.add(new Book(2, 4, "Game of Throne", "George R. R. Martin", "https://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781608872190/game-of-thrones-9781608872190_lg.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(2, 4, "Sherlock Holmes", "Arthur Conan Doyle", "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1328867843i/3588.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(2, 4, "House of Dragon", "George R. R. Martin", "https://m.media-amazon.com/images/I/51dvQ6QgdwL._SY291_BO1,204,203,200_QL40_FMwebp_.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(2, 4, "The Black Cat", "Edgar Allan Poe", "https://pictures.abebooks.com/isbn/9781502990259-us.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(2, 4, "Feluda", "Satyajit Roy", "https://m.media-amazon.com/images/I/61xUKTeqN8L._SY291_BO1,204,203,200_QL40_FMwebp_.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(2, 4, "Byomkesh Bakshi", "Sharadindu Bandyopadhyay", "https://bdebooks.com/wp-content/uploads/2023/01/Byomkesh-Shamagra-Sharadindu-Bandyopadhyay-280x428.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(2, 4, "Tenida", "Narayan Gangopadhyay", "https://m.media-amazon.com/images/I/41DSdD5BhnL._SY264_BO1,204,203,200_QL40_FMwebp_.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(1, 3, "Avatar", "James Cameron", "https://images.squarespace-cdn.com/content/v1/5c71cf6a11f7846b13579e90/1551577934392-AFZCBVWPUD4TJF6QF44U/STL037798-430x661.jpg?format=1500w","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(2, 4, "Sherlock Holmes", "Arthur Conan Doyle", "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1328867843i/3588.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(2, 4, "Game of Throne", "George R. R. Martin", "https://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781608872190/game-of-thrones-9781608872190_lg.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(2, 4, "House of Dragon", "George R. R. Martin", "https://m.media-amazon.com/images/I/51dvQ6QgdwL._SY291_BO1,204,203,200_QL40_FMwebp_.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(2, 4, "The Black Cat", "Edgar Allan Poe", "https://pictures.abebooks.com/isbn/9781502990259-us.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(2, 4, "Feluda", "Satyajit Roy", "https://m.media-amazon.com/images/I/61xUKTeqN8L._SY291_BO1,204,203,200_QL40_FMwebp_.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(2, 4, "Byomkesh Bakshi", "Sharadindu Bandyopadhyay", "https://bdebooks.com/wp-content/uploads/2023/01/Byomkesh-Shamagra-Sharadindu-Bandyopadhyay-280x428.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(2, 4, "Tenida", "Narayan Gangopadhyay", "https://m.media-amazon.com/images/I/41DSdD5BhnL._SY264_BO1,204,203,200_QL40_FMwebp_.jpg","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));
        bookList.add(new Book(1, 3, "Avatar", "James Cameron", "https://images.squarespace-cdn.com/content/v1/5c71cf6a11f7846b13579e90/1551577934392-AFZCBVWPUD4TJF6QF44U/STL037798-430x661.jpg?format=1500w","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."));

        mostReadAdapter = new MostReadAdapter(getActivity(), bookList);
        binding.mostReadRecyclerView.setAdapter(mostReadAdapter);


        binding.filterBtn.setOnClickListener(view -> {
            showBottomDialog();
        });

        binding.bookOtherMonthImage.setImageResource(R.drawable.avatar);
        binding.bookOtherMonthName.setText("Avatar");
        binding.bookOtherMonthAuthorName.setText("By "+"James Cameron");
        binding.bookOtherMonthShortDescription.setText("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English.");

        return binding.getRoot();
    }

    private void showBottomDialog() {

        final Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.filter_layout);

        TextView filterSearchBtn = dialog.findViewById(R.id.filterSearchBtn);

        filterSearchBtn.setOnClickListener(view -> {
            Toast.makeText(getActivity(), "Filtering your expecting.!", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.TOP);

    }
}