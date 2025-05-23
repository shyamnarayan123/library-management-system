package com.springmvc.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositry extends JpaRepository<UserEntity, Integer>{

}
