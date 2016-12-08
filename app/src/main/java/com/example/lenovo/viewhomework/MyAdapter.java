package com.example.lenovo.viewhomework;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by lenovo on 2016/12/4.
 */

public class MyAdapter extends FragmentStatePagerAdapter {
    private  MyFragment[]mFragment;
    private String[]mNumber;
    private String[] mTitle;


    public void setmTitle(String[] mTitle) {
        this.mTitle = mTitle;
    }

    public String[] getmNumber() {
        return mNumber;
    }

    public void setmNumber(String[]mNumber) {
        this.mNumber = mNumber;
    }

    public MyFragment[] getmFragment() {
        return mFragment;
    }

    public void setmFragment(MyFragment[]mFragment) {
        this.mFragment = mFragment;
    }

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        mFragment[position].setText(mTitle[position]);
        return mFragment[position];
    }

    @Override
    public int getCount() {
        return mFragment.length;
    }



    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        super.destroyItem(container, position, object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle[position];
    }
}
