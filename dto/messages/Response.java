package com.pos.dto.messages;

import org.springframework.http.HttpStatus;

import com.pos.enums.ErrorCode;
import com.pos.enums.Type;

public class Response {
	private Type type;
	private String message;
	private ErrorCode errorCode;
	private HttpStatus httpStatus;
	
	
	public Response() {
		super();
	}
	public Response(Type type,ErrorCode errorCode, String message, HttpStatus httpStatus) {
		super();
		this.type = type;
		this.errorCode = errorCode;
		this.message = message;
		this.httpStatus = httpStatus;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public ErrorCode getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	
}
