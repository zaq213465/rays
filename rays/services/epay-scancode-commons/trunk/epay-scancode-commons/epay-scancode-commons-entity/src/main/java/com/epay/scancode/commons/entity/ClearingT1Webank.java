package com.epay.scancode.commons.entity;

import java.math.BigDecimal;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "tradeDate", type = java.lang.String.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "trade_date"),
	@SelectColumnMapping(property = "agencyNo", type = java.lang.String.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "agency_no"),
	@SelectColumnMapping(property = "agencyName", type = java.lang.String.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "agency_name"),
	@SelectColumnMapping(property = "merchantNo", type = java.lang.String.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "merchant_no"),
	@SelectColumnMapping(property = "merchantName", type = java.lang.String.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "merchant_name"),
	@SelectColumnMapping(property = "tradeType", type = java.lang.String.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "trade_type"),
	@SelectColumnMapping(property = "tradeNo", type = java.lang.String.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "trade_no"),
	@SelectColumnMapping(property = "webankTradeNo", type = java.lang.String.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "webank_trade_no"),
	@SelectColumnMapping(property = "hfTradeNo", type = java.lang.String.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "hf_trade_no"),
	@SelectColumnMapping(property = "tradeAmt", type = BigDecimal.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "trade_amt"),
	@SelectColumnMapping(property = "merchantFees", type = BigDecimal.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "merchant_fees"),
	@SelectColumnMapping(property = "agencyFees", type = BigDecimal.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "agency_fees"),
	@SelectColumnMapping(property = "clearAmt", type = BigDecimal.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "clear_amt"),
	@SelectColumnMapping(property = "temp1", type = java.lang.String.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "temp_1"),
	@SelectColumnMapping(property = "temp2", type = java.lang.String.class, table = "t_clearing_t1_webank", tableAlias = "A", column = "temp_2")
})

@Generated("2017-05-03 17:39:17")
public class ClearingT1Webank implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//主键id
	private String tradeDate;//交易日期
	private String agencyNo;//代理商编号
	private String agencyName;//代理商名称
	private String merchantNo;//商户编号
	private String merchantName;//商户名称
	private String tradeType;//交易类型
	private String tradeNo;//商户订单号
	private String webankTradeNo;//微众订单号
	private String hfTradeNo;//原商户订单号
	private BigDecimal tradeAmt;//交易金额
	private BigDecimal merchantFees;//商户手续费
	private BigDecimal agencyFees;//代理商手续费
	private BigDecimal clearAmt;//清算金额
	private String temp1;//temp1
	private String temp2;//temp2

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
	public void setAgencyNo(String value) {
		this.agencyNo = value;
	}
	
	public String getAgencyNo() {
		return this.agencyNo;
	}
	public void setAgencyName(String value) {
		this.agencyName = value;
	}
	
	public String getAgencyName() {
		return this.agencyName;
	}
	public void setMerchantNo(String value) {
		this.merchantNo = value;
	}
	
	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setMerchantName(String value) {
		this.merchantName = value;
	}
	
	public String getMerchantName() {
		return this.merchantName;
	}
	public void setTradeType(String value) {
		this.tradeType = value;
	}
	
	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeNo(String value) {
		this.tradeNo = value;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setWebankTradeNo(String value) {
		this.webankTradeNo = value;
	}
	
	public String getWebankTradeNo() {
		return this.webankTradeNo;
	}
	public void setHfTradeNo(String value) {
		this.hfTradeNo = value;
	}
	
	public String getHfTradeNo() {
		return this.hfTradeNo;
	}
	public void setTradeAmt(BigDecimal value) {
		this.tradeAmt = value;
	}
	
	public BigDecimal getTradeAmt() {
		return this.tradeAmt;
	}
	public void setMerchantFees(BigDecimal value) {
		this.merchantFees = value;
	}
	
	public BigDecimal getMerchantFees() {
		return this.merchantFees;
	}
	public void setAgencyFees(BigDecimal value) {
		this.agencyFees = value;
	}
	
	public BigDecimal getAgencyFees() {
		return this.agencyFees;
	}
	public void setClearAmt(BigDecimal value) {
		this.clearAmt = value;
	}
	
	public BigDecimal getClearAmt() {
		return this.clearAmt;
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

	@Override
	public String toString() {
		return "ClearingT1Webank [id=" + id + ", tradeDate=" + tradeDate + ", agencyNo=" + agencyNo + ", agencyName="
				+ agencyName + ", merchantNo=" + merchantNo + ", merchantName=" + merchantName + ", tradeType="
				+ tradeType + ", tradeNo=" + tradeNo + ", webankTradeNo=" + webankTradeNo + ", hfTradeNo=" + hfTradeNo
				+ ", tradeAmt=" + tradeAmt + ", merchantFees=" + merchantFees + ", agencyFees=" + agencyFees
				+ ", clearAmt=" + clearAmt + ", temp1=" + temp1 + ", temp2=" + temp2 + "]";
	}

}

