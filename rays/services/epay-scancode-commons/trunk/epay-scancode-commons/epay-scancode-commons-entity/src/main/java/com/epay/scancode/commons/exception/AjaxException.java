package com.epay.scancode.commons.exception;

/**
 * ajax异常处理
 * @author husain
 *
 */
public class AjaxException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7108634342231737186L;
	private String errorCode="1";
	private String errorMessage="系统错误";
	
	public AjaxException(String errorCode,String errorMessage){
		this.errorCode=errorCode;
		this.errorMessage=errorMessage;
	}
	public AjaxException(String errorMessage){
		this.errorMessage=errorMessage;
	}
	public AjaxException(){
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
