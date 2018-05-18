package com.epay.scancode.commons.condition;

import java.math.BigDecimal;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.utils.PagingCondition;

@Generated("2017-12-04 17:15:50")
public class ClearingT1SwiftpassCondition extends PagingCondition {
	
	private static final long serialVersionUID = 1L;
	
	private String id;//id
	private String tradeDate;//交易时间
	private String appId;//微信公众账号appid
	private String zwMerchantNo;//第三方商户号  如:微信商户号
	private String bankMerchantNo;//商户号 平台分配的大商户号
	private String subBankMerchantNo;//子商户号 平台分配的商户号
	private String bankTradeNo;//平台订单号
	private String zwTradeNo;//第三方订单号
	private String tradeNo;//商户订单号
	private String userId;//用户标识
	private String tradeType;//交易类型
	private String tradeState;//交易状态
	private String bank;//付款银行
	private String cny;//货币种类
	private BigDecimal totalAmt;//总金额
	private BigDecimal redAmt;//企业红包金额
	private BigDecimal redRefundAmt;//企业红包退款金额
	private String goodsName;//商品名称
	private BigDecimal fees;//手续费
	private BigDecimal rate;//费率
	private String terminalType;//终端类型
	private String recId;//对账标识
	private String storeNo;//门店编号
	private String merchantName;//商户名称
	private String cashier;//收银员
	private String subMerId;//子商户ID
	private String paidAmt;//实收金额
	private String temp1;//temp1
	private String temp2;//temp2
	private String temp3;//temp3
	private String temp4;//temp4
	private String tradeTime;

	
	
	public String getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setTradeDate(String value) {
		this.tradeDate = value;
	}
	
	public String getTradeDate() {
		return this.tradeDate;
	}
	public void setAppId(String value) {
		this.appId = value;
	}
	
	public String getAppId() {
		return this.appId;
	}
	public void setZwMerchantNo(String value) {
		this.zwMerchantNo = value;
	}
	
	public String getZwMerchantNo() {
		return this.zwMerchantNo;
	}
	public void setBankMerchantNo(String value) {
		this.bankMerchantNo = value;
	}
	
	public String getBankMerchantNo() {
		return this.bankMerchantNo;
	}
	public void setSubBankMerchantNo(String value) {
		this.subBankMerchantNo = value;
	}
	
	public String getSubBankMerchantNo() {
		return this.subBankMerchantNo;
	}
	public void setBankTradeNo(String value) {
		this.bankTradeNo = value;
	}
	
	public String getBankTradeNo() {
		return this.bankTradeNo;
	}
	public void setZwTradeNo(String value) {
		this.zwTradeNo = value;
	}
	
	public String getZwTradeNo() {
		return this.zwTradeNo;
	}
	public void setTradeNo(String value) {
		this.tradeNo = value;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setUserId(String value) {
		this.userId = value;
	}
	
	public String getUserId() {
		return this.userId;
	}
	public void setTradeType(String value) {
		this.tradeType = value;
	}
	
	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeState(String value) {
		this.tradeState = value;
	}
	
	public String getTradeState() {
		return this.tradeState;
	}
	public void setBank(String value) {
		this.bank = value;
	}
	
	public String getBank() {
		return this.bank;
	}
	public void setCny(String value) {
		this.cny = value;
	}
	

	public void setGoodsName(String value) {
		this.goodsName = value;
	}
	
	public String getGoodsName() {
		return this.goodsName;
	}
	
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	public BigDecimal getRedAmt() {
		return redAmt;
	}

	public void setRedAmt(BigDecimal redAmt) {
		this.redAmt = redAmt;
	}

	public BigDecimal getRedRefundAmt() {
		return redRefundAmt;
	}

	public void setRedRefundAmt(BigDecimal redRefundAmt) {
		this.redRefundAmt = redRefundAmt;
	}

	public BigDecimal getFees() {
		return fees;
	}

	public void setFees(BigDecimal fees) {
		this.fees = fees;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getCny() {
		return cny;
	}

	public void setTerminalType(String value) {
		this.terminalType = value;
	}
	
	public String getTerminalType() {
		return this.terminalType;
	}
	public void setRecId(String value) {
		this.recId = value;
	}
	
	public String getRecId() {
		return this.recId;
	}
	public void setStoreNo(String value) {
		this.storeNo = value;
	}
	
	public String getStoreNo() {
		return this.storeNo;
	}
	public void setMerchantName(String value) {
		this.merchantName = value;
	}
	
	public String getMerchantName() {
		return this.merchantName;
	}
	public void setCashier(String value) {
		this.cashier = value;
	}
	
	public String getCashier() {
		return this.cashier;
	}
	public void setSubMerId(String value) {
		this.subMerId = value;
	}
	
	public String getSubMerId() {
		return this.subMerId;
	}
	public void setPaidAmt(String value) {
		this.paidAmt = value;
	}
	
	public String getPaidAmt() {
		return this.paidAmt;
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
	public void setTemp3(String value) {
		this.temp3 = value;
	}
	
	public String getTemp3() {
		return this.temp3;
	}
	public void setTemp4(String value) {
		this.temp4 = value;
	}
	
	public String getTemp4() {
		return this.temp4;
	}
}

