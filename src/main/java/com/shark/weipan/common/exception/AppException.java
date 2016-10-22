package com.shark.weipan.common.exception;

public class AppException extends Throwable {
	
	public AppException(){
		
	}
	
	public AppException(String msg){
		super(msg);
	}
	
	public AppException(String msg,Throwable cause){
		super(msg, cause);
	}
	
	public AppException(Throwable cause){
		super(cause);
	}

}
