package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<Categories> {

    public CategoryAdapter(Activity context, ArrayList<Categories> categories) {
        super(context, 0, categories);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.categories_layout, parent, false);
        }
        Categories currentCategory = getItem(position);
        ImageView categoryImage = listItemView.findViewById(R.id.imageCategory);
        categoryImage.setImageResource(currentCategory.getImageCategory());
        TextView categoryTextView = listItemView.findViewById(R.id.textCategory);
        categoryTextView.setText(currentCategory.getTextCategory());
        return listItemView;
    }
}
