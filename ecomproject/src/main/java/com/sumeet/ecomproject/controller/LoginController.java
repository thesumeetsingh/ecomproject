package com.sumeet.ecomproject.controller;

import com.sumeet.ecomproject.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@RestController("/api")
@CrossOrigin
public class LoginController {

    @RequestMapping("/login/{id}")
    public ResponseEntity<User> login(@PathVariable int id){


        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
