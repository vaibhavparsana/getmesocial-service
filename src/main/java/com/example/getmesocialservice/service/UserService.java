package com.example.getmesocialservice.service;
import org.springframework.stereotype.Service;
import com.example.getmesocialservice.repository.UserRepository;
import com.example.getmesocialservice.Model.User;
import org.springframework.beans.factory.annotation.Autowired;



@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser() {
        return userRepository.getUser();
    }
}