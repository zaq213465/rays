package com.epay.scancode.commons.dao;

import java.util.List;

import com.epay.scancode.commons.entity.UrlFilter;

public interface UrlFilterDAO {
	List<UrlFilter> findRoles(String name);

	List<UrlFilter> findAllUrl();
}
