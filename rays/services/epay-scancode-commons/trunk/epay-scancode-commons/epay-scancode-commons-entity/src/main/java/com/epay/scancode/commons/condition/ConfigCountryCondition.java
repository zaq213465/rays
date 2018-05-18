package com.epay.scancode.commons.condition;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.utils.PagingCondition;

@Generated("2017-11-27 19:25:15")
public class ConfigCountryCondition extends PagingCondition {
	
	private static final long serialVersionUID = 1L;
	
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

