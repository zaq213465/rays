package com.epay.scancode.commons.dao;

import java.util.List;
import java.util.Map;

import com.epay.commons.dao.EntityDAO;
import com.epay.scancode.commons.entity.SysResource;


@com.epay.commons.base.annotation.Generated("2016-04-14 09:42")
public interface SysResourceDAO extends EntityDAO<SysResource, String> {
	/**
	 * 菜单
	 * @return
	 */
	List<SysResource> selectActiveMenu(String userId);
	/**
	 * 角色资源
	 */
	List<SysResource> selectActiveResource(Map<String, Object> params);

}