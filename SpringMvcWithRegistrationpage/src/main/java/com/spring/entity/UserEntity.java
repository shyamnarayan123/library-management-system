package com.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user") // Optional table name, otherwise defaults to class name
public class UserEntity {
	@Id

	private String name;
	private String email;
	private String address; // Correct the spelling of "adrress"
}
