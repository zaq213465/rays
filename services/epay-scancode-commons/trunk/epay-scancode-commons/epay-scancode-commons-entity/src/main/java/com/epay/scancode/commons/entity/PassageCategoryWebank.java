/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2017
 */package com.epay.scancode.commons.entity;


import java.util.Date;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_passage_category_webank", tableAlias = "A", column = "ID"),
	@SelectColumnMapping(property = "categoryNo", type = java.lang.String.class, table = "t_passage_category_webank", tableAlias = "A", column = "CATEGORY_NO"),
	@SelectColumnMapping(property = "payType", type = java.lang.String.class, table = "t_passage_category_webank", tableAlias = "A", column = "PAY_TYPE"),
	@SelectColumnMapping(property = "name", type = java.lang.String.class, table = "t_passage_category_webank", tableAlias = "A", column = "NAME"),
	@SelectColumnMapping(property = "certType", type = java.lang.String.class, table = "t_passage_category_webank", tableAlias = "A", column = "CERT_TYPE"),
	@SelectColumnMapping(property = "code", type = java.lang.String.class, table = "t_passage_category_webank", tableAlias = "A", column = "CODE"),
	@SelectColumnMapping(property = "status", type = java.lang.String.class, table = "t_passage_category_webank", tableAlias = "A", column = "STATUS"),
	@SelectColumnMapping(property = "recordStatus", type = java.lang.String.class, table = "t_passage_category_webank", tableAlias = "A", column = "RECORD_STATUS"),
	@SelectColumnMapping(property = "createTime", type = Date.class, table = "t_passage_category_webank", tableAlias = "A", column = "CREATE_TIME"),
	@SelectColumnMapping(property = "updateTime", type = Date.class, table = "t_passage_category_webank", tableAlias = "A", column = "UPDATE_TIME"),
	@SelectColumnMapping(property = "operater", type = java.lang.String.class, table = "t_passage_category_webank", tableAlias = "A", column = "OPERATER"),
	@SelectColumnMapping(property = "remark", type = java.lang.String.class, table = "t_passage_category_webank", tableAlias = "A", column = "REMARK")
})

@Generated("2017-03-31 10:37:03")
public class PassageCategoryWebank implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//id
	private String categoryNo;//平台类目编号
	private String payType;//支付类型
	private String name;//类目名称
	private String certType;//证照类型
	private String code;//类目编号
	private String status;//状态(0禁用,1可用)
	private String recordStatus;//记录状态，Y:正常，N:删除
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	private String operater;//操作人账号
	private String remark;//备注

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setCategoryNo(String value) {
		this.categoryNo = value;
	}
	
	public String getCategoryNo() {
		return this.categoryNo;
	}
	public void setPayType(String value) {
		this.payType = value;
	}
	
	public String getPayType() {
		return this.payType;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setCertType(String value) {
		this.certType = value;
	}
	
	public String getCertType() {
		return this.certType;
	}
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return this.code;
	}
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return this.status;
	}
	public void setRecordStatus(String value) {
		this.recordStatus = value;
	}
	
	public String getRecordStatus() {
		return this.recordStatus;
	}
	public void setCreateTime(Date value) {
		this.createTime = value;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setUpdateTime(Date value) {
		this.updateTime = value;
	}
	
	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setOperater(String value) {
		this.operater = value;
	}
	
	public String getOperater() {
		return this.operater;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}

}

