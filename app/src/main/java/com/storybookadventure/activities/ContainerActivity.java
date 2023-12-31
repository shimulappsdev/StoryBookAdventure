package com.storybookadventure.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.storybookadventure.R;
import com.storybookadventure.databinding.ActivityContainerBinding;
import com.storybookadventure.fragments.LoginFragment;
import com.storybookadventure.fragments.RegisterFragment;
import com.storybookadventure.fragments.SeeAllFragment;
import com.storybookadventure.fragments.SettingFragment;

public class ContainerActivity extends AppCompatActivity {


    ActivityContainerBinding binding;

    RegisterFragment registerFragment = new RegisterFragment();
    LoginFragment loginFragment = new LoginFragment();
    SeeAllFragment seeAllFragment = new SeeAllFragment();
    SettingFragment settingFragment = new SettingFragment();
    String register, login, seeAll, setting;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContainerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        intent = getIntent();

        register = intent.getStringExtra("register");
        login = intent.getStringExtra("login");
        seeAll = intent.getStringExtra("seeAll");
        setting = intent.getStringExtra("setting");

        if (register == null && login == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.containerActivity, loginFragment).commit();
        }

        if (register != null){
            if (register.equals("register")){
                getSupportFragmentManager().beginTransaction().replace(R.id.containerActivity, registerFragment).commit();
            }
        }

        if (login != null){
            if (login.equals("login")){
                getSupportFragmentManager().beginTransaction().replace(R.id.containerActivity, loginFragment).commit();
            }
        }

        if (seeAll != null){
            if (seeAll.equals("seeAll")){
                getSupportFragmentManager().beginTransaction().replace(R.id.containerActivity, seeAllFragment).commit();
            }
        }

        if (setting != null){
            if (setting.equals("setting")){
                getSupportFragmentManager().beginTransaction().replace(R.id.containerActivity, settingFragment).commit();
            }
        }

    }
}