package com.kt.membership.exception;

import com.kt.membership.util.Define;

public class AuthenticationException extends RuntimeException {
	private Integer code;
	private String message;

	public AuthenticationException() {
		this.code		=	Define.ERROR_CODE;
		this.message	=	Define.ERROR_MESSAGE;
	}
	
	public AuthenticationException(Integer code, String message) {
		super(message, new Throwable(message));
		this.code		=	code;
		this.message	=	message;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
