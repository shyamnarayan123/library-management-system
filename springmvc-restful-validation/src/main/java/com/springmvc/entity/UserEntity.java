package com.springmvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="user-table")
public class UserEntity {
	@Id
	private Integer id;
	private String name;
	private String address;
	private String country;

}
