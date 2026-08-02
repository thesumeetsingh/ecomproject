package com.sumeet.ecomproject.controller;


import com.sumeet.ecomproject.model.User;
import com.sumeet.ecomproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController("/api")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{username}")
    public User getUserById(@PathVariable String username){
        return userService.getUserById(username);
    }

    @PostMapping("/{username}/create")
    public User createUser(@RequestPart User user){
        return userService.createUser(user);
    }
}
