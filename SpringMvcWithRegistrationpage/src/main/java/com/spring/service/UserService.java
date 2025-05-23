package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.UserEntity;
import com.spring.entity.UserRepsitory;
@Service
public class UserService {
    @Autowired
    private UserRepsitory userrepsitry;

    public String userSignup(String name, String email, String password) {
        System.out.println("Received Detail from controller");

        UserEntity ref = new UserEntity();
        ref.setName(name);
        ref.setEmail(email);
        ref.setAddress(password);  // Assuming address temporarily holds the password

        userrepsitry.save(ref);  // Save to database

        return "User Account created successfully";
    }
}
