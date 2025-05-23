package com.springrestfull.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="User_54321")
public class UserEntityDemo {
	
	private String name;
	private int id;
	private String address;
	private String enmail;
	

}
