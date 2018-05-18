package com.epay.scancode.commons.condition;



import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.utils.PagingCondition;
import com.fasterxml.jackson.annotation.JsonFormat;

@Generated("2018-03-19 17:32:55")
public class ConsumerAccountsCondition extends PagingCondition {
	
	private static final long serialVersionUID = 1L;
	
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
	
	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setOpenId(String value) {
		this.openId = value;
	}
	
	public String getOpenId() {
		return this.openId;
	}

	public String getStatus() {
		return status;
	}

	public void setCreateTime(Date value) {
		this.createTime = value;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}

