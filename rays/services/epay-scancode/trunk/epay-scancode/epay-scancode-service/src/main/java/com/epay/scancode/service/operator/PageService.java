package com.epay.scancode.service.operator;

import com.epay.commons.utils.PagingResult;
import com.epay.scancode.commons.condition.SysResourceCondition;
import com.epay.scancode.commons.entity.SysResource;

public interface PageService {

	public PagingResult<SysResource> findAllMenu(SysResourceCondition condition);//(int pageNo,int pageSize);
}
