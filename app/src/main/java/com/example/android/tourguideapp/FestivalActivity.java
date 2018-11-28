package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class FestivalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.culture_container);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new FestivalsFragment())
                .commit();
    }
}
