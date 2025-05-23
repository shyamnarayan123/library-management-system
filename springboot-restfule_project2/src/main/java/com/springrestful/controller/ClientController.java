package com.springrestful.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrestful.repositry.ClientEntity;
import com.springrestful.service.ClinteService;
//We can insert the  data inside database
@RestController
public class ClientController {
	@Autowired
	ClinteService clientservice;
	
	
	// Insert data into database;
	@PostMapping("/insert")
	public ClientEntity addDetail(@RequestBody ClientEntity cliententity) {
		
		return clientservice.creatClient(cliententity);
		
	}
	
	
	// Get data from database
	@GetMapping("/getitem")
	public List getAllDetail() {
		
		return clientservice.getAllDetail();
		
	}
	
	
	//Get data from database by id 
	@GetMapping("/getitem/{id}")
	public Optional<ClientEntity> getUserDetailId(@PathVariable int  id) {
		return clientservice.getUserDetailId(id);
		
	}


}
