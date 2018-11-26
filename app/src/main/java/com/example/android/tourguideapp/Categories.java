package com.example.android.tourguideapp;

public class Categories {
    private int imageCategory;
    private int textCategory;


    public Categories(int imageCategory, int textCategory) {
        this.imageCategory = imageCategory;
        this.textCategory = textCategory;
    }

    public int getImageCategory() {
        return imageCategory;
    }

    public int getTextCategory() {
        return textCategory;
    }

    public void setImageCategory(int imageCategory) {
        this.imageCategory = imageCategory;
    }

    public void setTextCategory(int textCategory) {
        this.textCategory = textCategory;
    }


}
