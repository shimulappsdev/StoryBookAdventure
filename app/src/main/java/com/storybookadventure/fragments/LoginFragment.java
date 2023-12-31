package com.storybookadventure.fragments;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.storybookadventure.R;
import com.storybookadventure.activities.ContainerActivity;
import com.storybookadventure.activities.MainActivity;
import com.storybookadventure.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {

    FragmentLoginBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(getLayoutInflater(), container, false);

        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.first_log_image),6000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.second_log_image),6000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.third_log_image),6000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.fourth_log_image),6000);

        animationDrawable.setOneShot(false);
        animationDrawable.setEnterFadeDuration(1200);
        animationDrawable.setExitFadeDuration(2600);

        binding.logInLayout.setBackgroundDrawable(animationDrawable);
        animationDrawable.start();

        binding.registerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), ContainerActivity.class);
            intent.putExtra("register", "register");
            startActivity(intent);
            getActivity().finish();
        });

        binding.submitBtn.setOnClickListener(view -> {
            startActivity(new Intent(getContext(), MainActivity.class));
            getActivity().finish();
        });

        binding.forgot.setOnClickListener(view -> {
            Toast.makeText(getContext(), "You should remember your password", Toast.LENGTH_SHORT).show();
        });

        return binding.getRoot();
    }
}