package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;
import java.math.BigDecimal;

public class MerchantRate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String payCode;		//支付通道代码
	private BigDecimal withdrawRate;//提现垫资手续费
	private BigDecimal tradeRate;	//交易手续费率
	private BigDecimal settleAmt;	//T1清算手续费
	private BigDecimal withdrawAmt;	//提现手续费 (元)
	private String category;		//经营类目
	private String status;	//支付通道状态
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPayCode() {
		return payCode;
	}
	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}
	public BigDecimal getWithdrawRate() {
		return withdrawRate;
	}
	public void setWithdrawRate(BigDecimal withdrawRate) {
		this.withdrawRate = withdrawRate;
	}
	public BigDecimal getTradeRate() {
		return tradeRate;
	}
	public void setTradeRate(BigDecimal tradeRate) {
		this.tradeRate = tradeRate;
	}
	public BigDecimal getSettleAmt() {
		return settleAmt;
	}
	public void setSettleAmt(BigDecimal settleAmt) {
		this.settleAmt = settleAmt;
	}
	public BigDecimal getWithdrawAmt() {
		return withdrawAmt;
	}
	public void setWithdrawAmt(BigDecimal withdrawAmt) {
		this.withdrawAmt = withdrawAmt;
	}
	
}
