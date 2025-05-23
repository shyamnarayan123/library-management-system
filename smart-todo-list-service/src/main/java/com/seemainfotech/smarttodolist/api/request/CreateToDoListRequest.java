package com.seemainfotech.smarttodolist.api.request;

import java.io.Serial;

import java.io.Serializable;

import lombok.Data;
@Data
public class CreateToDoListRequest implements Serializable{ 
	
	@Serial
	private static final long serialVersionUID = 6725576608261751016L;

	private String title;
	private String task;
	private Boolean active;

}
