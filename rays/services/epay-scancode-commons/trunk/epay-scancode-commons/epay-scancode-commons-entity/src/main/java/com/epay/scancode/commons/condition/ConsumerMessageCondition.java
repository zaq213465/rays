package com.epay.scancode.commons.condition;



import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.utils.PagingCondition;
import com.fasterxml.jackson.annotation.JsonFormat;

@Generated("2018-03-19 17:32:57")
public class ConsumerMessageCondition extends PagingCondition {
	
	private static final long serialVersionUID = 1L;
	
	private String id;//主键id
	private String merchantNo;//商户编号
	private String sender;//发送者
	private String content;//内容
	private Date receiveTime;//接收时间
	private Date redTime;//发红包时间
	private String note;//备注
	private BigDecimal amount;//金额
	private String title;//标题

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
	public void setSender(String value) {
		this.sender = value;
	}
	
	public String getSender() {
		return this.sender;
	}
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	public void setReceiveTime(Date value) {
		this.receiveTime = value;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
	public Date getReceiveTime() {
		return this.receiveTime;
	}
	public void setRedTime(Date value) {
		this.redTime = value;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
	public Date getRedTime() {
		return this.redTime;
	}
	public void setNote(String value) {
		this.note = value;
	}
	
	public String getNote() {
		return this.note;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return this.title;
	}
}

