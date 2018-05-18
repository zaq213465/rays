package com.epay.scancode.commons.entity;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.Integer.class, table = "t_config_country", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "cname", type = java.lang.String.class, table = "t_config_country", tableAlias = "A", column = "cname"),
	@SelectColumnMapping(property = "ccode", type = java.lang.String.class, table = "t_config_country", tableAlias = "A", column = "ccode"),
	@SelectColumnMapping(property = "cid", type = java.lang.Integer.class, table = "t_config_country", tableAlias = "A", column = "cid")
})

@Generated("2017-11-27 19:25:15")
public class ConfigCountry implements IdEntity<Integer> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private Integer id;//id
	private String cname;//cname
	private String ccode;//ccode
	private String cid;//cid

	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	public void setCname(String value) {
		this.cname = value;
	}
	
	public String getCname() {
		return this.cname;
	}
	public void setCcode(String value) {
		this.ccode = value;
	}
	
	public String getCcode() {
		return this.ccode;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	
}

