package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

public class MerchantConfigResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 924990668143973466L;

	private String passageMerchantNo;
	private String payCode;
	private String status;
	private String respDesc;
	
	public String getPassageMerchantNo() {
		return passageMerchantNo;
	}
	public void setPassageMerchantNo(String passageMerchantNo) {
		this.passageMerchantNo = passageMerchantNo;
	}
	public String getPayCode() {
		return payCode;
	}
	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRespDesc() {
		return respDesc;
	}
	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}
}
