package com.epay.scancode.service.operator;

import java.util.List;
import java.util.Set;

import com.epay.scancode.commons.entity.UrlFilter;

public interface UrlFilterService {
	/**
	 * 用户的所有角色
	 * @param name
	 * @return
	 */
	public Set<String> findRoles(String name);
	/**
	 * 角色对应的所有url
	 * @return
	 */
	public List<UrlFilter> findAll();
}
