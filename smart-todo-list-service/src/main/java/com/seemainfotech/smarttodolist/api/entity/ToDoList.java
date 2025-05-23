package com.seemainfotech.smarttodolist.api.entity;

import java.io.Serial;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ToDoList")
public class ToDoList implements Serializable {

	@Serial
	private static final long serialVersionUID = -6075278294378958659L;

	@Id
	private UUID id;

	private String title;

	private String task;

	private Boolean active;

}
