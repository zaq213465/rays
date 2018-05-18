package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

public class BaseResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String respCode;
	private String respMsg;
	private String passageTradeNo;//第三方通道流水号，请求头流水号
	private String platfromTradeNo;//我们平台流水号
	private String returnTime;
	
	public String getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}
	public String getPlatfromTradeNo() {
		return platfromTradeNo;
	}
	public void setPlatfromTradeNo(String platfromTradeNo) {
		this.platfromTradeNo = platfromTradeNo;
	}
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	public String getPassageTradeNo() {
		return passageTradeNo;
	}
	public void setPassageTradeNo(String passageTradeNo) {
		this.passageTradeNo = passageTradeNo;
	}
}
