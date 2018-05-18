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
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "b_consumer_red", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "merchantNo", type = java.lang.String.class, table = "b_consumer_red", tableAlias = "A", column = "merchant_no"),
	@SelectColumnMapping(property = "redNo", type = java.lang.String.class, table = "b_consumer_red", tableAlias = "A", column = "red_no"),
	@SelectColumnMapping(property = "redCombination", type = java.lang.String.class, table = "b_consumer_red", tableAlias = "A", column = "red_combination"),
	@SelectColumnMapping(property = "redAmount", type = BigDecimal.class, table = "b_consumer_red", tableAlias = "A", column = "red_amount"),
	@SelectColumnMapping(property = "time", type = java.util.Date.class, table = "b_consumer_red", tableAlias = "A", column = "time"),
	@SelectColumnMapping(property = "redRemake", type = java.lang.String.class, table = "b_consumer_red", tableAlias = "A", column = "red_remake"),
	@SelectColumnMapping(property = "state", type = java.lang.String.class, table = "b_consumer_red", tableAlias = "A", column = "state"),
	@SelectColumnMapping(property = "num", type = java.lang.Integer.class, table = "b_consumer_red", tableAlias = "A", column = "num"),
	@SelectColumnMapping(property = "createTime", type = java.util.Date.class, table = "b_consumer_red", tableAlias = "A", column = "create_time"),
	@SelectColumnMapping(property = "updateTime", type = java.util.Date.class, table = "b_consumer_red", tableAlias = "A", column = "update_time")
})

@Generated("2018-03-19 17:32:56")
public class ConsumerRed implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//主键id
	private String merchantNo;//商户编号
	private String redNo;//红包编号
	private String redCombination;//红包金额组合
	private BigDecimal redAmount;//红包总金额
	private Date time;//时间
	private String redRemake;//红包祝福语
	private String state;//领取状态 0：领取中 1：已领完 2：已过期
	private Integer num;//数量
	private Date createTime;//创建时间
	private Date updateTime;//修改时间

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
	public void setRedNo(String value) {
		this.redNo = value;
	}
	
	public String getRedNo() {
		return this.redNo;
	}
	public void setRedCombination(String value) {
		this.redCombination = value;
	}
	
	public String getRedCombination() {
		return this.redCombination;
	}
	
	public BigDecimal getRedAmount() {
		return redAmount;
	}

	public void setRedAmount(BigDecimal redAmount) {
		this.redAmount = redAmount;
	}

	public void setTime(Date value) {
		this.time = value;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
	public Date getTime() {
		return this.time;
	}
	public void setRedRemake(String value) {
		this.redRemake = value;
	}
	
	public String getRedRemake() {
		return this.redRemake;
	}
	public void setState(String value) {
		this.state = value;
	}
	
	public String getState() {
		return this.state;
	}
	public void setNum(Integer value) {
		this.num = value;
	}
	
	public Integer getNum() {
		return this.num;
	}
	public void setCreateTime(Date value) {
		this.createTime = value;
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

	
}

