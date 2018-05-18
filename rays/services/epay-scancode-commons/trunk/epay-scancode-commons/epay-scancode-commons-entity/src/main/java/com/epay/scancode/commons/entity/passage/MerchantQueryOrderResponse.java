package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

/**
 * 商户支付查询结果
 * @author Administrator
 *
 */
public class MerchantQueryOrderResponse extends BaseResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String busType;
	private String payCode;
	private String orderTitle;
	private String orderDesc;
	private String orderAmt;
	private String orderStatus;
	private String beginTime;
	private String endTime;
	private String ip;
	private String accountType;
	private String buyerUserId;//买家支付宝ID
	private String buyerLogonId;//买家支付宝账号
	private String remark;
	private String passageOrderNo;//第三方交易流水号
	private String payPlatOrderNo;//微信、支付宝的流水号
	
	public String getPayPlatOrderNo() {
		return payPlatOrderNo;
	}
	public void setPayPlatOrderNo(String payPlatOrderNo) {
		this.payPlatOrderNo = payPlatOrderNo;
	}
	public String getPassageOrderNo() {
		return passageOrderNo;
	}
	public void setPassageOrderNo(String passageOrderNo) {
		this.passageOrderNo = passageOrderNo;
	}
	public String getBuyerUserId() {
		return buyerUserId;
	}
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerLogonId() {
		return buyerLogonId;
	}
	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getPayCode() {
		return payCode;
	}
	public void setPayCode(String payCode) {
		this.payCode = payCode;
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
	public String getOrderAmt() {
		return orderAmt;
	}
	public void setOrderAmt(String orderAmt) {
		this.orderAmt = orderAmt;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "MerchantQueryOrderResponse [busType=" + busType + ", payCode=" + payCode + ", orderTitle=" + orderTitle
				+ ", orderDesc=" + orderDesc + ", orderAmt=" + orderAmt + ", orderStatus=" + orderStatus
				+ ", beginTime=" + beginTime + ", endTime=" + endTime + ", ip=" + ip + ", accountType=" + accountType
				+ ", buyerUserId=" + buyerUserId + ", buyerLogonId=" + buyerLogonId + ", remark=" + remark
				+ ", passageOrderNo=" + passageOrderNo + ", payPlatOrderNo=" + payPlatOrderNo + "]";
	}

}
