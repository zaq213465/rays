package com.epay.scancode.commons.vo;

import com.epay.scancode.commons.entity.OrderPayment;

public class OrderPaymentVo extends OrderPayment{

	/**
	 * @author liushuyu
	 * Desc : 
	 * DATE: 2017年6月12日
	 */
	private static final long serialVersionUID = -951879260835127589L;

	private String cashierName; //收银员名称

	public String getCashierName() {
		return cashierName;
	}

	public void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}
	
	
}
