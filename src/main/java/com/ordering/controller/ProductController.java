package com.ordering.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/products")
@RestController
public class ProductController {

    @GetMapping
    public String test() {
        return "Everything's alright";
    }
}
