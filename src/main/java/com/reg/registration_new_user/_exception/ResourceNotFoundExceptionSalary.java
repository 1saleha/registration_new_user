package com.reg.registration_new_user._exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptionSalary extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExceptionSalary(String message) {
		super(message);
	}

}