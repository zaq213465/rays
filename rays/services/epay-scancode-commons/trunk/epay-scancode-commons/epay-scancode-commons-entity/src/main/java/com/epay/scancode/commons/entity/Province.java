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
	@SelectColumnMapping(property = "pid", type = java.lang.Integer.class, table = "t_province", tableAlias = "A", column = "pid"),
	@SelectColumnMapping(property = "pname", type = java.lang.String.class, table = "t_province", tableAlias = "A", column = "pname"),
	@SelectColumnMapping(property = "pcode", type = java.lang.String.class, table = "t_province", tableAlias = "A", column = "pcode")
})

@Generated("2017-01-22 14:03:17")
public class Province implements IdEntity<Integer> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private Integer pid;//pid
	private String pname;//pname
	//private String pcode;

	public void setPid(Integer value) {
		this.pid = value;
	}
	
	public Integer getPid() {
		return this.pid;
	}
	public void setPname(String value) {
		this.pname = value;
	}
	
	public String getPname() {
		return this.pname;
	}

	
	/*public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}*/

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

