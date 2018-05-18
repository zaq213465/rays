package com.epay.scancode.commons.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.dao.impl.MybatisEntityDAO;
import com.epay.scancode.commons.dao.AdminDAO;
import com.epay.scancode.commons.entity.Admin;

@Repository
@Generated("2016-04-14 09:42")
public class AdminDAOImpl extends MybatisEntityDAO<Admin, String> implements AdminDAO {

	/**
	 * 状态更新
	 */
	@Override
	public long updateStatus(String id,Integer status){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("status", status);
		return getSqlSession().update(sqlId("updateStatus"),map);
	}
}