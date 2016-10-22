package com.shark.weipan.common.exception;

public class DaoException extends Throwable {
	
	public DaoException(){
		
	}
	
	public DaoException(String msg){
		super(msg);
	}
	
	public DaoException(String msg,Throwable cause){
		super(msg, cause);
	}
	
	public DaoException(Throwable cause){
		super(cause);
	}

}
