package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

/**
 * 商户扫码支付统一返回参数
 * @author Administrator
 *
 */
public class MerchantBarCodePayResponse extends BaseResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	
	private String buyerLogonId;//客户微信ID或者支付宝ID
	private String isSubscribe;//是否关注公众号
	private String tradeType;//微信交易类型
	private String totleAmt;
	private String gmtPayment;	//支付完成时间
	private String accountType;
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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBuyerLogonId() {
		return buyerLogonId;
	}

	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}

	public String getIsSubscribe() {
		return isSubscribe;
	}

	public void setIsSubscribe(String isSubscribe) {
		this.isSubscribe = isSubscribe;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getTotleAmt() {
		return totleAmt;
	}

	public void setTotleAmt(String totleAmt) {
		this.totleAmt = totleAmt;
	}

	public String getGmtPayment() {
		return gmtPayment;
	}

	public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}

}
