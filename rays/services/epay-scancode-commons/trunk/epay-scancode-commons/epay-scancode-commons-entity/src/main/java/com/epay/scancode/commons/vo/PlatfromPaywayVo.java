/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2016
 */package com.epay.scancode.commons.vo;

import com.epay.commons.base.annotation.Generated;
import com.epay.scancode.commons.entity.PlatfromPayway;

@Generated("2016-10-21 10:21:59")
public class PlatfromPaywayVo extends PlatfromPayway{
	private static final long serialVersionUID = 1L;
	
	private String operatorName;
	
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String value) {
		this.operatorName = value;
	}
	
	private String payName;

	public String getPayName() {
		return payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}
	
}
	

