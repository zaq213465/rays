package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;
import java.util.Map;

/**
 * 商户支付参数
 * @author Administrator
 *
 */
public class MerchantScanCodePayRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String orderAmt;
	private String orderTitle;
	private String orderDesc;
	private String opertorId;
	private String storeId;
	private String terminalId;
	private String limitPay;
	private String remark;
	private String ip;
	private String appNo;
	private String expireTime;
	private String notifyUrl;
	private String returnUrl;
	
	private String openId;
	private String appid;
	private String identification;
	private Map<String, Object> expandParams;//拓展信息

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getOrderAmt() {
		return orderAmt;
	}

	public void setOrderAmt(String orderAmt) {
		this.orderAmt = orderAmt;
	}

	public String getOrderTitle() {
		return orderTitle;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public String getOpertorId() {
		return opertorId;
	}

	public void setOpertorId(String opertorId) {
		this.opertorId = opertorId;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getLimitPay() {
		return limitPay;
	}

	public void setLimitPay(String limitPay) {
		this.limitPay = limitPay;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAppNo() {
		return appNo;
	}

	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

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

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	
}
