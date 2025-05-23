package com.seemainfotech.smarttodolist.api.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seemainfotech.smarttodolist.api.entity.ToDoList;
import com.seemainfotech.smarttodolist.api.repository.ToDoListRepository;
import com.seemainfotech.smarttodolist.api.request.CreateToDoListRequest;
import com.seemainfotech.smarttodolist.api.response.CreateToDoListResponse;
import com.seemainfotech.smarttodolist.api.service.TodoListService;


@Service
public class ToDoListServiceImpl implements TodoListService {

	@Autowired
	private ToDoListRepository repository;

	@Override
	public CreateToDoListResponse create(CreateToDoListRequest request) {

		ToDoList todo = new ToDoList();

		todo.setId(UUID.randomUUID());
		todo.setTitle(request.getTitle());
		todo.setTask(request.getTask());
		todo.setActive(request.getActive());

		ToDoList save = repository.save(todo);
		
		CreateToDoListResponse response = new CreateToDoListResponse();
		response.setId(save.getId());
		
		return response;
	}

	@Override
	public List<ToDoList> get() {
		return repository.findAll();
	}

	
}
