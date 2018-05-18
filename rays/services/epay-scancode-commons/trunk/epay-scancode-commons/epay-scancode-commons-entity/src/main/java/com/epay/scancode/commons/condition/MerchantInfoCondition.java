/*
 * Powered By [华付通]
 * Web Site: http://www.huaepay.com/
 * Since 2016 - 2016
 */package com.epay.scancode.commons.condition;

import java.util.Date;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.utils.PagingCondition;

@Generated("2016-10-20 17:39:26")
public class MerchantInfoCondition extends PagingCondition {
	
	private static final long serialVersionUID = 1L;
	
	private String id;//主键id
	private String channelNo;//渠道编号
	private String agentNo;//代理商编号
	private String merchantNo;//商户编号
	private String merchantName;//商户名称
	private String shortName;//商户简称
	private String qrCode;//二维码编号
	private Integer creditPayStatus;//是否支持禁用信息卡支付：1正常 2禁用
	private Integer authenStatus;//实名认证情况：0 未认证 1已认证 2认证失败
	private String isT0;//是否支持T0：Y 支持 N不支持
	private String registerType;//商户模式：01 大商户模式 02 一户一码模式
	private String status;//是否有效：0 申请中 1 上级审核通过 2 上级审核拒绝 3平台审核通过 4 平台审核拒绝 5 停用
	private Date createTime;//入网时间
	private Date updateTime;//修改时间
	private String operator;//操作人账号
	private String remark;//备注
	private String temp1;//temp1
	private String temp2;//temp2
	private String temp3;//temp3
	private String temp4;//temp4
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
	
	
	private boolean isCheck=true;//是否检查修改 
	private String jsapiTicket;//检测当前的jsapiticket是否过期
	
	private Date queryStartTime;//查询条件
	
	private Date queryEndTime;

	private String nodeSeq;//当前节点的标识
	
	private String channelName;//渠道名称
	private String agentName;//代理商名称
	
	private String recordStatus;//记录状态，Y:正常，N:删除
	
	//银行账户信息
	private String bankCode;//银行开户行代码
	private String bankName;//开户行银行名称（支行）
	private String bankCard;//银行卡号码
	private String myIdCard;//身份证号码
	private String myName;//姓名
	private String myMobile;//手机号码
	private String accountType;//是否对公对私，1：对公，0：对私	
	private String bankProvince;//开户支行所在省
	private String bankCity;//开户支行所在市
    private String bankId;//开户银行id
    private String bankSubName;//开户支行名称
	
	//子商户号配置
	private String jsapiPath;//子商户公众账号JSAPI支付授权目录
	private String subAppid;//子商户SubAPPID
	private String subscribeAppid;//子商户推荐关注公众账号APPID
	
	private String identification;//银行标识
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	public String getAgentNo() {
		return agentNo;
	}
	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public Integer getCreditPayStatus() {
		return creditPayStatus;
	}
	public void setCreditPayStatus(Integer creditPayStatus) {
		this.creditPayStatus = creditPayStatus;
	}
	public Integer getAuthenStatus() {
		return authenStatus;
	}
	public void setAuthenStatus(Integer authenStatus) {
		this.authenStatus = authenStatus;
	}
	public String getIsT0() {
		return isT0;
	}
	public void setIsT0(String isT0) {
		this.isT0 = isT0;
	}
	public String getRegisterType() {
		return registerType;
	}
	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getTemp1() {
		return temp1;
	}
	public void setTemp1(String temp1) {
		this.temp1 = temp1;
	}
	public String getTemp2() {
		return temp2;
	}
	public void setTemp2(String temp2) {
		this.temp2 = temp2;
	}
	public String getTemp3() {
		return temp3;
	}
	public void setTemp3(String temp3) {
		this.temp3 = temp3;
	}
	public String getTemp4() {
		return temp4;
	}
	public void setTemp4(String temp4) {
		this.temp4 = temp4;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getIdcardImg1() {
		return idcardImg1;
	}
	public void setIdcardImg1(String idcardImg1) {
		this.idcardImg1 = idcardImg1;
	}
	public String getIdcardImg2() {
		return idcardImg2;
	}
	public void setIdcardImg2(String idcardImg2) {
		this.idcardImg2 = idcardImg2;
	}
	public String getIdcardImg3() {
		return idcardImg3;
	}
	public void setIdcardImg3(String idcardImg3) {
		this.idcardImg3 = idcardImg3;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMerchantLicense() {
		return merchantLicense;
	}
	public void setMerchantLicense(String merchantLicense) {
		this.merchantLicense = merchantLicense;
	}
	public String getMerchantLicenseImg() {
		return merchantLicenseImg;
	}
	public void setMerchantLicenseImg(String merchantLicenseImg) {
		this.merchantLicenseImg = merchantLicenseImg;
	}
	public String getMerchantNature() {
		return merchantNature;
	}
	public void setMerchantNature(String merchantNature) {
		this.merchantNature = merchantNature;
	}
	public String getOpenYear() {
		return openYear;
	}
	public void setOpenYear(String openYear) {
		this.openYear = openYear;
	}
	public String getContractNo() {
		return contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getBusinessStartDate() {
		return businessStartDate;
	}
	public void setBusinessStartDate(String businessStartDate) {
		this.businessStartDate = businessStartDate;
	}
	public String getBusinessEndDate() {
		return businessEndDate;
	}
	public void setBusinessEndDate(String businessEndDate) {
		this.businessEndDate = businessEndDate;
	}
	public String getTaxNo() {
		return taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	public String getTaxImg() {
		return taxImg;
	}
	public void setTaxImg(String taxImg) {
		this.taxImg = taxImg;
	}
	public String getOrgNo() {
		return orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	public String getMainBusiness() {
		return mainBusiness;
	}
	public void setMainBusiness(String mainBusiness) {
		this.mainBusiness = mainBusiness;
	}
	public String getBusinessRange() {
		return businessRange;
	}
	public void setBusinessRange(String businessRange) {
		this.businessRange = businessRange;
	}
	public String getRegisterAddr() {
		return registerAddr;
	}
	public void setRegisterAddr(String registerAddr) {
		this.registerAddr = registerAddr;
	}
	public String getPositionCode() {
		return positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}
	public String getMerchantArea() {
		return merchantArea;
	}
	public void setMerchantArea(String merchantArea) {
		this.merchantArea = merchantArea;
	}
	public boolean isCheck() {
		return isCheck;
	}
	public void setCheck(boolean isCheck) {
		this.isCheck = isCheck;
	}
	public String getJsapiTicket() {
		return jsapiTicket;
	}
	public void setJsapiTicket(String jsapiTicket) {
		this.jsapiTicket = jsapiTicket;
	}
	public Date getQueryStartTime() {
		return queryStartTime;
	}
	public void setQueryStartTime(Date queryStartTime) {
		this.queryStartTime = queryStartTime;
	}
	public Date getQueryEndTime() {
		return queryEndTime;
	}
	public void setQueryEndTime(Date queryEndTime) {
		this.queryEndTime = queryEndTime;
	}
	public String getNodeSeq() {
		return nodeSeq;
	}
	public void setNodeSeq(String nodeSeq) {
		this.nodeSeq = nodeSeq;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCard() {
		return bankCard;
	}
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
	public String getMyIdCard() {
		return myIdCard;
	}
	public void setMyIdCard(String myIdCard) {
		this.myIdCard = myIdCard;
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public String getMyMobile() {
		return myMobile;
	}
	public void setMyMobile(String myMobile) {
		this.myMobile = myMobile;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getRecordStatus() {
		return recordStatus;
	}
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}
	public String getJsapiPath() {
		return jsapiPath;
	}
	public void setJsapiPath(String jsapiPath) {
		this.jsapiPath = jsapiPath;
	}
	public String getSubAppid() {
		return subAppid;
	}
	public void setSubAppid(String subAppid) {
		this.subAppid = subAppid;
	}
	public String getSubscribeAppid() {
		return subscribeAppid;
	}
	public void setSubscribeAppid(String subscribeAppid) {
		this.subscribeAppid = subscribeAppid;
	}
	public String getBankProvince() {
		return bankProvince;
	}
	public void setBankProvince(String bankProvince) {
		this.bankProvince = bankProvince;
	}
	public String getBankCity() {
		return bankCity;
	}
	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankSubName() {
		return bankSubName;
	}
	public void setBankSubName(String bankSubName) {
		this.bankSubName = bankSubName;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	
	
}

