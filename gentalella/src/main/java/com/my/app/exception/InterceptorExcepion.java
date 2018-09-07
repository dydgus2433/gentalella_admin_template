package com.my.app.exception;

public class InterceptorExcepion extends Exception {
	
	private Integer code;
	private String message;
	private Character exitYn;
	
	public InterceptorExcepion(Integer code, String message) {
		super(message, new Throwable(message));
		this.code = code;
		this.message = message;
		
	}
	
	public InterceptorExcepion(Integer code, String message, Character exitYn) {
		super(message, new Throwable(message));
		this.code = code;
		this.message = message;
		this.exitYn = exitYn;
		
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

	public Character getExitYn() {
		return exitYn;
	}

	public void setExitYn(Character exitYn) {
		this.exitYn = exitYn;
	}
	
	
}
