package com.cts.day1.controllers;

import com.cts.day1.controllers.model.Product;
import com.cts.day1.controllers.provider.ProductProvider;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

@Controller
public class HomepageController extends WebMvcConfigurerAdapter {


    @GetMapping("/")
    public String showForm(Product product) {
        return "index";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid Product product, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
        }

        ProductProvider.getInstance().addProduct(product);
        return "success";
    }


}
