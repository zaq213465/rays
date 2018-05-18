/*
 * Since 2016 - 2017
 */
package com.epay.scancode.commons.entity;

import java.util.Date;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "passageNo", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "passage_no"),
	@SelectColumnMapping(property = "channelNo", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "channel_no"),
	@SelectColumnMapping(property = "agentNo", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "agent_no"),
	@SelectColumnMapping(property = "agency", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "agency"),
	@SelectColumnMapping(property = "merchantNo", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "merchant_no"),
	@SelectColumnMapping(property = "payCode", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "pay_code"),
	@SelectColumnMapping(property = "pwayMerchantNo", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "pway_merchant_no"),
	@SelectColumnMapping(property = "passageStatus", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "passage_status"),
	@SelectColumnMapping(property = "createTime", type = java.util.Date.class, table = "t_merchant_passage_config", tableAlias = "A", column = "create_time"),
	@SelectColumnMapping(property = "updateTime", type = java.util.Date.class, table = "t_merchant_passage_config", tableAlias = "A", column = "update_time"),
	@SelectColumnMapping(property = "operator", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "operator"),
	@SelectColumnMapping(property = "recordStatus", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "record_status"),
	@SelectColumnMapping(property = "remark", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "remark"),
	@SelectColumnMapping(property = "temp1", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "temp_1"),
	@SelectColumnMapping(property = "temp2", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "temp_2"),
	@SelectColumnMapping(property = "joinStatus", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "join_status"),
	@SelectColumnMapping(property = "registerType", type = java.lang.String.class, table = "t_merchant_passage_config", tableAlias = "A", column = "register_type")
})

@Generated("2017-03-28 14:01:08")
public class MerchantPassageConfig implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//主键id
	private String passageNo;//通道编号（民生、微众）
	private String channelNo;//渠道编号
	private String agentNo;//代理商编号
	private String agency;//代理机构（上游代理编号）
	private String merchantNo;//商户编号
	private String payCode;//支付通道编号（微信、支付宝、qq钱包）
	private String pwayMerchantNo;//支付通道商户编号
	private String passageStatus;//通道状态：Y 生效中、N未生效
	private Date createTime;//入网时间
	private Date updateTime;//修改时间
	private String operator;//操作人账号
	private String recordStatus;//记录状态
	private String remark;//备注
	private String temp1;//temp1
	private String temp2;//temp2
	private String joinStatus;//入网状态，0：初始，1：成功，2：失败
	private String registerType;//商户模式：1大商户模式，2一户一码模式


	private String channelName;//渠道名称
	private String agentName;//代理商名称
	private String merchantName;//商户名称
	
	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getPassageNo() {
		return passageNo;
	}

	public void setPassageNo(String passageNo) {
		this.passageNo = passageNo;
	}

	public void setChannelNo(String value) {
		this.channelNo = value;
	}
	
	public String getChannelNo() {
		return this.channelNo;
	}
	public void setAgentNo(String value) {
		this.agentNo = value;
	}
	
	public String getAgentNo() {
		return this.agentNo;
	}
	public void setAgency(String value) {
		this.agency = value;
	}
	
	public String getAgency() {
		return this.agency;
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
	public void setPwayMerchantNo(String value) {
		this.pwayMerchantNo = value;
	}
	
	public String getPwayMerchantNo() {
		return this.pwayMerchantNo;
	}
	public void setPassageStatus(String value) {
		this.passageStatus = value;
	}
	
	public String getPassageStatus() {
		return this.passageStatus;
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
	public void setRecordStatus(String value) {
		this.recordStatus = value;
	}
	
	public String getRecordStatus() {
		return this.recordStatus;
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

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getJoinStatus() {
		return joinStatus;
	}

	public void setJoinStatus(String joinStatus) {
		this.joinStatus = joinStatus;
	}

	public String getRegisterType() {
		return registerType;
	}

	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}

	
}

