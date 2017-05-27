package com.cts.day1.controllers;

import com.cts.day1.controllers.model.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

@Controller
public class HomepageController extends WebMvcConfigurerAdapter {


    @GetMapping("/")
    public String showForm(PersonForm personForm) {
        return "index";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "index";
        }

        return "index";
    }


}
