package com.example.getmesocialservice.resource;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.getmesocialservice.Model.User;
import org.springframework.beans.factory.annotation.Autowired;


import com.example.getmesocialservice.service.UserService;

@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser() {
        return userService.getUser();
    }
}