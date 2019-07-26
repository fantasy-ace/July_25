package com.example.ace.july_25;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.ace.july_25.adapters.VpFragAdapter;
import com.example.ace.july_25.fragments.MyFragment;
import com.example.ace.july_25.fragments.RecFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager mMyVp;
    private TabLayout mMyTab;
    private ArrayList<Fragment> fragments;
    private VpFragAdapter vpFragAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initVp();
    }

    private void initVp() {
        fragments = new ArrayList<>();
        fragments.add(new RecFragment());
        fragments.add(new MyFragment());
        vpFragAdapter = new VpFragAdapter(getSupportFragmentManager(), fragments);
        mMyVp.setAdapter(vpFragAdapter);
        mMyTab.setupWithViewPager(mMyVp);
    }

    private void initView() {
        mMyVp = (ViewPager) findViewById(R.id.myVp);
        mMyTab = (TabLayout) findViewById(R.id.myTab);
    }
}
