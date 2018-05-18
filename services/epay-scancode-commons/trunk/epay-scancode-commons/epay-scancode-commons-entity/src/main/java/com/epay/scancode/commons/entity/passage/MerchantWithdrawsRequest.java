package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;
import java.util.Map;

/**
 * 商户提现统一参数
 * @author Administrator
 *
 */
public class MerchantWithdrawsRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String returnUrl;
	
	private Map<String, Object> expandParams;//拓展信息

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public Map<String, Object> getExpandParams() {
		return expandParams;
	}

	public void setExpandParams(Map<String, Object> expandParams) {
		this.expandParams = expandParams;
	}

}
