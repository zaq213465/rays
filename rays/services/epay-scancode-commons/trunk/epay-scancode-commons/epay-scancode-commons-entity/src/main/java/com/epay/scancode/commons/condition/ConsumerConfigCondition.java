package com.epay.scancode.commons.condition;


import com.epay.commons.base.annotation.Generated;
import com.epay.commons.utils.PagingCondition;

@Generated("2018-03-29 11:02:05")
public class ConsumerConfigCondition extends PagingCondition {
	
	private static final long serialVersionUID = 1L;
	
	private String id;//id
	private String conSwitch;//conSwitch
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConSwitch() {
		return conSwitch;
	}
	public void setConSwitch(String conSwitch) {
		this.conSwitch = conSwitch;
	}

	
}

