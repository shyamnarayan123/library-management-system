package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


	@GetMapping("/hello")
	public String name() {
		return "hello";
	}
	@GetMapping("/hello1")
	public String name1() {
		return "welcome";
	}
	@GetMapping("/hello2")
	public String name2() {
		return "information";
	}
	
	
}
