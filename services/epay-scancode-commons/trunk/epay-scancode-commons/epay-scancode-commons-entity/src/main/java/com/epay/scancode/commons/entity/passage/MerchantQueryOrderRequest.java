package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;
import java.util.Map;

/**
 * 商户提现统一参数
 * @author Administrator
 *
 */
public class MerchantQueryOrderRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String passageTradeNo;
	private String identification;
	
	private Map<String, Object> expandParams;//拓展信息

	public String getPassageTradeNo() {
		return passageTradeNo;
	}

	public void setPassageTradeNo(String passageTradeNo) {
		this.passageTradeNo = passageTradeNo;
	}

	public Map<String, Object> getExpandParams() {
		return expandParams;
	}

	public void setExpandParams(Map<String, Object> expandParams) {
		this.expandParams = expandParams;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	
}
