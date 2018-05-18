/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2016
 */package com.epay.scancode.commons.entity;

import java.util.Date;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "ID"),
	@SelectColumnMapping(property = "channelNo", type = java.lang.String.class, table = "t_order_pay", tableAlias = "A", column = "channel_no"),
	@SelectColumnMapping(property = "agentNo", type = java.lang.String.class, table = "t_order_pay", tableAlias = "A", column = "agent_no"),
	@SelectColumnMapping(property = "merchantNo", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "MERCHANT_NO"),
	@SelectColumnMapping(property = "merchantName", type = java.lang.String.class, table = "t_merchant_info", tableAlias = "C", column = "MERCHANT_NAME"),
	@SelectColumnMapping(property = "idCard", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "ID_CARD"),
	@SelectColumnMapping(property = "name", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "NAME"),
	@SelectColumnMapping(property = "bankCode", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "BANK_CODE"),
	@SelectColumnMapping(property = "bankName", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "BANK_NAME"),
	@SelectColumnMapping(property = "bankCard", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "BANK_CARD"),
	@SelectColumnMapping(property = "mobile", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "MOBILE"),
	@SelectColumnMapping(property = "isRealAccount", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "IS_REAL_ACCOUNT"),
	@SelectColumnMapping(property = "accountType", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "account_type"),
	@SelectColumnMapping(property = "status", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "STATUS"),
	@SelectColumnMapping(property = "recordStatus", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "RECORD_STATUS"),
	@SelectColumnMapping(property = "createTime", type = java.util.Date.class, table = "t_merchant_bankcard", tableAlias = "A", column = "CREATE_TIME"),
	@SelectColumnMapping(property = "updateTime", type = java.util.Date.class, table = "t_merchant_bankcard", tableAlias = "A", column = "UPDATE_TIME"),
	@SelectColumnMapping(property = "operator", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "OPERATOR"),
	@SelectColumnMapping(property = "remark", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "REMARK"),
	@SelectColumnMapping(property = "temp1", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "TEMP_1"),
	@SelectColumnMapping(property = "temp2", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "TEMP_2"),
	@SelectColumnMapping(property = "province", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "PROVINCE"),
	@SelectColumnMapping(property = "city", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "CITY"),
	@SelectColumnMapping(property = "bankId", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "BANK_ID"),
	@SelectColumnMapping(property = "bankSubName", type = java.lang.String.class, table = "t_merchant_bankcard", tableAlias = "A", column = "BANK_SUB_NAME")
})

@Generated("2016-10-17 13:50:11")
public class MerchantBankcard implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//id
	private String channelNo;//渠道编号
	private String agentNo;//代理商编号
	private String merchantNo;//商户编号
	private String idCard;//身份证号码
	private String name;//姓名
	private String bankCode;//银行开户行代码
	private String bankName;//银行名称
	private String bankCard;//银行卡号
	private String mobile;//手机号码
	private String isRealAccount;//是否实时到账，Y：是，N：否
	private String accountType;//是否对公对私，1：对公，0：对私
	private String status;//是否有效：1：有效，2：无效
	private String recordStatus;//记录状态，Y:正常，N:删除
	private Date createTime;//入网时间
	private Date updateTime;//修改时间
	private String operator;//操作人账号
	private String remark;//备注
	private String temp1;//temp1
	private String temp2;//temp2
	private String province;//开户支行所在省
	private String city;//开户支行所在市
    private String bankId;//开户银行id
    private String bankSubName;//开户支行名称
    
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
	public void setIdCard(String value) {
		this.idCard = value;
	}
	
	public String getIdCard() {
		return this.idCard;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setBankCode(String value) {
		this.bankCode = value;
	}
	
	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankName(String value) {
		this.bankName = value;
	}
	
	public String getBankName() {
		return this.bankName;
	}
	public void setBankCard(String value) {
		this.bankCard = value;
	}
	
	public String getBankCard() {
		return this.bankCard;
	}
	public void setMobile(String value) {
		this.mobile = value;
	}
	
	public String getMobile() {
		return this.mobile;
	}
	public void setIsRealAccount(String value) {
		this.isRealAccount = value;
	}
	
	public String getIsRealAccount() {
		return this.isRealAccount;
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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankSubName() {
		return bankSubName;
	}

	public void setBankSubName(String bankSubName) {
		this.bankSubName = bankSubName;
	}

	

}

