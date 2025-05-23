package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.User;
import com.springboot.repositry.UserRepositry;

@Service
public class UserServiceImple implements UserService {
	@Autowired
	private UserRepositry userRepositry;

	@Override
	public User createUser(User user) {

		return userRepositry.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		
		
		return userRepositry.findAll();
	}

	@Override
	public Optional<User> getUserDetail(int id) {
		
		return userRepositry.findById(id);
	}

	@Override
	public User updateUserDetail(int id, User newuser) {
	User userdata=	userRepositry.findById(id).orElse(null);
	if(userdata!=null) {
		return userRepositry.save(newuser);
	}
		
		 throw new RuntimeException("User not found with id:"+id);
	}

}
