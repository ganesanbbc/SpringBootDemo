package com.cts.day1.services;

import com.cts.day1.model.Product;
import com.cts.day1.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImple {

    @Autowired
    private ProductRepository respository;

    public void addProduct(Product product) {
        respository.save(product);
    }

    public List<Product> readAllProducts() {
        return respository.findAll();
    }
}
