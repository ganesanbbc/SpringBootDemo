package com.cts.day1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan({"com.*.*", "com.cts.day1.*"})
public class Day1Application {

    public static void main(String[] args) {
        SpringApplication.run(Day1Application.class, args);
    }
}
