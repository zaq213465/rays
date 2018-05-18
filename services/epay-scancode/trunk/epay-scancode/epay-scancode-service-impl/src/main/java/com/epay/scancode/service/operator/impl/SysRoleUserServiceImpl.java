package com.epay.scancode.service.operator.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epay.commons.criteria.Cnd;
import com.epay.commons.criteria.Criteria;
import com.epay.commons.criteria.CriteriaBuilder;
import com.epay.scancode.commons.dao.SysRoleUserDAO;
import com.epay.scancode.commons.entity.SysRoleUser;
import com.epay.scancode.service.operator.SysRoleUserService;

@Service("roleUserService")
public class SysRoleUserServiceImpl implements SysRoleUserService {
	@Autowired
	private SysRoleUserDAO sysRoleUserDAO;

	@Override
	public List<SysRoleUser> selectRoleUserByRoleId(String roleId) {
		// TODO Auto-generated method stub
		CriteriaBuilder cb = Cnd.builder(SysRoleUser.class);
		cb.andGroup(Cnd.builder(SysRoleUser.class).andEQ("roleId", roleId));
		Criteria buildCriteria = cb.buildCriteria();
		return sysRoleUserDAO.findByCriteria(buildCriteria);//.selectRoleUserByRoleId(roleId);
	}

	@Override
	public SysRoleUser selectRoleUserByUserId(String userId) {
		CriteriaBuilder cb = Cnd.builder(SysRoleUser.class);
		cb.andGroup(Cnd.builder(SysRoleUser.class).andEQ("accountId", userId));
		Criteria buildCriteria = cb.buildCriteria();
		return sysRoleUserDAO.findOneByCriteria(buildCriteria);
	}

	@Override
	public long insert(SysRoleUser roleUser) {
		return sysRoleUserDAO.insert(roleUser);
	}

	@Override
	public long update(SysRoleUser admin) {
		return sysRoleUserDAO.update(admin);
	}

	
}
