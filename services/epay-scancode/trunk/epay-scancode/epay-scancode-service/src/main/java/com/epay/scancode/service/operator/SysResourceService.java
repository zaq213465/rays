package com.epay.scancode.service.operator;

import java.util.List;
import java.util.Map;

import com.epay.scancode.commons.entity.SysResource;

public interface SysResourceService {
	/**
	 * 菜单
	 * @return
	 */
	public List<SysResource> selectActiveMenu(String userId);
	
	/**
	 * 角色资源
	 */
	public List<SysResource> selectActiveResource(Map<String, Object> params);
}
