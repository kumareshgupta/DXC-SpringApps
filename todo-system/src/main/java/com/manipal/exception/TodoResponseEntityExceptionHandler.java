package com.manipal.exception;

import java.time.LocalDate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class TodoResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(ToDoNotFoundException.class)
	public ResponseEntity<ExceptionResponse> todoNotFound(ToDoNotFoundException exception){
		ExceptionResponse response = new ExceptionResponse(exception.getMessage(), "Please use correct id.", LocalDate.now());
		return new ResponseEntity<ExceptionResponse>(response, HttpStatus.NOT_FOUND);		
	}
}
