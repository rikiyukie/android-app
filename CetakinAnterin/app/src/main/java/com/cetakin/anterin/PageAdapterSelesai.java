package com.cetakin.anterin;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapterSelesai extends FragmentPagerAdapter {

    private int tabNum;

    public PageAdapterSelesai(@NonNull FragmentManager fm, int numOftab) {
        super(fm, numOftab);
        this.tabNum = numOftab;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new Tab1s();
            case 1:
                return new Tab2s();
            /*case 2:
                return new Tab3();*/
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabNum;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
