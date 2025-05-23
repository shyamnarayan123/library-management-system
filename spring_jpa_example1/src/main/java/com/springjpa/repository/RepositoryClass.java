package com.springjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.entity.User;

public interface RepositoryClass extends JpaRepository<User, Integer> {
	// custom Method
	   List<User>getEmployByAddress(String address);
}
