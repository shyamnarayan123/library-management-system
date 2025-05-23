package com.springjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_123") 
@Data               // Generates getters, setters, toString, equals, and hashCode.
@NoArgsConstructor // Default no-argument constructor.
@AllArgsConstructor // Constructor with all arguments.
public class User {

	
    @Id
	private int id;
	private String name;
	private double salary;
	private String address;
	private int pinode;
	private String country;

}
