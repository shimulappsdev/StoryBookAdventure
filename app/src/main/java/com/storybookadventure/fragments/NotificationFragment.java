package com.storybookadventure.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.storybookadventure.R;
import com.storybookadventure.activities.MainActivity;
import com.storybookadventure.adapters.NotificationAdapter;
import com.storybookadventure.databinding.FragmentNotificationBinding;
import com.storybookadventure.models.Notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationFragment extends Fragment {

    FragmentNotificationBinding binding;
    NotificationAdapter notificationAdapter;
    List<Notification> notificationList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNotificationBinding.inflate(getLayoutInflater(), container, false);

        notificationList = new ArrayList<>();

        notificationList.add(new Notification(1, "Notification", "Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator. Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator. Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator. Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator ", "01-01-2023", "01:00 PM", "https://pictures.abebooks.com/isbn/9781502990259-us.jpg"));
        notificationList.add(new Notification(1, "Message", "Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator.", "01-01-2023", "01:00 PM", "https://m.media-amazon.com/images/I/61xUKTeqN8L._SY291_BO1,204,203,200_QL40_FMwebp_.jpg"));
        notificationList.add(new Notification(1, "New Books Update", "Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator.", "01-01-2023", "01:00 PM", "https://pictures.abebooks.com/isbn/9781502990259-us.jpg"));
        notificationList.add(new Notification(1, "Intermediate Reader", "Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator.", "01-01-2023", "01:00 PM", "https://m.media-amazon.com/images/I/51dvQ6QgdwL._SY291_BO1,204,203,200_QL40_FMwebp_.jpg"));
        notificationList.add(new Notification(1, "Your Earned", "Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator.", "01-01-2023", "01:00 PM", "https://m.media-amazon.com/images/I/41DSdD5BhnL._SY264_BO1,204,203,200_QL40_FMwebp_.jpg"));
        notificationList.add(new Notification(1, "Daily Update", "Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator.", "01-01-2023", "01:00 PM", "https://pictures.abebooks.com/isbn/9781502990259-us.jpg"));
        notificationList.add(new Notification(1, "Book of the Month", "Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator.", "01-01-2023", "01:00 PM", "https://m.media-amazon.com/images/I/51dvQ6QgdwL._SY291_BO1,204,203,200_QL40_FMwebp_.jpg"));
        notificationList.add(new Notification(1, "Top Books", "Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator.", "01-01-2023", "01:00 PM", "https://m.media-amazon.com/images/I/41DSdD5BhnL._SY264_BO1,204,203,200_QL40_FMwebp_.jpg"));
        notificationList.add(new Notification(1, "Favourite Books", "Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator.", "01-01-2023", "01:00 PM", "https://m.media-amazon.com/images/I/51dvQ6QgdwL._SY291_BO1,204,203,200_QL40_FMwebp_.jpg"));
        notificationList.add(new Notification(1, "Downloaded books", "Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator.", "01-01-2023", "01:00 PM", "https://m.media-amazon.com/images/I/61xUKTeqN8L._SY291_BO1,204,203,200_QL40_FMwebp_.jpg"));
        notificationList.add(new Notification(1, "Redeem Points", "Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator.", "01-01-2023", "01:00 PM", "https://pictures.abebooks.com/isbn/9781502990259-us.jpg"));

        notificationAdapter = new NotificationAdapter(getActivity(), notificationList);
        binding.notificationRecyclerView.setAdapter(notificationAdapter);

        binding.backBtn.setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), MainActivity.class));
        });

        return binding.getRoot();
    }
}