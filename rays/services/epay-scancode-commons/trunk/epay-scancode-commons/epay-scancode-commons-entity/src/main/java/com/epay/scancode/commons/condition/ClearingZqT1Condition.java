package com.epay.scancode.commons.condition;

import java.math.BigDecimal;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.utils.PagingCondition;

@Generated("2017-05-26 11:40:29")
public class ClearingZqT1Condition extends PagingCondition {
	
	private static final long serialVersionUID = 1L;
	
	private String id;//主键id
	private String batchNo;//批次号
	private String clearDate;//清算日期
	private String payCode;//支付代码
	private String merchantNo;//商户编号
	private String hfMerchantNo;//华付通商户编号
	private String account;//交易账号
	private String accountName;//交易户名
	private BigDecimal transAmt;//清算金额
	private BigDecimal merchantSingleFees;//商户单笔清算手续费
	private BigDecimal channelSingleFees;//渠道单笔清算手续费
	private BigDecimal channelClearCostFees;//渠道清算成本
	private String temp1;//temp1
	private String temp2;//temp2

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setBatchNo(String value) {
		this.batchNo = value;
	}
	
	public String getBatchNo() {
		return this.batchNo;
	}
	public void setClearDate(String value) {
		this.clearDate = value;
	}
	
	public String getClearDate() {
		return this.clearDate;
	}
	public void setPayCode(String value) {
		this.payCode = value;
	}
	
	public String getPayCode() {
		return this.payCode;
	}
	public void setMerchantNo(String value) {
		this.merchantNo = value;
	}
	
	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setHfMerchantNo(String value) {
		this.hfMerchantNo = value;
	}
	
	public String getHfMerchantNo() {
		return this.hfMerchantNo;
	}
	public void setAccount(String value) {
		this.account = value;
	}
	
	public String getAccount() {
		return this.account;
	}
	public void setAccountName(String value) {
		this.accountName = value;
	}
	
	public String getAccountName() {
		return this.accountName;
	}
	public void setTransAmt(BigDecimal value) {
		this.transAmt = value;
	}
	
	public BigDecimal getTransAmt() {
		return this.transAmt;
	}
	public void setMerchantSingleFees(BigDecimal value) {
		this.merchantSingleFees = value;
	}
	
	public BigDecimal getMerchantSingleFees() {
		return this.merchantSingleFees;
	}
	public void setChannelSingleFees(BigDecimal value) {
		this.channelSingleFees = value;
	}
	
	public BigDecimal getChannelSingleFees() {
		return this.channelSingleFees;
	}
	public void setChannelClearCostFees(BigDecimal value) {
		this.channelClearCostFees = value;
	}
	
	public BigDecimal getChannelClearCostFees() {
		return this.channelClearCostFees;
	}
	public void setTemp1(String value) {
		this.temp1 = value;
	}
	
	public String getTemp1() {
		return this.temp1;
	}
	public void setTemp2(String value) {
		this.temp2 = value;
	}
	
	public String getTemp2() {
		return this.temp2;
	}
}

