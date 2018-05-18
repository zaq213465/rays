package com.epay.scancode.commons.dao;

import com.epay.commons.dao.EntityDAO;
import com.epay.scancode.commons.entity.Admin;


@com.epay.commons.base.annotation.Generated("2016-04-14 09:42")
public interface AdminDAO extends EntityDAO<Admin, String> {
	/**
	 * 状态更新
	 */
	long updateStatus(String id,Integer status);
}