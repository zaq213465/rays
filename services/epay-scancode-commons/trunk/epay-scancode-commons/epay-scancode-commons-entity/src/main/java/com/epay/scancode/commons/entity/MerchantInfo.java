/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2017
 */package com.epay.scancode.commons.entity;

import java.util.Date;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "channelNo", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "channel_no"),
	@SelectColumnMapping(property = "agentNo", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "agent_no"),
	@SelectColumnMapping(property = "merchantNo", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "merchant_no"),
	@SelectColumnMapping(property = "merchantName", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "merchant_name"),
	@SelectColumnMapping(property = "shortName", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "short_name"),
	@SelectColumnMapping(property = "qrCode", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "qr_code"),
	@SelectColumnMapping(property = "creditPayStatus", type = java.lang.Integer.class, table = "t_merchant_info", tableAlias = "A", column = "credit_pay_status"),
	@SelectColumnMapping(property = "authenStatus", type = java.lang.Integer.class, table = "t_merchant_info", tableAlias = "A", column = "authen_status"),
	@SelectColumnMapping(property = "isT0", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "isT0"),
	@SelectColumnMapping(property = "registerType", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "register_type"),
	@SelectColumnMapping(property = "status", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "status"),
	@SelectColumnMapping(property = "createTime", type = java.util.Date.class, table = "t_merchant_info", tableAlias = "A", column = "create_time"),
	@SelectColumnMapping(property = "updateTime", type = java.util.Date.class, table = "t_merchant_info", tableAlias = "A", column = "update_time"),
	@SelectColumnMapping(property = "operator", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "operator"),
	@SelectColumnMapping(property = "remark", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "remark"),
	@SelectColumnMapping(property = "temp1", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "temp_1"),
	@SelectColumnMapping(property = "temp2", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "temp_2"),
	@SelectColumnMapping(property = "temp3", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "temp_3"),
	@SelectColumnMapping(property = "temp4", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "temp_4"),
	@SelectColumnMapping(property = "recordStatus", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "RECORD_STATUS"),
	@SelectColumnMapping(property = "jsapiPath", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "jsapi_path"),
	@SelectColumnMapping(property = "subAppid", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "sub_appid"),
	@SelectColumnMapping(property = "subscribeAppid", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "subscribe_appid"),
	@SelectColumnMapping(property = "identification", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "A", column = "identification"),
})

@Generated("2017-03-28 10:38:47")
public class MerchantInfo implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//主键id
	private String channelNo;//渠道编号
	private String agentNo;//代理商编号
	private String merchantNo;//商户编号
	private String merchantName;//商户名称
	private String shortName;//商户简称
	private String qrCode;//二维码编号
	private Integer creditPayStatus;//是否支持禁用信息卡支付：1正常 2禁用
	private Integer authenStatus;//实名认证情况：0 未认证 1已认证 2认证失败
	private String isT0;//是否支持T0：Y 支持 N不支持
	private String registerType;//商户模式：01 大商户模式 02 一户一码模式
	private String status;//是否有效：0 申请中 1 上级审核通过 2 上级审核拒绝 3平台审核通过 4 平台审核拒绝 5 停用
	private Date createTime;//入网时间
	private Date updateTime;//修改时间
	private String operator;//操作人账号
	private String remark;//备注
	private String temp1;//temp1
	private String temp2;//temp2
	private String temp3;//temp3
	private String temp4;//temp4
	
	private String channelName;//渠道名称
	private String agentName;//代理商名称
	private String recordStatus;//记录状态，Y:正常，N:删除
	
	private String jsapiPath;//子商户公众账号JSAPI支付授权目录
	private String subAppid;//子商户SubAPPID
	private String subscribeAppid;//子商户推荐关注公众账号APPID

	private String identification;
	
	
	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
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
	public void setShortName(String value) {
		this.shortName = value;
	}
	
	public String getShortName() {
		return this.shortName;
	}
	public void setQrCode(String value) {
		this.qrCode = value;
	}
	
	public String getQrCode() {
		return this.qrCode;
	}
	public void setCreditPayStatus(Integer value) {
		this.creditPayStatus = value;
	}
	
	public Integer getCreditPayStatus() {
		return this.creditPayStatus;
	}
	public void setAuthenStatus(Integer value) {
		this.authenStatus = value;
	}
	
	
	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public Integer getAuthenStatus() {
		return this.authenStatus;
	}
	public void setIsT0(String value) {
		this.isT0 = value;
	}
	
	public String getIsT0() {
		return this.isT0;
	}
	public void setRegisterType(String value) {
		this.registerType = value;
	}
	
	public String getRegisterType() {
		return this.registerType;
	}
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return this.status;
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

	public String getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getJsapiPath() {
		return jsapiPath;
	}

	public void setJsapiPath(String jsapiPath) {
		this.jsapiPath = jsapiPath;
	}

	public String getSubAppid() {
		return subAppid;
	}

	public void setSubAppid(String subAppid) {
		this.subAppid = subAppid;
	}

	public String getSubscribeAppid() {
		return subscribeAppid;
	}

	public void setSubscribeAppid(String subscribeAppid) {
		this.subscribeAppid = subscribeAppid;
	}

	
}

