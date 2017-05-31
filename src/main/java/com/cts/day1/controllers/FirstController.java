package com.cts.day1.controllers;


import com.cts.day1.ProductService;
import com.cts.day1.controllers.model.Product;
import com.cts.day1.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstController {

    @Autowired
    private ProductService productService;

    @RequestMapping(path = "/getProducts", method = RequestMethod.GET)
    public @ResponseBody
    List<Product> getItems() {

        return productService.readAllProducts();
    }


    @RequestMapping(path = "/addProduct", method = RequestMethod.POST)
    public List<Product> updateItemById(@RequestBody Product product) {
        productService.addProduct(product);
        return productService.readAllProducts();
    }


}