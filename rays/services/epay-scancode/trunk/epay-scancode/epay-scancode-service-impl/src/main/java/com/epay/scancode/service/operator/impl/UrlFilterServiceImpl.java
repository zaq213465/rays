package com.epay.scancode.service.operator.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epay.scancode.commons.dao.UrlFilterDAO;
import com.epay.scancode.commons.entity.UrlFilter;
import com.epay.scancode.service.operator.UrlFilterService;

@Service("urlFilterService")
public class UrlFilterServiceImpl implements UrlFilterService {
	@Autowired
	private UrlFilterDAO urlFilterDAO;
	
	public Set<String> findRoles(String name){
		List<UrlFilter> roleList= urlFilterDAO.findRoles(name);
		Set<String> set=new HashSet<String>();
		for (UrlFilter filter : roleList) {
			set.add(filter.getRoles());
		}
		return set;
	}

	public List<UrlFilter> findAll() {
		// TODO Auto-generated method stub
		return urlFilterDAO.findAllUrl();
	}
}
