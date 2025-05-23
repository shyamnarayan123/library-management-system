package com.seemainfotech.smarttodolist.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seemainfotech.smarttodolist.api.entity.ToDoList;

@Repository
public interface ToDoListRepository extends JpaRepository<ToDoList, UUID> {

}
