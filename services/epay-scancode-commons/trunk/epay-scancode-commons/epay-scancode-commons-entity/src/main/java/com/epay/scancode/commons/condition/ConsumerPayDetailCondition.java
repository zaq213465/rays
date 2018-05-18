package com.epay.scancode.commons.condition;



import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.utils.PagingCondition;
import com.fasterxml.jackson.annotation.JsonFormat;

@Generated("2018-03-19 17:32:57")
public class ConsumerPayDetailCondition extends PagingCondition {
	
	private static final long serialVersionUID = 1L;
	
	private String id;//主键id
	private String merchantNo;//商户编号
	private String businessType;//业务类型:XF,CZ
	private BigDecimal orderAmt;//金额
	private String remarks;//描述
	private String operator;//操作人
	private Date time;//时间

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
	public void setBusinessType(String value) {
		this.businessType = value;
	}
	
	public String getBusinessType() {
		return this.businessType;
	}

	public BigDecimal getOrderAmt() {
		return orderAmt;
	}

	public void setOrderAmt(BigDecimal orderAmt) {
		this.orderAmt = orderAmt;
	}

	public void setRemarks(String value) {
		this.remarks = value;
	}
	
	public String getRemarks() {
		return this.remarks;
	}
	public void setOperator(String value) {
		this.operator = value;
	}
	
	public String getOperator() {
		return this.operator;
	}
	public void setTime(Date value) {
		this.time = value;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
	public Date getTime() {
		return this.time;
	}
}

