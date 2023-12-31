package com.storybookadventure.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.storybookadventure.fragments.PopularFragment;
import com.storybookadventure.fragments.RecommendedFragment;
import com.storybookadventure.fragments.TrendingFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {
    String[] name = {"Trending Now", "Popular", "Recommended"};
    public FragmentsAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new TrendingFragment();
            case 1:
                return new PopularFragment();
            case 2:
                return new RecommendedFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return name[position];
    }
}
