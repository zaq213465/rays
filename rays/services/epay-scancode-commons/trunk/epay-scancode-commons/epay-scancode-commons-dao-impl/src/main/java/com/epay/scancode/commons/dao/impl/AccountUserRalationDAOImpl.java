/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2016
 */package com.epay.scancode.commons.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.dao.impl.MybatisEntityDAO;
import com.epay.scancode.commons.dao.AccountUserRalationDAO;
import com.epay.scancode.commons.entity.AccountUserRalation;

@Repository(value="accountUserRalationDAO")
@Generated("2016-09-21 16:21:30")
public class AccountUserRalationDAOImpl extends MybatisEntityDAO<AccountUserRalation, String> implements AccountUserRalationDAO {
	/**
	 * 状态更新
	 */
	@Override
	public long updateStatus(String id,String status){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("status", status);
		return getSqlSession().update(sqlId("updateStatus"),map);
	}	
}