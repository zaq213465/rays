package com.epay.scancode.commons.entity;


import java.util.Date;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "b_consumer_sms", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "merchantNo", type = java.lang.String.class, table = "b_consumer_sms", tableAlias = "A", column = "merchant_no"),
	@SelectColumnMapping(property = "phone", type = java.lang.String.class, table = "b_consumer_sms", tableAlias = "A", column = "phone"),
	@SelectColumnMapping(property = "content", type = java.lang.String.class, table = "b_consumer_sms", tableAlias = "A", column = "content"),
	@SelectColumnMapping(property = "sendResult", type = java.lang.String.class, table = "b_consumer_sms", tableAlias = "A", column = "send_result"),
	@SelectColumnMapping(property = "createTime", type = java.util.Date.class, table = "b_consumer_sms", tableAlias = "A", column = "create_time"),
	@SelectColumnMapping(property = "remark", type = java.lang.String.class, table = "b_consumer_sms", tableAlias = "A", column = "remark")
})

@Generated("2018-03-19 17:32:57")
public class ConsumerSms implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//主键id
	private String merchantNo;//商户编号
	private String phone;//手机号
	private String content;//短信内容
	private String sendResult;//发送结果
	private Date createTime;//发送时间
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
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return this.phone;
	}
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	public void setSendResult(String value) {
		this.sendResult = value;
	}
	
	public String getSendResult() {
		return this.sendResult;
	}
	public void setCreateTime(Date value) {
		this.createTime = value;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}

	
}

