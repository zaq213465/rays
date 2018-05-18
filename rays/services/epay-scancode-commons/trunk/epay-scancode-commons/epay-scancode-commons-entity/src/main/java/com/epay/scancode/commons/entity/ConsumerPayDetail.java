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
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "b_consumer_pay_detail", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "merchantNo", type = java.lang.String.class, table = "b_consumer_pay_detail", tableAlias = "A", column = "merchant_no"),
	@SelectColumnMapping(property = "businessType", type = java.lang.String.class, table = "b_consumer_pay_detail", tableAlias = "A", column = "business_type"),
	@SelectColumnMapping(property = "orderAmt", type = BigDecimal.class, table = "b_consumer_pay_detail", tableAlias = "A", column = "order_amt"),
	@SelectColumnMapping(property = "remarks", type = java.lang.String.class, table = "b_consumer_pay_detail", tableAlias = "A", column = "remarks"),
	@SelectColumnMapping(property = "operator", type = java.lang.String.class, table = "b_consumer_pay_detail", tableAlias = "A", column = "operator"),
	@SelectColumnMapping(property = "time", type = java.util.Date.class, table = "b_consumer_pay_detail", tableAlias = "A", column = "time")
})

@Generated("2018-03-19 17:32:57")
public class ConsumerPayDetail implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
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

