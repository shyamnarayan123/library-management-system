package com.springrestfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrestfull.entity.UserEntityDemo;

public interface UserRepositryDemo extends JpaRepository<UserEntityDemo, String> {

}
