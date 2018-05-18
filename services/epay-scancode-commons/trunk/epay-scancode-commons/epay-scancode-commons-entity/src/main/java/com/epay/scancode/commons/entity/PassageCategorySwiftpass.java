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
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_passage_category_swiftpass", tableAlias = "A", column = "ID"),
	@SelectColumnMapping(property = "categoryCode", type = java.lang.String.class, table = "t_passage_category_swiftpass", tableAlias = "A", column = "CATEGORY_CODE"),
	@SelectColumnMapping(property = "categoryName", type = java.lang.String.class, table = "t_passage_category_swiftpass", tableAlias = "A", column = "CATEGORY_NAME"),
	@SelectColumnMapping(property = "categoruBusiness", type = java.lang.String.class, table = "t_passage_category_swiftpass", tableAlias = "A", column = "CATEGORU_BUSINESS"),
	@SelectColumnMapping(property = "temp1", type = java.lang.String.class, table = "t_passage_category_swiftpass", tableAlias = "A", column = "TEMP_1"),
	@SelectColumnMapping(property = "temp2", type = java.lang.String.class, table = "t_passage_category_swiftpass", tableAlias = "A", column = "TEMP_2"),
	@SelectColumnMapping(property = "temp3", type = java.lang.String.class, table = "t_passage_category_swiftpass", tableAlias = "A", column = "TEMP_3"),
	@SelectColumnMapping(property = "temp4", type = java.lang.String.class, table = "t_passage_category_swiftpass", tableAlias = "A", column = "TEMP_4"),
	@SelectColumnMapping(property = "createTime", type = java.util.Date.class, table = "t_passage_category_swiftpass", tableAlias = "A", column = "CREATE_TIME"),
	@SelectColumnMapping(property = "updateTime", type = java.util.Date.class, table = "t_passage_category_swiftpass", tableAlias = "A", column = "UPDATE_TIME"),
	@SelectColumnMapping(property = "operator", type = java.lang.String.class, table = "t_passage_category_swiftpass", tableAlias = "A", column = "OPERATOR"),
	@SelectColumnMapping(property = "remarks", type = java.lang.String.class, table = "t_passage_category_swiftpass", tableAlias = "A", column = "REMARKS")
})

@Generated("2017-11-24 16:36:51")
public class PassageCategorySwiftpass implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//id
	private String categoryCode;//类目编码
	private String categoryName;//类目名称
	private String categoruBusiness;//商户经营类型
	private String temp1;//temp1
	private String temp2;//temp2
	private String temp3;//temp3
	private String temp4;//temp4
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	private String operator;//操作人
	private String remarks;//备注

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setCategoryCode(String value) {
		this.categoryCode = value;
	}
	
	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryName(String value) {
		this.categoryName = value;
	}
	
	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoruBusiness(String value) {
		this.categoruBusiness = value;
	}
	
	public String getCategoruBusiness() {
		return this.categoruBusiness;
	}
	public void setTemp1(String value) {
		this.temp1 = value;
	}
	
	public String getTemp1() {
		return this.temp1;
	}
	public void setTemp2(String value) {
		this.temp2 = value;
	}
	
	public String getTemp2() {
		return this.temp2;
	}
	public void setTemp3(String value) {
		this.temp3 = value;
	}
	
	public String getTemp3() {
		return this.temp3;
	}
	public void setTemp4(String value) {
		this.temp4 = value;
	}
	
	public String getTemp4() {
		return this.temp4;
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
	public void setOperator(String value) {
		this.operator = value;
	}
	
	public String getOperator() {
		return this.operator;
	}
	public void setRemarks(String value) {
		this.remarks = value;
	}
	
	public String getRemarks() {
		return this.remarks;
	}

	
}

