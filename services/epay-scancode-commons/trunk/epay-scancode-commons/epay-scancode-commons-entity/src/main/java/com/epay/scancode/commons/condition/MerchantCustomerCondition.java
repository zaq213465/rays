/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2017
 */package com.epay.scancode.commons.condition;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.utils.PagingCondition;

@Generated("2017-08-28 16:44:12")
public class MerchantCustomerCondition extends PagingCondition {
	
	private static final long serialVersionUID = 1L;
	
	private String id;//id
	private String merchantNo;//商户编号
	private String name;//姓名
	private String carNo;//车牌号
	private String company;//出租车公司名称
	private String photo;//照片
	private String enable;//是否启用，1是 0否

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
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setCarNo(String value) {
		this.carNo = value;
	}
	
	public String getCarNo() {
		return this.carNo;
	}
	public void setCompany(String value) {
		this.company = value;
	}
	
	public String getCompany() {
		return this.company;
	}
	public void setPhoto(String value) {
		this.photo = value;
	}
	
	public String getPhoto() {
		return this.photo;
	}
	public void setEnable(String value) {
		this.enable = value;
	}
	
	public String getEnable() {
		return this.enable;
	}
}

