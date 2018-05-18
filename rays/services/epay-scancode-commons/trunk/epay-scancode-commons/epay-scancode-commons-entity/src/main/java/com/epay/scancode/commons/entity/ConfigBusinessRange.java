/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2017
 */package com.epay.scancode.commons.entity;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_config_business_range", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "businessRange", type = java.lang.String.class, table = "t_config_business_range", tableAlias = "A", column = "business_range"),
	@SelectColumnMapping(property = "businessRangeCode", type = java.lang.String.class, table = "t_config_business_range", tableAlias = "A", column = "business_range_code"),
	@SelectColumnMapping(property = "mccCode", type = java.lang.String.class, table = "t_config_business_range", tableAlias = "A", column = "mcc_code")
})

@Generated("2017-04-08 16:35:16")
public class ConfigBusinessRange implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//主键id
	private String businessRange;//经营范围
	private String businessRangeCode;//经营范围编码
	private String mccCode;//MCC码

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setBusinessRange(String value) {
		this.businessRange = value;
	}
	
	public String getBusinessRange() {
		return this.businessRange;
	}
	public void setBusinessRangeCode(String value) {
		this.businessRangeCode = value;
	}
	
	public String getBusinessRangeCode() {
		return this.businessRangeCode;
	}
	public void setMccCode(String value) {
		this.mccCode = value;
	}
	
	public String getMccCode() {
		return this.mccCode;
	}

	
}

