package com.cts.day1;

import com.cts.day1.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ComponentScan({"com.*.*", "com.cts.day1.*"})
public class Day1Application {

    public static void main(String[] args) {
        SpringApplication.run(Day1Application.class, args);
    }
}
