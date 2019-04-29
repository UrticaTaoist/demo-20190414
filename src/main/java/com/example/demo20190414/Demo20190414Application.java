package com.example.demo20190414;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo20190414Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo20190414Application.class, args);
    }
//
//    @Value("${test}")
//    public String test;

//    @Value("${MYSQL-USER}")
//    public String tests;

    @GetMapping
    public Object test(){
//        System.out.println(test);
        System.out.println(";;;;;;;;;;;;;");
//        System.out.println(tests);
        return "test";
    }

}
