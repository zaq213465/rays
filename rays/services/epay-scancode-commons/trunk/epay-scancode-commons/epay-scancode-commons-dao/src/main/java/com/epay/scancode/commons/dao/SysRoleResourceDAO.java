package com.epay.scancode.commons.dao;

import java.util.List;

import com.epay.commons.dao.EntityDAO;
import com.epay.scancode.commons.entity.SysRoleResource;


@com.epay.commons.base.annotation.Generated("2016-04-14 09:43")
public interface SysRoleResourceDAO extends EntityDAO<SysRoleResource, String> {

	long deleteSysRoleResourceByRoleId(String roleId);

	void insertBatch(List<SysRoleResource> list);

}