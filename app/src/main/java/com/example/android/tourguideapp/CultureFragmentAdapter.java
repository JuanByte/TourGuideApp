package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CultureFragmentAdapter extends FragmentPagerAdapter {
    /**
     * Number of pages
     */
    final int PAGE_COUNT = 2;
    /**
     * Array that store the tabs title of each page
     */
    private int tabTitles[] = new int[]{R.string.museums_name, R.string.festivals_name};
    /**
     * Context of the app
     */
    private Context mContext;

    public CultureFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MuseumsFragment();
            case 1:
                return new FestivalsFragment();
        }
        return null;
    }
    @Override
    public int getCount() { return PAGE_COUNT; }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getString(tabTitles[position]);
    }
}
