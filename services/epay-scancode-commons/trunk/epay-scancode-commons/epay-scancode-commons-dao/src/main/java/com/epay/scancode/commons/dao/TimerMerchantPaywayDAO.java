/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2016
 */package com.epay.scancode.commons.dao;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.dao.EntityDAO;
import com.epay.scancode.commons.entity.TimerMerchantPayway;

@Generated("2016-11-15 17:17:04")
public interface TimerMerchantPaywayDAO extends EntityDAO<TimerMerchantPayway, String> {

	/**
	 * @Title: updateStatus
	 * @Description: 状态更新
	 * @author: Ricky
	 * @param id
	 * @return: long
	 * @date CreateDate : 2016-11-15 17:17:04
	 */
	long updateStatus(String id,String status);	
}
