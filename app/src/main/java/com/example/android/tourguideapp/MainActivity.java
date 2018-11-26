package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_category_layout);

        final ArrayList<Categories> categories = new ArrayList<>();

        categories.add(new Categories(R.mipmap.ic_launcher, R.string.culture_name));
        categories.add(new Categories(R.mipmap.ic_launcher, R.string.historicalPlaces_name));
        categories.add(new Categories(R.mipmap.ic_launcher, R.string.hotels_name));
        categories.add(new Categories(R.mipmap.ic_launcher, R.string.parks_name));
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, categories);
        GridView gridView = findViewById(R.id.category_list);
        gridView.setAdapter(categoryAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Categories clickCategory = categories.get(position);
                switch (position) {
                    case 0:
                        Intent cultureIntent = new Intent(MainActivity.this, CultureActivity.class);
                        startActivity(cultureIntent);
                        break;
                    case 1:
                        Intent historicalIntent = new Intent(MainActivity.this, HistoricalPlacesActivity.class);
                        startActivity(historicalIntent);
                        break;
                    case 2:
                        Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                        startActivity(hotelsIntent);
                        break;
                    case 3:
                        Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);
                        startActivity(parksIntent);
                        break;
                }

            }
        });
    }
}
