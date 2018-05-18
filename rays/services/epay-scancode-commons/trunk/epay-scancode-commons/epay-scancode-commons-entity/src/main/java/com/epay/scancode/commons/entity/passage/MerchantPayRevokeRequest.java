package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

/**
 * 修改商户结算银行卡信息
 * @author lemon
 *
 */
public class MerchantPayRevokeRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -375274447609580462L;

	private String orderId;
	
	private String tradeNo;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
}
