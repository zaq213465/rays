package com.epay.scancode.commons.condition;



import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.utils.PagingCondition;
import com.fasterxml.jackson.annotation.JsonFormat;

@Generated("2018-03-19 17:32:56")
public class ConsumerRedDetailCondition extends PagingCondition {
	
	private static final long serialVersionUID = 1L;
	
	private String id;//主键id
	private String redNo;//红包编号
	private String senderMerchantNo;//发送者
	private String receiverMerchantNo;//接收者
	private BigDecimal amount;//金额
	private String remake;//备注
	private Date time;//领取时间
	private Date createTime;//创建时间

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
}

