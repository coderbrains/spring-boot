package com.crud.embeded.response;

public class ResponseModel {

	private int status;
	private String message;
	private Object object;
	
	/*
	 * status segments......
	 * 
	 * 1 . success
	 * 0. fail
	 * 3 . Not Found 
	 * 
	 */
	
	public ResponseModel(int status, String message) {
		this.status = status;
		this.message = message;
	}
	
	public ResponseModel(int status, Object object) {
		this.status =  status;
		this.object = object;
	}
}
