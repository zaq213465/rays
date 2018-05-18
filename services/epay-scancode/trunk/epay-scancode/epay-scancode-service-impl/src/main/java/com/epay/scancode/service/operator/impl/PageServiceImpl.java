package com.epay.scancode.service.operator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epay.commons.criteria.Cnd;
import com.epay.commons.criteria.Criteria;
import com.epay.commons.criteria.CriteriaBuilder;
import com.epay.commons.utils.PagingResult;
import com.epay.scancode.commons.condition.SysResourceCondition;
import com.epay.scancode.commons.dao.SysResourceDAO;
import com.epay.scancode.commons.entity.SysResource;
import com.epay.scancode.service.operator.PageService;

@Service
public class PageServiceImpl implements PageService{
	@Autowired
	private SysResourceDAO sysResourceDAO;

	@Override
	public PagingResult<SysResource> findAllMenu(SysResourceCondition condition) {
		CriteriaBuilder cb = Cnd.builder(SysResource.class);
		Criteria buildCriteria = cb.buildCriteria();
		buildCriteria.limit(Long.valueOf(condition.getFirst()), Long.valueOf(condition.getLast()));
		PagingResult<SysResource> findPagingResult = sysResourceDAO.findPagingResult(buildCriteria);
		return findPagingResult;
	}
}
