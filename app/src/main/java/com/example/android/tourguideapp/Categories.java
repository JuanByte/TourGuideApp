package com.example.android.tourguideapp;

public class Categories {
    private int imageCategory;
    private String textCategory;


    public Categories(int imageCategory, String textCategory) {
        this.imageCategory = imageCategory;
        this.textCategory = textCategory;
    }

    public int getImageCategory() {
        return imageCategory;
    }

    public String getTextCategory() {
        return textCategory;
    }

    public void setImageCategory(int imageCategory) {
        this.imageCategory = imageCategory;
    }

    public void setTextCategory(String textCategory) {
        this.textCategory = textCategory;
    }


}
