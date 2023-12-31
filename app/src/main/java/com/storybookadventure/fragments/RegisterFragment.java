package com.storybookadventure.fragments;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.storybookadventure.R;
import com.storybookadventure.activities.ContainerActivity;
import com.storybookadventure.databinding.FragmentRegisterBinding;

public class RegisterFragment extends Fragment {

    FragmentRegisterBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRegisterBinding.inflate(getLayoutInflater(), container, false);

        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.first_log_image),6000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.second_log_image),6000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.third_log_image),6000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.fourth_log_image),6000);

        animationDrawable.setOneShot(false);
        animationDrawable.setEnterFadeDuration(1200);
        animationDrawable.setExitFadeDuration(2600);

        binding.registerLayout.setBackgroundDrawable(animationDrawable);
        animationDrawable.start();

        binding.signIn.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), ContainerActivity.class);
            intent.putExtra("login", "login");
            startActivity(intent);
            getActivity().finish();
        });

        binding.submitBtn.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), ContainerActivity.class);
            intent.putExtra("login", "login");
            startActivity(intent);
            getActivity().finish();
        });

        return binding.getRoot();
    }
}