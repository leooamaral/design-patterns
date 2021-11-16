package com.leoamaral.design;

public class Item {
    private final String upcCode;
    private final double price;

    public Item(String upc, double cost){
        this.upcCode = upc;
        this.price = cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public double getPrice() {
        return price;
    }
}
