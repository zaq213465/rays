/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2016
 */package com.epay.scancode.commons.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "ID"),
	@SelectColumnMapping(property = "channelNo", type = java.lang.String.class, table = "t_order_pay", tableAlias = "A", column = "channel_no"),
	@SelectColumnMapping(property = "agentNo", type = java.lang.String.class, table = "t_order_pay", tableAlias = "A", column = "agent_no"),
	@SelectColumnMapping(property = "merchantNo", type = java.lang.String.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "MERCHANT_NO"),
	@SelectColumnMapping(property = "payCode", type = java.lang.String.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "PAY_CODE"),
	@SelectColumnMapping(property = "t0Rate", type = BigDecimal.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "T0_RATE"),
	@SelectColumnMapping(property = "t1Rate", type = BigDecimal.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "T1_RATE"),
	@SelectColumnMapping(property = "rate", type = BigDecimal.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "RATE"),
	@SelectColumnMapping(property = "rateAmount", type = BigDecimal.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "RATE_AMOUNT"),
	@SelectColumnMapping(property = "recordStatus", type = java.lang.String.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "RECORD_STATUS"),
	@SelectColumnMapping(property = "status", type = java.lang.String.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "STATUS"),
	@SelectColumnMapping(property = "acceptStatus", type = java.lang.String.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "accept_status"),
	@SelectColumnMapping(property = "createTime", type = java.util.Date.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "CREATE_TIME"),
	@SelectColumnMapping(property = "updateTime", type = java.util.Date.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "UPDATE_TIME"),
	@SelectColumnMapping(property = "operator", type = java.lang.String.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "OPERATOR"),
	@SelectColumnMapping(property = "remark", type = java.lang.String.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "REMARK"),
	@SelectColumnMapping(property = "temp1", type = java.lang.String.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "TEMP_1"),
	@SelectColumnMapping(property = "temp2", type = java.lang.String.class, table = "t_merchant_payway_tmp", tableAlias = "A", column = "TEMP_2")
})

@Generated("2016-11-15 17:17:04")
public class TimerMerchantPayway implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//id
	private String channelNo;//渠道编号
	private String agentNo;//代理商编号
	private String merchantNo;//商户编号
	private String payCode;//支付通道代码
	private BigDecimal t0Rate;//T0费率
	private BigDecimal t1Rate;//T1费率
	private BigDecimal rate;//提现手续费率
	private BigDecimal rateAmount;//固定手续费金额
	private String recordStatus;//记录状态
	private String status;//状态，1：正常，2：关闭
	private String acceptStatus;//入网状态，0：初始，1：成功，2：失败
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	private String operator;//操作人账号
	private String remark;//备注
	private String temp1;//temp1
	private String temp2;//temp2

	public String getChannelNo() {
		return channelNo;
	}

	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}

	public String getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setMerchantNo(String value) {
		this.merchantNo = value;
	}
	
	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setPayCode(String value) {
		this.payCode = value;
	}
	
	public String getPayCode() {
		return this.payCode;
	}
	public void setT0Rate(BigDecimal value) {
		this.t0Rate = value;
	}
	
	public BigDecimal getT0Rate() {
		return this.t0Rate;
	}
	public void setT1Rate(BigDecimal value) {
		this.t1Rate = value;
	}
	
	public BigDecimal getT1Rate() {
		return this.t1Rate;
	}
	public void setRate(BigDecimal value) {
		this.rate = value;
	}
	
	public BigDecimal getRate() {
		return this.rate;
	}
	public void setRateAmount(BigDecimal value) {
		this.rateAmount = value;
	}
	
	public BigDecimal getRateAmount() {
		return this.rateAmount;
	}
	public void setRecordStatus(String value) {
		this.recordStatus = value;
	}
	
	public String getRecordStatus() {
		return this.recordStatus;
	}
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return this.status;
	}
	public void setAcceptStatus(String value) {
		this.acceptStatus = value;
	}
	
	public String getAcceptStatus() {
		return this.acceptStatus;
	}
	public void setCreateTime(Date value) {
		this.createTime = value;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setUpdateTime(Date value) {
		this.updateTime = value;
	}
	
	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setOperator(String value) {
		this.operator = value;
	}
	
	public String getOperator() {
		return this.operator;
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

