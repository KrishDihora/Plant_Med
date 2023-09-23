package com.krizyo.plantmed.model;

public class MarketPriceModel
{
    public  MarketPriceModel(){

    }

    String veg_name,location_name,price;

    public  MarketPriceModel(String Veg_name,String Location_name,String Price)
    {
        this.veg_name=Veg_name;
        this.location_name=Location_name;
        this.price=Price;

    }

    public String getVeg_name() {
        return veg_name;
    }

    public void setVeg_name(String veg_name) {
        this.veg_name = veg_name;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
