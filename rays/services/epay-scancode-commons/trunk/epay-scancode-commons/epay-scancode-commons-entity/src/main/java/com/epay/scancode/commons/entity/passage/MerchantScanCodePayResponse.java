package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

/**
 * 商户扫码支付统一返回参数
 * @author Administrator
 *
 */
public class MerchantScanCodePayResponse extends BaseResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String qrCodeUrl;
	private String passageOrderNo;//第三方交易流水号
	private String payPlatOrderNo;//微信、支付宝的流水号

	public String getPayPlatOrderNo() {
		return payPlatOrderNo;
	}

	public void setPayPlatOrderNo(String payPlatOrderNo) {
		this.payPlatOrderNo = payPlatOrderNo;
	}

	public String getPassageOrderNo() {
		return passageOrderNo;
	}

	public void setPassageOrderNo(String passageOrderNo) {
		this.passageOrderNo = passageOrderNo;
	}

	public String getQrCodeUrl() {
		return qrCodeUrl;
	}

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

}
