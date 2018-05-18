package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;
import java.util.Map;

/**
 * 公众号支付参数
 * @author Administrator
 *
 */
public class MerchantGzhPayRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String totleAmt;
	private String orderTitle;
	private String orderDesc;
	private String openId;
	private String appId;
	private String attach;//附加信息
	private String terminalIp;
	private String notifyUrl;
	private String expireTime;
	private String limitPay;
	private String opertorId;
	private String storeId;
	private String terminalId;
	private String returnUrl;
	private String remark;
	
	private Map<String, Object> expandParams;//拓展信息

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

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTotleAmt() {
		return totleAmt;
	}

	public void setTotleAmt(String totleAmt) {
		this.totleAmt = totleAmt;
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

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getTerminalIp() {
		return terminalIp;
	}

	public void setTerminalIp(String terminalIp) {
		this.terminalIp = terminalIp;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getLimitPay() {
		return limitPay;
	}

	public void setLimitPay(String limitPay) {
		this.limitPay = limitPay;
	}

	public Map<String, Object> getExpandParams() {
		return expandParams;
	}

	public void setExpandParams(Map<String, Object> expandParams) {
		this.expandParams = expandParams;
	}

}
