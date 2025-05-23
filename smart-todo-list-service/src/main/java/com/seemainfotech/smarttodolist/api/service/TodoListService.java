package com.seemainfotech.smarttodolist.api.service;

import java.util.List;

import java.util.List;

import com.seemainfotech.smarttodolist.api.entity.ToDoList;
import com.seemainfotech.smarttodolist.api.entity.ToDoList;
import com.seemainfotech.smarttodolist.api.request.CreateToDoListRequest;
import com.seemainfotech.smarttodolist.api.response.CreateToDoListResponse;

public interface TodoListService {

	CreateToDoListResponse create(CreateToDoListRequest request);

	List<ToDoList> get();

}
