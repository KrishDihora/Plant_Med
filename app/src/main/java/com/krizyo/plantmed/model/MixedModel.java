package com.krizyo.plantmed.model;

import android.graphics.drawable.Drawable;

public class MixedModel
{
    public MixedModel(){

    }

    String description,date;
    int image;

    public MixedModel(String Description,String Date,int Image)
    {
        this.date=Date;
        this.image=Image;
        this.description=Description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
