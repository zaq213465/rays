/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2016
 */package com.epay.scancode.commons.vo;

import com.epay.commons.base.annotation.Generated;
import com.epay.scancode.commons.entity.PlatfromLimit;

@Generated("2016-11-18 15:02:00")
public class PlatfromLimitVo extends PlatfromLimit{
	private static final long serialVersionUID = 1L;
	
	private String operatorName;
	
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String value) {
		this.operatorName = value;
	}
	
	private String paraName;

	public String getParaName() {
		return paraName;
	}
	public void setParaName(String paraName) {
		this.paraName = paraName;
	}
}
	

