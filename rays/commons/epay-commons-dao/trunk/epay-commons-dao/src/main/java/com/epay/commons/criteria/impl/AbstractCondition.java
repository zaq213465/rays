package com.epay.commons.criteria.impl;

import java.util.Map;

import com.epay.commons.base.collection.Maps;
import com.epay.commons.criteria.Condition;
import com.epay.commons.criteria.Logic;


public abstract class AbstractCondition implements Condition{
	protected Logic logic;
	
	protected Map<String, Object> attributes = Maps.newMap();

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}
	
	public void addAttribute(String attrName,Object attrValue) {
		attributes.put(attrName, attrValue);
	}
	
	public Object getAttribute(String attrName) {
		return attributes.get(attrName);
	}

	public Logic getLogic() {
		return logic;
	}

	public void setLogic(Logic logic) {
		this.logic = logic;
	}
}
