/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2016
 */package com.epay.scancode.commons.entity;

import java.math.BigDecimal;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "organNo", type = java.lang.String.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "organ_no"),
	@SelectColumnMapping(property = "organLevel", type = java.lang.String.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "organ_level"),
	@SelectColumnMapping(property = "payCode", type = java.lang.String.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "pay_code"),
	@SelectColumnMapping(property = "type", type = java.lang.String.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "type"),
	@SelectColumnMapping(property = "amount", type = BigDecimal.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "amount"),
	@SelectColumnMapping(property = "rateType", type = java.lang.String.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "rate_type"),
	@SelectColumnMapping(property = "rate", type = BigDecimal.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "rate"),
	@SelectColumnMapping(property = "fixedAmount", type = BigDecimal.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "fixed_amount"),
	@SelectColumnMapping(property = "profitAmount", type = BigDecimal.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "profit_amount"),
	@SelectColumnMapping(property = "costAmount", type = BigDecimal.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "cost_amount"),
	@SelectColumnMapping(property = "settleStatus", type = java.lang.String.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "settle_status"),
	@SelectColumnMapping(property = "settleDate", type = java.lang.String.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "settle_date"),
	@SelectColumnMapping(property = "transDate", type = java.lang.String.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "trans_date"),
	@SelectColumnMapping(property = "remark", type = java.lang.String.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "remark"),
	@SelectColumnMapping(property = "temp1", type = java.lang.String.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "temp_1"),
	@SelectColumnMapping(property = "identityFlag", type = java.lang.String.class, table = "", tableAlias = "M", column = "identity_flag"),
	@SelectColumnMapping(property = "orgName", type = java.lang.String.class, table = "", tableAlias = "M", column = "ORG_NAME"),
	@SelectColumnMapping(property = "temp2", type = java.lang.String.class, table = "t_profit_organ_day_paytype", tableAlias = "A", column = "temp_2")
})

@Generated("2016-11-30 17:50:55")
public class ProfitOrganDayPaytype implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//主键id
	private String organNo;//机构编号
	private String organLevel;//机构级别
	private String payCode;//平台支付通道代码
	private String type;//交易类型，1：交易，2：提现
	private BigDecimal amount;//交易总金额
	private String rateType;//费率类型，1：T0，2：T1
	private BigDecimal rate;//费率
	private BigDecimal fixedAmount;//进出账固定成本金额
	private BigDecimal profitAmount;//分润金额
	private BigDecimal costAmount;//成本金额
	private String settleStatus;//结算状态（0 未结算 1已结算）
	private String settleDate;//结算日期（年月日）
	private String transDate;//交易日期（年月日）
	private String remark;//备注
	private String temp1;//temp1
	private String temp2;//temp2

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setOrganNo(String value) {
		this.organNo = value;
	}
	
	public String getOrganNo() {
		return this.organNo;
	}
	public void setOrganLevel(String value) {
		this.organLevel = value;
	}
	
	public String getOrganLevel() {
		return this.organLevel;
	}
	public void setPayCode(String value) {
		this.payCode = value;
	}
	
	public String getPayCode() {
		return this.payCode;
	}
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return this.type;
	}
	public void setAmount(BigDecimal value) {
		this.amount = value;
	}
	
	public BigDecimal getAmount() {
		return this.amount;
	}
	public void setRateType(String value) {
		this.rateType = value;
	}
	
	public String getRateType() {
		return this.rateType;
	}
	public void setRate(BigDecimal value) {
		this.rate = value;
	}
	
	public BigDecimal getRate() {
		return this.rate;
	}
	public void setFixedAmount(BigDecimal value) {
		this.fixedAmount = value;
	}
	
	public BigDecimal getFixedAmount() {
		return this.fixedAmount;
	}
	public void setProfitAmount(BigDecimal value) {
		this.profitAmount = value;
	}
	
	public BigDecimal getProfitAmount() {
		return this.profitAmount;
	}
	public void setCostAmount(BigDecimal value) {
		this.costAmount = value;
	}
	
	public BigDecimal getCostAmount() {
		return this.costAmount;
	}
	public void setSettleStatus(String value) {
		this.settleStatus = value;
	}
	
	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleDate(String value) {
		this.settleDate = value;
	}
	
	public String getSettleDate() {
		return this.settleDate;
	}
	public void setTransDate(String value) {
		this.transDate = value;
	}
	
	public String getTransDate() {
		return this.transDate;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
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

