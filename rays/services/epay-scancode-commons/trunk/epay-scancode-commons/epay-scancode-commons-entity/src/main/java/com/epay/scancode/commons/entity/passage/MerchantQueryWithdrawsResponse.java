package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

/**
 * 商户支付查询结果
 * @author Administrator
 *
 */
public class MerchantQueryWithdrawsResponse extends BaseResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String payCode;
	private String status;
	private String drawAmount;
	private String drawFee;
	private String tradeFee;
	private String settleDate;
	private String createDate;
	private String passageOrderNo;//第三方交易流水号
	
	public String getPassageOrderNo() {
		return passageOrderNo;
	}
	public void setPassageOrderNo(String passageOrderNo) {
		this.passageOrderNo = passageOrderNo;
	}
	public String getPayCode() {
		return payCode;
	}
	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDrawAmount() {
		return drawAmount;
	}
	public void setDrawAmount(String drawAmount) {
		this.drawAmount = drawAmount;
	}
	public String getDrawFee() {
		return drawFee;
	}
	public void setDrawFee(String drawFee) {
		this.drawFee = drawFee;
	}
	public String getTradeFee() {
		return tradeFee;
	}
	public void setTradeFee(String tradeFee) {
		this.tradeFee = tradeFee;
	}
	public String getSettleDate() {
		return settleDate;
	}
	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
}
