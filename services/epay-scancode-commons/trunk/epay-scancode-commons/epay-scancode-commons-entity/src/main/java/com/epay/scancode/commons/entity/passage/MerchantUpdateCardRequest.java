package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

/**
 * 修改商户结算银行卡信息
 * @author lemon
 *
 */
public class MerchantUpdateCardRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -375274447609580462L;

	private String merchantNo;//商户编号
	
	private String accountName;//客户名称
	
	private String mobile;//手机号码
	
	private String bankCode;//联行号
	
	private String bankCard;//银行卡号
	
	private String bankName;//银行名称
	
	private String accountType;//是否对公账号 Y:是，N：否
	
	private String returnURL;//回调地址
	
	private String subbranchOpbank;//开户支行
	
	private String opbankAddr;//开户地址

	public String getSubbranchOpbank() {
		return subbranchOpbank;
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

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getReturnURL() {
		return returnURL;
	}

	public void setReturnURL(String returnURL) {
		this.returnURL = returnURL;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	
}
