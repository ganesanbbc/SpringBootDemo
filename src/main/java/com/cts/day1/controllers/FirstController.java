package com.cts.day1.controllers;


import com.cts.day1.controllers.model.Product;
import com.cts.day1.controllers.provider.ProductProvider;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FirstController {

    @RequestMapping(path = "/getProducts", method = RequestMethod.GET)
    public @ResponseBody
    List<Product> getItems() {
        return getProducts();
    }


    private List<Product> getProducts() {
        ProductProvider productProvider = ProductProvider.getInstance();
        return productProvider.getProducts();
    }


}