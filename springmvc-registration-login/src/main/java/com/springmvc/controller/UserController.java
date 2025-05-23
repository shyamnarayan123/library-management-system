package com.springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UserController {
    @GetMapping("/singup")  // Correct mapping
    public String signupForm() {
        return "user_register";  // Return view name
    }
}
