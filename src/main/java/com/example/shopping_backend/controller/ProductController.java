package com.example.shopping_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/add")
    public String AddProduct(){
        return "Products added successfully";

    }

    @GetMapping("/view")
    public String ViewProduct(){
        return "View Products";
    }


}
