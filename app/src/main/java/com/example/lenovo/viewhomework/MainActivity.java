package com.example.lenovo.viewhomework;

import android.app.FragmentManager;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private  String[] mString=new String[]{"1","2","3","4","5","6","7","8","9","10"};
   private MyFragment[] myFragments=new MyFragment[]{
            new MyFragment(),
            new MyFragment(),
            new MyFragment(),
            new MyFragment(),
            new MyFragment(),
            new MyFragment(),
            new MyFragment(),
            new MyFragment(),
            new MyFragment(),
            new MyFragment(),
    };
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private MyAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCreat();
    }
    public void mCreat(){
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mViewPager = (ViewPager) findViewById(R.id.viewPaper);



        mAdapter = new MyAdapter(getSupportFragmentManager());
        mAdapter.setmTitle(mString);
        mAdapter.setmNumber(mString);
        mAdapter.setmFragment(myFragments);


        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        mViewPager.setAdapter(mAdapter);

        mTabLayout.setupWithViewPager(mViewPager);

    }
}
