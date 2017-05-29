package com.cts.day1.controllers.model;

public class Product {
    private String itemName;

    public Product() {
    }

    public Product(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
