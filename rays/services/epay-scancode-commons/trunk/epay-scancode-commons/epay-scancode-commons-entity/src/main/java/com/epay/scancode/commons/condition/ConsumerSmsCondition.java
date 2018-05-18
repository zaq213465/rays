package com.epay.scancode.commons.condition;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.utils.PagingCondition;
import com.fasterxml.jackson.annotation.JsonFormat;

@Generated("2018-03-19 17:32:57")
public class ConsumerSmsCondition extends PagingCondition {
	
	private static final long serialVersionUID = 1L;
	
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
}

