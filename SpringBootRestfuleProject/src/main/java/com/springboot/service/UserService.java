package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.entity.User;

public interface UserService {
	public User createUser(User user);
	public List<User>getAllUsers();
	public Optional<User> getUserDetail(int id);
	public User updateUserDetail(int id ,User user);

}
