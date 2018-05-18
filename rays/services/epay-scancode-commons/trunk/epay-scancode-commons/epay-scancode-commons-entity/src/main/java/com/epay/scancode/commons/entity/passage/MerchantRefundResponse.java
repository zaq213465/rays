package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

/**
 * 退款返回报文
 * @author husain
 *
 */
public class MerchantRefundResponse extends BaseResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String orderNo;
	private String userOrderNo;
	private String busType;
	private String payCode;
	private String channelNo;
	private String merchantNo;
	private String orderTitle;
	private String orderDesc;
	private String orderAmt;
	private String orderStatus;
	private String beginTime;
	private String endTime;
	private String ip;
	private String accountType;
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
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getUserOrderNo() {
		return userOrderNo;
	}
	public void setUserOrderNo(String userOrderNo) {
		this.userOrderNo = userOrderNo;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	@Override
	public String toString() {
		return "MerchantRefundResponse [orderNo=" + orderNo + ", userOrderNo=" + userOrderNo + ", busType=" + busType
				+ ", payCode=" + payCode + ", channelNo=" + channelNo + ", merchantNo=" + merchantNo + ", orderTitle="
				+ orderTitle + ", orderDesc=" + orderDesc + ", orderAmt=" + orderAmt + ", orderStatus=" + orderStatus
				+ ", beginTime=" + beginTime + ", endTime=" + endTime + ", ip=" + ip + ", accountType=" + accountType
				+ ", remark=" + remark + ", passageOrderNo=" + passageOrderNo + ", payPlatOrderNo=" + payPlatOrderNo
				+ "]";
	}
	

}
