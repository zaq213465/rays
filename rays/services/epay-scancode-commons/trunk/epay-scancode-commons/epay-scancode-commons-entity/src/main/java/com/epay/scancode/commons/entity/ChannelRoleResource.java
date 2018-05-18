/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2016
 */package com.epay.scancode.commons.entity;

import java.util.Date;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_channel_role_resource", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "roleId", type = java.lang.String.class, table = "t_channel_role_resource", tableAlias = "A", column = "role_id"),
	@SelectColumnMapping(property = "resourceId", type = java.lang.String.class, table = "t_channel_role_resource", tableAlias = "A", column = "resource_id"),
	@SelectColumnMapping(property = "createTime", type = java.util.Date.class, table = "t_channel_role_resource", tableAlias = "A", column = "create_time")
})

@Generated("2016-10-15 14:50:14")
public class ChannelRoleResource implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//主键id
	private String roleId;//角色ID
	private String resourceId;//菜单资源ID
	private Date createTime;//创建时间

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setRoleId(String value) {
		this.roleId = value;
	}
	
	public String getRoleId() {
		return this.roleId;
	}
	public void setResourceId(String value) {
		this.resourceId = value;
	}
	
	public String getResourceId() {
		return this.resourceId;
	}
	public void setCreateTime(Date value) {
		this.createTime = value;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}

	
}

