package com.habitatapi.habit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ForestsFragment forestsFragment = new ForestsFragment();
                return forestsFragment;
            case 1:
                OceansFragment oceansFragment = new OceansFragment();
                return oceansFragment;
            case 2:
                AirFragment airFragment = new AirFragment();
                return airFragment;
            case 3:
                PolarRegionsFragment polarRegionsFragment = new PolarRegionsFragment();
                return polarRegionsFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}