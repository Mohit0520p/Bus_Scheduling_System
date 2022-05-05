package com.hexaware.Busmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends RuntimeException {

	String message ;

	public ResourceNotFoundException(String message) {
		super();
		this.message = message;
	
	
}
}
