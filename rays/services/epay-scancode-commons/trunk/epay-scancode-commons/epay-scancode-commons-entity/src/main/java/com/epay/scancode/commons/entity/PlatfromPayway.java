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
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "serverNo", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "server_no"),
	@SelectColumnMapping(property = "serverName", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "server_name"),
	@SelectColumnMapping(property = "payCode", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "pay_code"),
	@SelectColumnMapping(property = "payName", type = java.lang.String.class, table = "t_config_mapping_dicion", tableAlias = "C", column = "para_name"),
	@SelectColumnMapping(property = "payType", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "pay_type"),
	@SelectColumnMapping(property = "payDesc", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "pay_desc"),
	@SelectColumnMapping(property = "paySeq", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "pay_seq"),
	@SelectColumnMapping(property = "t0Rate", type = BigDecimal.class, table = "t_hfepay_payway", tableAlias = "A", column = "t0_rate"),
	@SelectColumnMapping(property = "t1Rate", type = BigDecimal.class, table = "t_hfepay_payway", tableAlias = "A", column = "t1_rate"),
	@SelectColumnMapping(property = "rate", type = BigDecimal.class, table = "t_hfepay_payway", tableAlias = "A", column = "rate"),
	@SelectColumnMapping(property = "recordStatus", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "record_status"),
	@SelectColumnMapping(property = "createTime", type = java.util.Date.class, table = "t_hfepay_payway", tableAlias = "A", column = "create_time"),
	@SelectColumnMapping(property = "updateTime", type = java.util.Date.class, table = "t_hfepay_payway", tableAlias = "A", column = "update_time"),
	@SelectColumnMapping(property = "operator", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "operator"),
	@SelectColumnMapping(property = "remark", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "remark"),
	@SelectColumnMapping(property = "temp1", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "temp_1"),
	@SelectColumnMapping(property = "temp2", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "temp_2"),
	@SelectColumnMapping(property = "temp3", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "temp_3"),
	@SelectColumnMapping(property = "temp4", type = java.lang.String.class, table = "t_hfepay_payway", tableAlias = "A", column = "temp_4")
})

@Generated("2016-10-19 16:13:23")
public class PlatfromPayway implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//id
	private String serverNo;//服务码
	private String serverName;//服务名称
	private String payCode;//平台支付通道代码
	private String payType;//通道类型，1：商户入驻，2：支付通道
	private String payDesc;//支付通道描述
	private String paySeq;//支付通道优先级
	private BigDecimal t0Rate;//垫资费率
	private BigDecimal t1Rate;//交易手续费
	private BigDecimal rate;//提现手续费(成本)
	private String recordStatus;//记录状态，Y:正常，N:删除
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	private String operator;//操作人账号
	private String remark;//备注
	private String temp1;//temp1
	private String temp2;//temp2
	private String temp3;//temp3
	private String temp4;//temp4

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setServerNo(String value) {
		this.serverNo = value;
	}
	
	public String getServerNo() {
		return this.serverNo;
	}
	public void setServerName(String value) {
		this.serverName = value;
	}
	
	public String getServerName() {
		return this.serverName;
	}
	public void setPayCode(String value) {
		this.payCode = value;
	}
	
	public String getPayCode() {
		return this.payCode;
	}
	public void setPayType(String value) {
		this.payType = value;
	}
	
	public String getPayType() {
		return this.payType;
	}
	public void setPayDesc(String value) {
		this.payDesc = value;
	}
	
	public String getPayDesc() {
		return this.payDesc;
	}
	public void setPaySeq(String value) {
		this.paySeq = value;
	}
	
	public String getPaySeq() {
		return this.paySeq;
	}
	
	public BigDecimal getT0Rate() {
		return t0Rate;
	}

	public void setT0Rate(BigDecimal t0Rate) {
		this.t0Rate = t0Rate;
	}

	public BigDecimal getT1Rate() {
		return t1Rate;
	}

	public void setT1Rate(BigDecimal t1Rate) {
		this.t1Rate = t1Rate;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public void setRecordStatus(String value) {
		this.recordStatus = value;
	}
	
	public String getRecordStatus() {
		return this.recordStatus;
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

