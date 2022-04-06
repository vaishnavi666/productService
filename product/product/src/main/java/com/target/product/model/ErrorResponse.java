package com.target.product.model;

import java.util.Date;

import com.target.product.constant.ErrorCode;

public class ErrorResponse {
	
	private Date date;
    private String message;
    private ErrorCode code;           
    private String  details;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ErrorCode getCode() {
		return code;
	}
	public void setCode(ErrorCode code) {
		this.code = code;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public ErrorResponse(Date date, String message, ErrorCode code, String details) {
		super();
		this.date = date;
		this.message = message;
		this.code = code;
		this.details = details;
	}
    
   
       
}