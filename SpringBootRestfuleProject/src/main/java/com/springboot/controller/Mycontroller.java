package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;
import com.springboot.service.UserService;

@RestController
public class Mycontroller {
	@Autowired
	private UserService userservice;

	@PostMapping("/user")
	public User addUserDetail(@RequestBody User user) {

		return userservice.createUser(user);
	}

	@GetMapping("/user")
	public List getAlluserDetail() {
		return userservice.getAllUsers();

	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserDetails(@PathVariable int id) {
		User user = userservice.getUserDetail(id).orElse(null);
		if (user != null) {
			return ResponseEntity.ok().body(user);
		} else {
			return ResponseEntity.notFound().build();
		}

	}

	@PutMapping("user/{id}")
	public ResponseEntity<User> updateUserDetail(@PathVariable int id, @RequestBody User user)

	{

		User updateUser = userservice.updateUserDetail(id, user);
		if (updateUser != null) {
			return ResponseEntity.ok(updateUser);

		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
