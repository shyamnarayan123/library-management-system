package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.service.UserService;

@RestController
public class UserController {
	
	
	@GetMapping("delet/user")
	public String deleteUser() {
		System.out.println("In delet user method");
		return "User Deleted Sucessfully";
	}
//
//	@RequestMapping(path = "update/user", method = RequestMethod.GET)
//	public String updateUser() {
//		return "User Updeted sucessfully";
//	}
//
//	@GetMapping("get/user")
//	public String getUser() {
//		return "User get detail successfyully";
//
//	}

}
