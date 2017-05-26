package com.cts.day1.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping(path = "/getProducts", method = RequestMethod.GET)
    public @ResponseBody String getItems(){
        return "success";
    }



}
