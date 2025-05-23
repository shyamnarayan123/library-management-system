package com.seemainfotech.smarttodolist.api.response;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

import lombok.Data;

@Data
public class CreateToDoListResponse implements Serializable {

	@Serial
	private static final long serialVersionUID = -8587251831702284803L;
	
	private UUID id;

}
