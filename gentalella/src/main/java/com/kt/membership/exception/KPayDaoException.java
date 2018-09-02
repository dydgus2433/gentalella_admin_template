package com.kt.membership.exception;


import com.kt.membership.util.Define;

public class KPayDaoException extends Exception{

	private Integer code;
	private String message;
	private String Type;
	public KPayDaoException() {
		this.code		=	Define.ERROR_CODE;
		this.message	=	Define.ERROR_MESSAGE;
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
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	
}
