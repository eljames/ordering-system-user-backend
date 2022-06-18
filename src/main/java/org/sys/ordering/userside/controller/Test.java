package org.sys.ordering.userside.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/search")
public class Test {

    @GetMapping
    public String test() {
        return "Test OK";
    }

}
