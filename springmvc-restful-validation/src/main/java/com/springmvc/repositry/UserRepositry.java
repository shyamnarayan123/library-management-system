package com.springmvc.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.UserEntity;
@Repository
public interface UserRepositry extends JpaRepository<UserEntity, Integer> {

}
