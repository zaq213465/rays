/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2017
 */package com.epay.scancode.commons.entity;

import java.util.Date;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "channelNo", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "channel_no"),
	@SelectColumnMapping(property = "agentNo", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "agent_no"),
	@SelectColumnMapping(property = "merchantNo", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "merchant_no"),
	@SelectColumnMapping(property = "busType", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "bus_type"),
	@SelectColumnMapping(property = "name", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "name"),
	@SelectColumnMapping(property = "idCard", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "id_card"),
	@SelectColumnMapping(property = "idcardImg1", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "idcard_img_1"),
	@SelectColumnMapping(property = "idcardImg2", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "idcard_img_2"),
	@SelectColumnMapping(property = "idcardImg3", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "idcard_img_3"),
	@SelectColumnMapping(property = "contactName", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "contact_name"),
	@SelectColumnMapping(property = "mobile", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "mobile"),
	@SelectColumnMapping(property = "phone", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "phone"),
	@SelectColumnMapping(property = "email", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "email"),
	@SelectColumnMapping(property = "address", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "address"),
	@SelectColumnMapping(property = "merchantLicense", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "merchant_license"),
	@SelectColumnMapping(property = "merchantLicenseImg", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "merchant_license_img"),
	@SelectColumnMapping(property = "merchantNature", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "merchant_nature"),
	@SelectColumnMapping(property = "openYear", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "open_year"),
	@SelectColumnMapping(property = "contractNo", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "contract_no"),
	@SelectColumnMapping(property = "businessStartDate", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "business_start_date"),
	@SelectColumnMapping(property = "businessEndDate", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "business_end_date"),
	@SelectColumnMapping(property = "taxNo", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "tax_no"),
	@SelectColumnMapping(property = "taxImg", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "tax_img"),
	@SelectColumnMapping(property = "orgNo", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "org_no"),
	@SelectColumnMapping(property = "mainBusiness", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "main_business"),
	@SelectColumnMapping(property = "businessRange", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "business_range"),
	@SelectColumnMapping(property = "registerAddr", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "register_addr"),
	@SelectColumnMapping(property = "positionCode", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "position_code"),
	@SelectColumnMapping(property = "merchantArea", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "merchant_area"),
	@SelectColumnMapping(property = "createTime", type = java.util.Date.class, table = "t_merchant_detail", tableAlias = "A", column = "create_time"),
	@SelectColumnMapping(property = "updateTime", type = java.util.Date.class, table = "t_merchant_detail", tableAlias = "A", column = "update_time"),
	@SelectColumnMapping(property = "operator", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "operator"),
	@SelectColumnMapping(property = "remark", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "remark"),
	@SelectColumnMapping(property = "temp1", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "temp_1"),
	@SelectColumnMapping(property = "temp2", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "temp_2"),
	@SelectColumnMapping(property = "temp3", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "temp_3"),
	@SelectColumnMapping(property = "temp4", type = java.lang.String.class, table = "t_merchant_detail", tableAlias = "A", column = "temp_4")
})

@Generated("2017-03-28 10:38:58")
public class MerchantDetail implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//主键id
	private String channelNo;//渠道编号
	private String agentNo;//代理商编号
	private String merchantNo;//商户编号
	private String busType;//经营类型
	private String name;//法人姓名
	private String idCard;//法人身份证号码
	private String idcardImg1;//身份证正面
	private String idcardImg2;//身份证反面
	private String idcardImg3;//手持身份证
	private String contactName;//联系人姓名
	private String mobile;//手机号码
	private String phone;//联系电话
	private String email;//邮箱
	private String address;//地址
	private String merchantLicense;//商户营业执照号
	private String merchantLicenseImg;//营业执照图片
	private String merchantNature;//商户性质,国有企业 ;三资企业 ;私营企业 ;集体企业；
	private String openYear;//经营年限
	private String contractNo;//合同编号
	private String businessStartDate;//执照开始时间
	private String businessEndDate;//执照结束时间
	private String taxNo;//税务登记证号码
	private String taxImg;//税务登记证图片
	private String orgNo;//组织机构代码
	private String mainBusiness;//主营业务
	private String businessRange;//经营范围
	private String registerAddr;//经营范围
	private String positionCode;//注册地址
	private String merchantArea;//地区
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
	public void setChannelNo(String value) {
		this.channelNo = value;
	}
	
	public String getChannelNo() {
		return this.channelNo;
	}
	public void setAgentNo(String value) {
		this.agentNo = value;
	}
	
	public String getAgentNo() {
		return this.agentNo;
	}
	public void setMerchantNo(String value) {
		this.merchantNo = value;
	}
	
	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setBusType(String value) {
		this.busType = value;
	}
	
	public String getBusType() {
		return this.busType;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setIdCard(String value) {
		this.idCard = value;
	}
	
	public String getIdCard() {
		return this.idCard;
	}
	public void setIdcardImg1(String value) {
		this.idcardImg1 = value;
	}
	
	public String getIdcardImg1() {
		return this.idcardImg1;
	}
	public void setIdcardImg2(String value) {
		this.idcardImg2 = value;
	}
	
	public String getIdcardImg2() {
		return this.idcardImg2;
	}
	public void setIdcardImg3(String value) {
		this.idcardImg3 = value;
	}
	
	public String getIdcardImg3() {
		return this.idcardImg3;
	}
	public void setContactName(String value) {
		this.contactName = value;
	}
	
	public String getContactName() {
		return this.contactName;
	}
	public void setMobile(String value) {
		this.mobile = value;
	}
	
	public String getMobile() {
		return this.mobile;
	}
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return this.phone;
	}
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setMerchantLicense(String value) {
		this.merchantLicense = value;
	}
	
	public String getMerchantLicense() {
		return this.merchantLicense;
	}
	public void setMerchantLicenseImg(String value) {
		this.merchantLicenseImg = value;
	}
	
	public String getMerchantLicenseImg() {
		return this.merchantLicenseImg;
	}
	public void setMerchantNature(String value) {
		this.merchantNature = value;
	}
	
	public String getMerchantNature() {
		return this.merchantNature;
	}
	public void setOpenYear(String value) {
		this.openYear = value;
	}
	
	public String getOpenYear() {
		return this.openYear;
	}
	public void setContractNo(String value) {
		this.contractNo = value;
	}
	
	public String getContractNo() {
		return this.contractNo;
	}
	public void setBusinessStartDate(String value) {
		this.businessStartDate = value;
	}
	
	public String getBusinessStartDate() {
		return this.businessStartDate;
	}
	public void setBusinessEndDate(String value) {
		this.businessEndDate = value;
	}
	
	public String getBusinessEndDate() {
		return this.businessEndDate;
	}
	public void setTaxNo(String value) {
		this.taxNo = value;
	}
	
	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxImg(String value) {
		this.taxImg = value;
	}
	
	public String getTaxImg() {
		return this.taxImg;
	}
	public void setOrgNo(String value) {
		this.orgNo = value;
	}
	
	public String getOrgNo() {
		return this.orgNo;
	}
	public void setMainBusiness(String value) {
		this.mainBusiness = value;
	}
	
	public String getMainBusiness() {
		return this.mainBusiness;
	}
	public void setBusinessRange(String value) {
		this.businessRange = value;
	}
	
	public String getBusinessRange() {
		return this.businessRange;
	}
	public void setRegisterAddr(String value) {
		this.registerAddr = value;
	}
	
	public String getRegisterAddr() {
		return this.registerAddr;
	}
	public void setPositionCode(String value) {
		this.positionCode = value;
	}
	
	public String getPositionCode() {
		return this.positionCode;
	}
	public void setMerchantArea(String value) {
		this.merchantArea = value;
	}
	
	public String getMerchantArea() {
		return this.merchantArea;
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

