package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.entity.UserEntity;
import com.springmvc.serviceimpl.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	UserServiceImpl  userserviceimpl;
	
	@PostMapping("/user")
	public String UserCreate(@RequestBody  UserEntity  userentity) {
		return UserCreate(userentity);
	}

}
