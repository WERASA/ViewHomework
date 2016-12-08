package com.example.lenovo.viewhomework;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;


/**
 * Created by lenovo on 2016/12/4.
 */

public class MyFragment extends Fragment {
    private TextView myTextView;

    private String text;


    public void setText(String text) {
        this.text=text;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment,container,false);


    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        myTextView=(TextView) view.findViewById(R.id.myText);
        myTextView.setText(text);
    }

    public TextView getMyTextView() {
        return myTextView;
    }
}
