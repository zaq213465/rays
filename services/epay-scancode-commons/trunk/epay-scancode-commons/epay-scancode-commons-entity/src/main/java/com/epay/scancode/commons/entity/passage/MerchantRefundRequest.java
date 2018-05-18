package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

/**
 * 商户支付参数
 * @author Administrator
 *
 */
public class MerchantRefundRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String wbMerchantId;
	private String orderId;
	private String refundNo;
	private String refundAmount;
	private String refundReason;
	private String operatorId;
	private String storeId;
	private String terminalId;
	
	
	public String getWbMerchantId() {
		return wbMerchantId;
	}
	public void setWbMerchantId(String wbMerchantId) {
		this.wbMerchantId = wbMerchantId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getRefundNo() {
		return refundNo;
	}
	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}
	public String getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundReason() {
		return refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
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
	

}
