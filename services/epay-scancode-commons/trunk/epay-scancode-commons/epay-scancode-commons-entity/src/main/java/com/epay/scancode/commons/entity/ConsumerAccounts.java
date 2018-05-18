package com.epay.scancode.commons.entity;



import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;
import com.fasterxml.jackson.annotation.JsonFormat;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "b_consumer_accounts", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "merchantNo", type = java.lang.String.class, table = "b_consumer_accounts", tableAlias = "A", column = "merchant_no"),
	@SelectColumnMapping(property = "userName", type = java.lang.String.class, table = "b_consumer_accounts", tableAlias = "A", column = "user_name"),
	@SelectColumnMapping(property = "shortName", type = java.lang.String.class, table = "b_consumer_accounts", tableAlias = "A", column = "short_name"),
	@SelectColumnMapping(property = "phone", type = java.lang.String.class, table = "b_consumer_accounts", tableAlias = "A", column = "phone"),
	@SelectColumnMapping(property = "password", type = java.lang.String.class, table = "b_consumer_accounts", tableAlias = "A", column = "password"),
	@SelectColumnMapping(property = "salt", type = java.lang.String.class, table = "b_consumer_accounts", tableAlias = "A", column = "salt"),
	@SelectColumnMapping(property = "balance", type = BigDecimal.class, table = "b_consumer_accounts", tableAlias = "A", column = "balance"),
	@SelectColumnMapping(property = "openId", type = java.lang.String.class, table = "b_consumer_accounts", tableAlias = "A", column = "open_id"),
	@SelectColumnMapping(property = "status", type = java.lang.Boolean.class, table = "b_consumer_accounts", tableAlias = "A", column = "status"),
	@SelectColumnMapping(property = "createTime", type = java.util.Date.class, table = "b_consumer_accounts", tableAlias = "A", column = "create_time"),
	@SelectColumnMapping(property = "updateTime", type = java.util.Date.class, table = "b_consumer_accounts", tableAlias = "A", column = "update_time"),
	@SelectColumnMapping(property = "remark", type = java.lang.String.class, table = "b_consumer_accounts", tableAlias = "A", column = "remark")
})

@Generated("2018-03-19 17:32:55")
public class ConsumerAccounts implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//主键id
	private String merchantNo;//商户编号
	private String userName;//用户名
	private String shortName;//昵称
	private String phone;//手机号
	private String password;//密码
	private String salt;//加密盐
	private BigDecimal balance;//余额
	private String openId;//小程序openId
	private String status;//状态，0禁用,1可用
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	private String remark;//备注

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
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public void setShortName(String value) {
		this.shortName = value;
	}
	
	public String getShortName() {
		return this.shortName;
	}
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return this.phone;
	}
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setSalt(String value) {
		this.salt = value;
	}
	
	public String getSalt() {
		return this.salt;
	}

	public void setOpenId(String value) {
		this.openId = value;
	}
	
	public String getOpenId() {
		return this.openId;
	}

	
	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setUpdateTime(Date value) {
		this.updateTime = value;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}

	
}

