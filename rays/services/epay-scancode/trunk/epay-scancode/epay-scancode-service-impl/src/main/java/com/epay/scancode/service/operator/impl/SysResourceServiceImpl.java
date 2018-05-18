package com.epay.scancode.service.operator.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epay.scancode.commons.dao.SysResourceDAO;
import com.epay.scancode.commons.entity.SysResource;
import com.epay.scancode.service.operator.SysResourceService;


@Service("resourceService")
public class SysResourceServiceImpl implements SysResourceService{
	@Autowired
	private SysResourceDAO sysResourceDAO;
	
	@Override
	public List<SysResource> selectActiveMenu(String userId){
		List<SysResource> menuList= sysResourceDAO.selectActiveMenu(userId);
		return menuList;
	}
	
	@Override
	public List<SysResource> selectActiveResource(Map<String, Object> params) {
		return sysResourceDAO.selectActiveResource(params);
	}
}
