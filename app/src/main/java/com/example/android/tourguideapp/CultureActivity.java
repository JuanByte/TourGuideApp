package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;

public class CultureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.culture_pager_layout);

        ViewPager viewPager = findViewById(R.id.view_pager);

        CultureFragmentAdapter cultureFragmentAdapter = new CultureFragmentAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(cultureFragmentAdapter);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);

        tabLayout.setupWithViewPager(viewPager);

    }
}
