package com.springboot.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.User;

public interface UserRepositry extends JpaRepository<User, Integer> {
	
	

}
