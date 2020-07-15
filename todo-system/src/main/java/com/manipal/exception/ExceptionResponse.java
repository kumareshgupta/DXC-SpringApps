package com.manipal.exception;

import java.time.LocalDate;

public class ExceptionResponse {
	private String message;
	private String details;
	private LocalDate timestamp;
	
	public ExceptionResponse(String message, String details, LocalDate timestamp) {
		super();
		this.message = message;
		this.details = details;
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public LocalDate getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
}
