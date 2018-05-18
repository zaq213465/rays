package com.epay.scancode.commons.vo;

import java.util.Date;

import com.epay.scancode.commons.entity.ProfitMerchantDetail;

public class ProfitMerchantDetailVO extends ProfitMerchantDetail{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 3832734214386749099L;
	private String organName;
	private String merchantName;
	private Date transDate;
	public String getOrganName() {
		return organName;
	}
	public void setOrganName(String organName) {
		this.organName = organName;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
}
