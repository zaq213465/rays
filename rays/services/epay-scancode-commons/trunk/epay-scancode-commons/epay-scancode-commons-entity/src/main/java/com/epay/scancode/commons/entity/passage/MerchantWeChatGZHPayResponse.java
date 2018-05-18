package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

/**
 * 商户扫码支付统一返回参数
 * @author Administrator
 *
 */
public class MerchantWeChatGZHPayResponse extends BaseResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String appid;
	private String payStr;
	private String tokenId;
	private String payInfo;
	private String passageOrderNo;//第三方交易流水号
	
	public String getPassageOrderNo() {
		return passageOrderNo;
	}

	public void setPassageOrderNo(String passageOrderNo) {
		this.passageOrderNo = passageOrderNo;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public String getPayInfo() {
		return payInfo;
	}

	public void setPayInfo(String payInfo) {
		this.payInfo = payInfo;
	}

	public String getPayStr() {
		return payStr;
	}

	public void setPayStr(String payStr) {
		this.payStr = payStr;
	}
}
