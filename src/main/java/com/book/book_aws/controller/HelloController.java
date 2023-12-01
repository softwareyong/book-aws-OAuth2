package com.book.book_aws.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println();
        return "hello";
    }
}
