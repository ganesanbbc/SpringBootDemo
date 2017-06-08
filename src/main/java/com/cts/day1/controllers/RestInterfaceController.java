package com.cts.day1.controllers;


import com.cts.day1.model.Product;
import com.cts.day1.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class RestInterfaceController {

    public static final String GET_PRODUCTS = "/getProducts";
    public static final String ADD_PRODUCT = "/addProduct";


    @Autowired
    private ProductService productService;

    @RequestMapping(path = GET_PRODUCTS, method = GET)
    public @ResponseBody
    List<Product> getItems() {
        return productService.readAllProducts();
    }


    @RequestMapping(path = ADD_PRODUCT, method = POST)
    public List<Product> updateItemById(@RequestBody Product product) {
        productService.addProduct(product);
        return productService.readAllProducts();
    }


}