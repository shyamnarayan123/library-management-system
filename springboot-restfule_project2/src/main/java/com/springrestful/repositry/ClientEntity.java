package com.springrestful.repositry;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data 
@Entity
@Table(name="client_detail")
public class ClientEntity {
     
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String address;
	private long mobilnumber;

}
