package com.springmvc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.entity.UserEntity;
import com.springmvc.repositry.UserRepositry;
import com.springmvc.service.UserService;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepositry userrepositry;

	@Override
	public UserEntity createUser(UserEntity userentity) {
		
		return userrepositry.save(userentity) ;
	}

	

}
