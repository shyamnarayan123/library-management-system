package com.spring.entity;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.entity.UserEntity;

public interface UserRepsitory extends JpaRepository<UserEntity,String> {
}
