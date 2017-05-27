package com.cts.day1.controllers;


import com.cts.day1.controllers.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FirstController {

    @RequestMapping(path = "/getProducts", method = RequestMethod.GET)
    public @ResponseBody List<Product> getItems() {
        return getProducts();
    }

    private List<Product> getProducts() {
        List<Product> products = new ArrayList();
        products.add(new Product("success"));
        return products;
    }


}
