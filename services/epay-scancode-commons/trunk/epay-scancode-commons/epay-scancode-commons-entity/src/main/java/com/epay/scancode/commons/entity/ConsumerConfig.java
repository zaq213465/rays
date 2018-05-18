package com.epay.scancode.commons.entity;



import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "b_consumer_config", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "conSwitch", type = java.lang.String.class, table = "b_consumer_config", tableAlias = "A", column = "con_switch")
})

@Generated("2018-03-29 11:02:05")
public class ConsumerConfig implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}

