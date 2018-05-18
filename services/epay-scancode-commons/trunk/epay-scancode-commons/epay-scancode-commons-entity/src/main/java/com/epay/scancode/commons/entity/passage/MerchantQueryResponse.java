package com.epay.scancode.commons.entity.passage;

import java.util.ArrayList;
import java.util.List;

/**
 * 商户入驻统一参数
 * @author Administrator
 *
 */
public class MerchantQueryResponse extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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

	List<MerchantRate> merchantRate = new ArrayList<>();	//商户费率

	private String district;	//地区号，例如：0755

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

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
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

	public String getMerchantNature() {
		return merchantNature;
	}

	public void setMerchantNature(String merchantNature) {
		this.merchantNature = merchantNature;
	}

	public String getRegisterType() {
		return registerType;
	}

	public void setRegisterType(String registerType) {
		this.registerType = registerType;
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

	public List<MerchantRate> getMerchantRate() {
		return merchantRate;
	}

	public void setMerchantRate(List<MerchantRate> merchantRate) {
		this.merchantRate = merchantRate;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	private String merchantStatus;

	public String getMerchantStatus() {
		return merchantStatus;
	}

	public void setMerchantStatus(String merchantStatus) {
		this.merchantStatus = merchantStatus;
	}
	
}
