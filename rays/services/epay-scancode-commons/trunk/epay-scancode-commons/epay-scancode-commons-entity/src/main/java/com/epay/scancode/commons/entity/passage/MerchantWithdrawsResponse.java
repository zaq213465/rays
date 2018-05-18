package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

/**
 * 商户提现统一参数
 * @author Administrator
 *
 */
public class MerchantWithdrawsResponse extends BaseResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String status;
	private String passageOrderNo;//第三方交易流水号

	public String getPassageOrderNo() {
		return passageOrderNo;
	}

	public void setPassageOrderNo(String passageOrderNo) {
		this.passageOrderNo = passageOrderNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
