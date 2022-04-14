package com.example.getmesocialservice.repository;
import com.example.getmesocialservice.Model.User;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser() {
        User user = new User("Adam", "White House", 21, "adam.png" );
        return user;
    }
}

