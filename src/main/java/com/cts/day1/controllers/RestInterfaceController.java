package com.cts.day1.controllers;


import com.cts.day1.services.ProductServiceImple;
import com.cts.day1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class RestInterfaceController {

    public static final String GET_PRODUCTS = "/getProducts";
    public static final String ADD_PRODUCT = "/addProduct";


    @Autowired
    private ProductServiceImple productService;

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