package com.epay.scancode.commons.dao.impl;

import java.util.List;

import com.epay.commons.dao.impl.MybatisEntityDAO;
import com.epay.scancode.commons.dao.SysRoleResourceDAO;
import com.epay.scancode.commons.entity.SysRoleResource;

@org.springframework.stereotype.Repository
@com.epay.commons.base.annotation.Generated("2016-04-14 09:43")
public class SysRoleResourceDAOImpl extends MybatisEntityDAO<SysRoleResource, String> implements SysRoleResourceDAO {

	@Override
	public long deleteSysRoleResourceByRoleId(String roleId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().delete("SysRoleResource.deleteSysRoleResourceByRoleId", roleId);
	}

	@Override
	public void insertBatch(List<SysRoleResource> list) {
		// TODO Auto-generated method stub
		this.getSqlSession().delete("SysRoleResource.insertBatch", list);
	}


}