/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2016
 */package com.epay.scancode.commons.vo;

import com.epay.commons.base.annotation.Generated;
import com.epay.scancode.commons.entity.ChannelPayway;

@Generated("2016-10-20 17:39:26")
public class ChannelPaywayVo extends ChannelPayway{
	private static final long serialVersionUID = 1L;
	
	private String operatorName;
	public String getOperatorName() {
		
		return operatorName;
	}
	public void setOperatorName(String value) {
		this.operatorName = value;
	}
	
	private String channelName;
	private String payName;

	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getPayName() {
		return payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}
}
	

