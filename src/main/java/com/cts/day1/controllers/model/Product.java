package com.cts.day1.controllers.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Product {

    @NotNull
    @Size(min = 2, max = 30, message="Enter valid product name")
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
