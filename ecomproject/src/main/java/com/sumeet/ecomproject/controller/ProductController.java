package com.sumeet.ecomproject.controller;


import com.sumeet.ecomproject.model.Product;
import com.sumeet.ecomproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String greet(){
        return "Welcome";
    }

    @GetMapping("products")
    public List<Product> getProducts(){
        return service.getAllProducts();
    }

//    @GetMapping("/product/{id}")
//    public Product getProduct(@PathVariable Integer id){
//        return service.getProduct(id);
//    }

}
