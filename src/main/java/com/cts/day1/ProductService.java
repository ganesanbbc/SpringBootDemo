package com.cts.day1;

import com.cts.day1.controllers.model.Product;
import com.cts.day1.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    private ProductRepository respository;

    public void addProduct(Product product) {
        respository.save(product);
    }

    public List<Product> readAllProducts() {
        return respository.findAll();
    }
}
