package com.epay.scancode.commons.dao;

import java.util.Map;

import com.epay.commons.dao.EntityDAO;
import com.epay.scancode.commons.entity.ProIndex;


    @com.epay.commons.base.annotation.Generated("2016-04-22 14:09")
public interface ProIndexDAO extends EntityDAO<ProIndex, String> {
    	/**
    	 * 调用存储过程生成id
    	 * @param map
    	 */
    	void getOrderId(Map<String,Object> map);
}