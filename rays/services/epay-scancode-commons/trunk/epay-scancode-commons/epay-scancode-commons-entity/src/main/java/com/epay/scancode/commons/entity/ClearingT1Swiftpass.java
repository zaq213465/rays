package com.epay.scancode.commons.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "tradeDate", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "trade_date"),
	@SelectColumnMapping(property = "appId", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "app_id"),
	@SelectColumnMapping(property = "zwMerchantNo", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "zw_merchant_no"),
	@SelectColumnMapping(property = "bankMerchantNo", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "bank_merchant_no"),
	@SelectColumnMapping(property = "subBankMerchantNo", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "sub_bank_merchant_no"),
	@SelectColumnMapping(property = "bankTradeNo", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "bank_trade_no"),
	@SelectColumnMapping(property = "zwTradeNo", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "zw_trade_no"),
	@SelectColumnMapping(property = "tradeNo", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "trade_no"),
	@SelectColumnMapping(property = "userId", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "user_id"),
	@SelectColumnMapping(property = "tradeType", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "trade_type"),
	@SelectColumnMapping(property = "tradeState", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "trade_state"),
	@SelectColumnMapping(property = "bank", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "bank"),
	@SelectColumnMapping(property = "cny", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "cny"),
	@SelectColumnMapping(property = "totalAmt", type = BigDecimal.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "total_amt"),
	@SelectColumnMapping(property = "redAmt", type = BigDecimal.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "red_amt"),
	@SelectColumnMapping(property = "redRefundAmt", type = BigDecimal.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "red_refund_amt"),
	@SelectColumnMapping(property = "goodsName", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "goods_name"),
	@SelectColumnMapping(property = "fees", type = BigDecimal.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "fees"),
	@SelectColumnMapping(property = "rate", type = BigDecimal.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "rate"),
	@SelectColumnMapping(property = "terminalType", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "terminal_type"),
	@SelectColumnMapping(property = "recId", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "rec_id"),
	@SelectColumnMapping(property = "storeNo", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "store_no"),
	@SelectColumnMapping(property = "merchantName", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "merchant_name"),
	@SelectColumnMapping(property = "cashier", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "cashier"),
	@SelectColumnMapping(property = "subMerId", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "sub_mer_id"),
	@SelectColumnMapping(property = "paidAmt", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "paid_amt"),
	@SelectColumnMapping(property = "temp1", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "temp1"),
	@SelectColumnMapping(property = "temp2", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "temp2"),
	@SelectColumnMapping(property = "temp3", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "temp3"),
	@SelectColumnMapping(property = "temp4", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "temp4"),
	@SelectColumnMapping(property = "tradeTime", type = java.lang.String.class, table = "t_clearing_t1_swiftpass", tableAlias = "A", column = "trade_time"),
})

@Generated("2017-12-04 17:15:50")
public class ClearingT1Swiftpass implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
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
	private Date tradeTime;//交易时间

	
	
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
	
	public String getCny() {
		return this.cny;
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

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
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

	public Date getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

	
	
}

