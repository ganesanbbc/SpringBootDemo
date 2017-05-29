package com.cts.day1.controllers.provider;

import com.cts.day1.controllers.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductProvider {
    private static ProductProvider instance = new ProductProvider();
    private List<Product> products = new ArrayList();


    private ProductProvider() {
    }

    public static ProductProvider getInstance() {
        return instance;
    }


    public List<Product> getProducts() {
        return products;
    }
}
