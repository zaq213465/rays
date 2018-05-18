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
import com.epay.scancode.commons.dao.TimerMerchantPaywayDAO;
import com.epay.scancode.commons.entity.TimerMerchantPayway;

@Repository(value="merchantPaywayTmpDAO")
@Generated("2016-11-15 17:17:04")
public class TimerMerchantPaywayDAOImpl extends MybatisEntityDAO<TimerMerchantPayway, String> implements TimerMerchantPaywayDAO {

	/**
	 * @Title: updateStatus
	 * @Description: 状态更新
	 * @author: Ricky
	 * @param id
	 * @return: long
	 * @date CreateDate : 2016-11-15 17:17:04
	 */
	@Override
	public long updateStatus(String id,String status){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("status", status);
		return getSqlSession().update(sqlId("updateStatus"),map);
	}	
}