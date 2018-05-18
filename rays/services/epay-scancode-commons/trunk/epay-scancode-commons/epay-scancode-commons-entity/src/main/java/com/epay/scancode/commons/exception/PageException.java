package com.epay.scancode.commons.exception;

/**
 * 页面异常异常处理
 * @author husain
 *
 */
public class PageException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7108634342231737186L;
	public static final String BALANCEERROR_PAGE = "scancode/wechat/balanceError";//提现异常页面
	public static final String SCAN_ERROR_PAGE = "scancode/wechat/scan_error";//扫码异常页面
	public static final String DEFALUT_ERROR_CODE="1";
	private String errorCode=DEFALUT_ERROR_CODE;
	private String errorMessage="系统错误";
	private String errorPage=SCAN_ERROR_PAGE;//出现异常跳转的页面,默认到扫码异常页面
	private String otherMessage;//额外信息，暂时用一个字符串，如果涉及到可能携带多个信息可以修改为集合对象
	public PageException(String errorCode,String errorMessage){
		this.errorCode=errorCode;
		this.errorMessage=errorMessage;
	}
	public PageException(String errorMessage){
		this.errorMessage=errorMessage;
	}
	public PageException(){
	}

	public PageException(String errorCode,String errorMessage,String errorPage){
		this(errorCode, errorMessage);
		this.errorPage = errorPage;
	}
	public PageException(String errorCode,String errorMessage,String errorPage,String otherMessage){
		this(errorCode, errorMessage,errorPage);
		this.otherMessage = otherMessage;
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
	public String getErrorPage() {
		return errorPage;
	}
	public void setErrorPage(String errorPage) {
		this.errorPage = errorPage;
	}
	public String getOtherMessage() {
		return otherMessage;
	}
	public void setOtherMessage(String otherMessage) {
		this.otherMessage = otherMessage;
	}
	
	
	
}
