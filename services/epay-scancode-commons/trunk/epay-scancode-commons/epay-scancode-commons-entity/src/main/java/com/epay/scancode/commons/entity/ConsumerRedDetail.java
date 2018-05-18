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
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "b_consumer_red_detail", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "redNo", type = java.lang.String.class, table = "b_consumer_red_detail", tableAlias = "A", column = "red_no"),
	@SelectColumnMapping(property = "senderMerchantNo", type = java.lang.String.class, table = "b_consumer_red_detail", tableAlias = "A", column = "sender_merchant_no"),
	@SelectColumnMapping(property = "receiverMerchantNo", type = java.lang.String.class, table = "b_consumer_red_detail", tableAlias = "A", column = "receiver_merchant_no"),
	@SelectColumnMapping(property = "amount", type = BigDecimal.class, table = "b_consumer_red_detail", tableAlias = "A", column = "amount"),
	@SelectColumnMapping(property = "remake", type = java.lang.String.class, table = "b_consumer_red_detail", tableAlias = "A", column = "remake"),
	@SelectColumnMapping(property = "time", type = java.util.Date.class, table = "b_consumer_red_detail", tableAlias = "A", column = "time"),
	@SelectColumnMapping(property = "createTime", type = java.util.Date.class, table = "b_consumer_red_detail", tableAlias = "A", column = "create_time"),
	@SelectColumnMapping(property = "updateTime", type = java.util.Date.class, table = "b_consumer_red_detail", tableAlias = "A", column = "update_time")
})

@Generated("2018-03-19 17:32:56")
public class ConsumerRedDetail implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//主键id
	private String redNo;//红包编号
	private String senderMerchantNo;//发送者
	private String receiverMerchantNo;//接收者
	private BigDecimal amount;//金额
	private String remake;//备注
	private Date time;//领取时间
	private Date createTime;//创建时间
	private Date updateTime;//修改时间

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setRedNo(String value) {
		this.redNo = value;
	}
	
	public String getRedNo() {
		return this.redNo;
	}
	public void setSenderMerchantNo(String value) {
		this.senderMerchantNo = value;
	}
	
	public String getSenderMerchantNo() {
		return this.senderMerchantNo;
	}
	public void setReceiverMerchantNo(String value) {
		this.receiverMerchantNo = value;
	}
	
	public String getReceiverMerchantNo() {
		return this.receiverMerchantNo;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setRemake(String value) {
		this.remake = value;
	}
	
	public String getRemake() {
		return this.remake;
	}
	public void setTime(Date value) {
		this.time = value;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
	public Date getTime() {
		return this.time;
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

