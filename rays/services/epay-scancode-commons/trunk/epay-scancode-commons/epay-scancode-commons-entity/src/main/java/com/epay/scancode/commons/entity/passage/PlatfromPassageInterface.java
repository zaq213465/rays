/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2017
 */package com.epay.scancode.commons.entity.passage;

import java.util.Date;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "ID"),
	@SelectColumnMapping(property = "passageNo", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "passage_no"),
	@SelectColumnMapping(property = "interfaceType", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "interface_type"),
	@SelectColumnMapping(property = "interfaceCode", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "interface_code"),
	@SelectColumnMapping(property = "interfaceName", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "interface_name"),
	@SelectColumnMapping(property = "payCode", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "pay_code"),
	@SelectColumnMapping(property = "interfaceLimit", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "interface_limit"),
	@SelectColumnMapping(property = "passageParams", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "passage_params"),
	@SelectColumnMapping(property = "passagePriority", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "passage_priority"),
	@SelectColumnMapping(property = "userStatus", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "user_status"),
	@SelectColumnMapping(property = "status", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "status"),
	@SelectColumnMapping(property = "recordStatus", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "RECORD_STATUS"),
	@SelectColumnMapping(property = "createTime", type = java.util.Date.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "CREATE_TIME"),
	@SelectColumnMapping(property = "updateTime", type = java.util.Date.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "UPDATE_TIME"),
	@SelectColumnMapping(property = "operator", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "OPERATOR"),
	@SelectColumnMapping(property = "remark", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "REMARK"),
	@SelectColumnMapping(property = "temp1", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "TEMP_1"),
	@SelectColumnMapping(property = "temp2", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "TEMP_2"),
	@SelectColumnMapping(property = "temp3", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "TEMP_3"),
	@SelectColumnMapping(property = "temp4", type = java.lang.String.class, table = "t_platfrom_passage_interface", tableAlias = "A", column = "TEMP_4")
})

@Generated("2017-03-29 09:37:10")
public class PlatfromPassageInterface implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//主键id
	private String passageNo;//通道编号
	private String interfaceType;//通道接口类型（0 支付类 1 商户类 2 查询类 3 对账类）
	private String interfaceCode;//通道接口编号
	private String interfaceName;//通道接口名称
	private String payCode;//通道支付类型
	private String interfaceLimit;//接口限制
	private String passageParams;//通道参数
	private String passagePriority;//通道优先级
	private String userStatus;//使用状态，Y：使用中，N：未使用
	private String status;//状态，1：正常，2：关闭
	private String recordStatus;//记录状态，Y:正常，N:删除
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	private String operator;//操作人账号
	private String remark;//备注
	private String temp1;//temp1
	private String temp2;//temp2
	private String temp3;//temp3
	private String temp4;//temp4

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setPassageNo(String value) {
		this.passageNo = value;
	}
	
	public String getPassageNo() {
		return this.passageNo;
	}
	public void setInterfaceType(String value) {
		this.interfaceType = value;
	}
	
	public String getInterfaceType() {
		return this.interfaceType;
	}
	public void setInterfaceCode(String value) {
		this.interfaceCode = value;
	}
	
	public String getInterfaceCode() {
		return this.interfaceCode;
	}
	public void setInterfaceName(String value) {
		this.interfaceName = value;
	}
	
	public String getInterfaceName() {
		return this.interfaceName;
	}
	public void setPayCode(String value) {
		this.payCode = value;
	}
	
	public String getPayCode() {
		return this.payCode;
	}
	public void setInterfaceLimit(String value) {
		this.interfaceLimit = value;
	}
	
	public String getInterfaceLimit() {
		return this.interfaceLimit;
	}
	public void setPassageParams(String value) {
		this.passageParams = value;
	}
	
	public String getPassageParams() {
		return this.passageParams;
	}
	public void setPassagePriority(String value) {
		this.passagePriority = value;
	}
	
	public String getPassagePriority() {
		return this.passagePriority;
	}
	public void setUserStatus(String value) {
		this.userStatus = value;
	}
	
	public String getUserStatus() {
		return this.userStatus;
	}
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return this.status;
	}
	public void setRecordStatus(String value) {
		this.recordStatus = value;
	}
	
	public String getRecordStatus() {
		return this.recordStatus;
	}
	public void setCreateTime(Date value) {
		this.createTime = value;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setUpdateTime(Date value) {
		this.updateTime = value;
	}
	
	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setOperator(String value) {
		this.operator = value;
	}
	
	public String getOperator() {
		return this.operator;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setTemp1(String value) {
		this.temp1 = value;
	}
	
	public String getTemp1() {
		return this.temp1;
	}
	public void setTemp2(String value) {
		this.temp2 = value;
	}
	
	public String getTemp2() {
		return this.temp2;
	}
	public void setTemp3(String value) {
		this.temp3 = value;
	}
	
	public String getTemp3() {
		return this.temp3;
	}
	public void setTemp4(String value) {
		this.temp4 = value;
	}
	
	public String getTemp4() {
		return this.temp4;
	}

	
}

