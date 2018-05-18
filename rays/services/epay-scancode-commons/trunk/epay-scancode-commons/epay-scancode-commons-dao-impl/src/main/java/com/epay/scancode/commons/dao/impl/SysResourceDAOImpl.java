package com.epay.scancode.commons.dao.impl;

import java.util.List;
import java.util.Map;

import com.epay.commons.dao.impl.MybatisEntityDAO;
import com.epay.scancode.commons.dao.SysResourceDAO;
import com.epay.scancode.commons.entity.SysResource;

@org.springframework.stereotype.Repository

    @com.epay.commons.base.annotation.Generated("2016-04-14 09:42")
public class SysResourceDAOImpl extends MybatisEntityDAO<SysResource, String> implements SysResourceDAO {

	@Override
	public List<SysResource> selectActiveMenu(String userId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("SysResource.selectActiveMenu",userId);
	}

	@Override
	public List<SysResource> selectActiveResource(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("SysResource.selectActiveResource",params);
	}
}