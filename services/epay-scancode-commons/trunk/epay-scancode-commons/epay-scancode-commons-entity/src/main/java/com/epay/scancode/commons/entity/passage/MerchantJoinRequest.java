package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 商户入驻统一参数
 * @author Administrator
 *
 */
public class MerchantJoinRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	//基础信息
	private String merchantName;//商户名称
	private String shortName;	//商户简称
	private String address;		//商户地址
	private String serPhone;	//客服电话
	private String idType;		//证件类型
	private String idCard;		//身份证号
	private String legalRepresent;//法人姓名
	private String merchantLicense;//商户营业执照号
	private String taxRegisterNo;//税务登记号
	private String positionCode; //单位代码，如果没有填“0”
	private String mainBusiness;//主营业务
	private String businessRange;//经营范围
	private String merchantNature;//商户性质
	private String registerType;//注册类型：普通模式商户有代理商填写“01”商户无代理商(商户直连模式)填写“02”
	private String merchantTypeCode;//mcc类别码
	private String registerAddr;//注册地址
	private String merchantLevel;//商户级别
	private String contractNo;//合同编号
	private String openYear;//开户年限
	private String category;//经营类目
	
	private String contactName;	//联系人
	private String phone;		//联系电话
	private String mobile;		//手机号码
	private String email;		//邮箱地址
	private String licenceBeginTime;//执照开始时间
	private String licenceEndTime;	//执照结束时间
	private String terminalId;	//终端机具号（格式统一）
	private String remark;		//备注
	
	private String bankCard;	//银行卡号
	private String bankCode;	//联行号
	private String bankName;	//开户行名称（到支行）
	private String accountName;	//持卡人姓名
	private String isRealAccount;//是否T0商户Y:是，N:否（默认T1）
	private String accountType;	//是否对公账号Y:是，N：否
	private String subbranchOpbank;//开户支行
	private String opbankAddr;//开户地址
	private String bankProvince;//开户行省编号
	private String bankCity;//开户行城市编号
	private String bankId;//开户行代码
	private String temp4;//身份证正反面代码
	private String province;//省份代码
	private String city;//城市代码
	private String county;//区县代码
	private String bankMobile;//开户手机号
	private String identification;//银行标识
	
	List<MerchantRate> merchantRate;	//商户费率

	private String district;	//地区号，例如：0755
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubbranchOpbank() {
		return subbranchOpbank;
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

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public void setSubbranchOpbank(String subbranchOpbank) {
		this.subbranchOpbank = subbranchOpbank;
	}

	public String getOpbankAddr() {
		return opbankAddr;
	}

	public void setOpbankAddr(String opbankAddr) {
		this.opbankAddr = opbankAddr;
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

	public String getMerchantLevel() {
		return merchantLevel;
	}

	public void setMerchantLevel(String merchantLevel) {
		this.merchantLevel = merchantLevel;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getRegisterAddr() {
		return registerAddr;
	}

	public void setRegisterAddr(String registerAddr) {
		this.registerAddr = registerAddr;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private Map<String, Object> expandParams;//拓展信息

	public List<MerchantRate> getMerchantRate() {
		return merchantRate;
	}

	public void setMerchantRate(List<MerchantRate> merchantRate) {
		this.merchantRate = merchantRate;
	}

	public String getMerchantTypeCode() {
		return merchantTypeCode;
	}

	public void setMerchantTypeCode(String merchantTypeCode) {
		this.merchantTypeCode = merchantTypeCode;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getRegisterType() {
		return registerType;
	}
	

	public String getTemp4() {
		return temp4;
	}

	public void setTemp4(String temp4) {
		this.temp4 = temp4;
	}

	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}

	public Map<String, Object> getExpandParams() {
		return expandParams;
	}

	public void setExpandParams(Map<String, Object> expandParams) {
		this.expandParams = expandParams;
	}

	public String getMerchantNature() {
		return merchantNature;
	}

	public void setMerchantNature(String merchantNature) {
		this.merchantNature = merchantNature;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSerPhone() {
		return serPhone;
	}

	public void setSerPhone(String serPhone) {
		this.serPhone = serPhone;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getLegalRepresent() {
		return legalRepresent;
	}

	public void setLegalRepresent(String legalRepresent) {
		this.legalRepresent = legalRepresent;
	}

	public String getMerchantLicense() {
		return merchantLicense;
	}

	public void setMerchantLicense(String merchantLicense) {
		this.merchantLicense = merchantLicense;
	}

	public String getTaxRegisterNo() {
		return taxRegisterNo;
	}

	public void setTaxRegisterNo(String taxRegisterNo) {
		this.taxRegisterNo = taxRegisterNo;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLicenceBeginTime() {
		return licenceBeginTime;
	}

	public void setLicenceBeginTime(String licenceBeginTime) {
		this.licenceBeginTime = licenceBeginTime;
	}

	public String getLicenceEndTime() {
		return licenceEndTime;
	}

	public void setLicenceEndTime(String licenceEndTime) {
		this.licenceEndTime = licenceEndTime;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
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

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getIsRealAccount() {
		return isRealAccount;
	}

	public void setIsRealAccount(String isRealAccount) {
		this.isRealAccount = isRealAccount;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBankMobile() {
		return bankMobile;
	}

	public void setBankMobile(String bankMobile) {
		this.bankMobile = bankMobile;
	}
	
}
