package com.cts.day1.controllers;


import com.cts.day1.controllers.model.Product;
import com.cts.day1.controllers.provider.ProductProvider;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstController {

    ProductProvider productProvider = ProductProvider.getInstance();

    @RequestMapping(path = "/getProducts", method = RequestMethod.GET)
    public @ResponseBody
    List<Product> getItems() {
        return getProducts();
    }


    @RequestMapping(path = "/updateProduct", method = RequestMethod.POST)
    public List<Product> updateItemById(@RequestBody Product product) {
        return productProvider.addProduct(product);
    }


    private List<Product> getProducts() {
        return productProvider.getProducts();
    }


}