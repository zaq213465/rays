package com.epay.scancode.commons.vo;

import com.epay.scancode.commons.entity.ProfitOrganDayPaytype;

public class ProfitOrganDayPaytypeVO extends ProfitOrganDayPaytype {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 2064219996811791844L;

	private String orgName;//名称
	private String identityFlag;//级别，代理商，渠道，平台等
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getIdentityFlag() {
		return identityFlag;
	}
	public void setIdentityFlag(String identityFlag) {
		this.identityFlag = identityFlag;
	}
	
}
