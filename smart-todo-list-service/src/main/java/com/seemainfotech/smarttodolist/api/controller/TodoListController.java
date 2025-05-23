package com.seemainfotech.smarttodolist.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seemainfotech.smarttodolist.api.entity.ToDoList;
import com.seemainfotech.smarttodolist.api.request.CreateToDoListRequest;
import com.seemainfotech.smarttodolist.api.response.CreateToDoListResponse;
import com.seemainfotech.smarttodolist.api.service.TodoListService;

 


@RestController
public class TodoListController {
	
	@Autowired	
	private  TodoListService service;

	@PostMapping("/create")
	public CreateToDoListResponse create(@RequestBody CreateToDoListRequest request) {
		return service.create(request);
	}
	
	@GetMapping("/get-all")
	public List<ToDoList> get(){
		return service.get();
	}
	
}
