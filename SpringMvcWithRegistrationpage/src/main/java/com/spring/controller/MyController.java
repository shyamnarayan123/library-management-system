package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @Autowired
    private UserService userservice;

    @GetMapping("/singup")
    public String singupForm() {
        return "user_register";  // Displays user registration form
    }

    @PostMapping("/account/singup")
    public String userSingnup(HttpServletRequest request) {
        String name = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        System.out.println("Received Detail from signup: " + name + ", " + email + ", " + password);

        // Store user information using service
     String str= userservice.userSignup(name, email, password);
		/*
		 * ModelAndView mv=new ModelAndView(); mv.setViewName("Message");//jsp file name
		 * mv.addObject("response",str);//value for jsp element.
		 * 
		 * 
		 * 
		 * 
		 * return "mv"; // Display confirmation message
		 */   
     return "message"; 
    		 }
}
