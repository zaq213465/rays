package com.epay.scancode.commons.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.entity.IdEntity;
import com.epay.commons.entity.annotations.SelectColumnMapping;
import com.epay.commons.entity.annotations.SelectColumnMappings;

@SelectColumnMappings({
	@SelectColumnMapping(property = "id", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "id"),
	@SelectColumnMapping(property = "tradeDate", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "trade_date"),
	@SelectColumnMapping(property = "appId", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "app_id"),
	@SelectColumnMapping(property = "agencyNo", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "agency_no"),
	@SelectColumnMapping(property = "merchantNo", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "merchant_no"),
	@SelectColumnMapping(property = "alipayTradeNo", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "alipay_trade_no"),
	@SelectColumnMapping(property = "merchantOrderNo", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "merchant_order_no"),
	@SelectColumnMapping(property = "tradeTime", type = Date.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "trade_time"),
	@SelectColumnMapping(property = "tradeType", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "trade_type"),
	@SelectColumnMapping(property = "tradeAmt", type = BigDecimal.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "trade_amt"),
	@SelectColumnMapping(property = "merchantFees", type = BigDecimal.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "merchant_fees"),
	@SelectColumnMapping(property = "merchantAmt", type = BigDecimal.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "merchant_amt"),
	@SelectColumnMapping(property = "productName", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "product_name"),
	@SelectColumnMapping(property = "storeNo", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "store_no"),
	@SelectColumnMapping(property = "storeName", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "store_name"),
	@SelectColumnMapping(property = "refundSerialNo", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "refund_serial_no"),
	@SelectColumnMapping(property = "payType", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "pay_type"),
	@SelectColumnMapping(property = "remake", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "remake"),
	@SelectColumnMapping(property = "temp1", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "temp_1"),
	@SelectColumnMapping(property = "temp2", type = java.lang.String.class, table = "t_clearing_t1_webank_zfb", tableAlias = "A", column = "temp_2")
})

@Generated("2017-07-07 10:13:01")
public class ClearingT1WebankZfb implements IdEntity<String> {
	
	private static final long serialVersionUID = 5454155825314635342L;
	
	private String id;//主键id
	private String tradeDate;//交易日期
	private String appId;//appId
	private String agencyNo;//代理商编号
	private String merchantNo;//商户编号
	private String alipayTradeNo;//支付宝交易号
	private String merchantOrderNo;//商户订单号
	private Date tradeTime;//交易时间
	private String tradeType;//交易类型(01支付 02退款 03撤销)
	private BigDecimal tradeAmt;//交易金额或者退款金额
	private BigDecimal merchantFees;//商户手续费（服务费）
	private BigDecimal merchantAmt;//商户收款金额（实收净额）
	private String productName;//商品名称
	private String storeNo;//门店编号
	private String storeName;//门店名称
	private String refundSerialNo;//退款请求号
	private String payType;//payType
	private String remake;//备注
	private String temp1;//temp1
	private String temp2;//temp2

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setTradeDate(String value) {
		this.tradeDate = value;
	}
	
	public String getTradeDate() {
		return this.tradeDate;
	}
	public void setAppId(String value) {
		this.appId = value;
	}
	
	public String getAppId() {
		return this.appId;
	}
	public void setAgencyNo(String value) {
		this.agencyNo = value;
	}
	
	public String getAgencyNo() {
		return this.agencyNo;
	}
	public void setMerchantNo(String value) {
		this.merchantNo = value;
	}
	
	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setAlipayTradeNo(String value) {
		this.alipayTradeNo = value;
	}
	
	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setMerchantOrderNo(String value) {
		this.merchantOrderNo = value;
	}
	
	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setTradeTime(Date value) {
		this.tradeTime = value;
	}
	
	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeType(String value) {
		this.tradeType = value;
	}
	
	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeAmt(BigDecimal value) {
		this.tradeAmt = value;
	}
	
	public BigDecimal getTradeAmt() {
		return this.tradeAmt;
	}
	public void setMerchantFees(BigDecimal value) {
		this.merchantFees = value;
	}
	
	public BigDecimal getMerchantFees() {
		return this.merchantFees;
	}
	public void setMerchantAmt(BigDecimal value) {
		this.merchantAmt = value;
	}
	
	public BigDecimal getMerchantAmt() {
		return this.merchantAmt;
	}
	public void setProductName(String value) {
		this.productName = value;
	}
	
	public String getProductName() {
		return this.productName;
	}
	public void setStoreNo(String value) {
		this.storeNo = value;
	}
	
	public String getStoreNo() {
		return this.storeNo;
	}
	public void setStoreName(String value) {
		this.storeName = value;
	}
	
	public String getStoreName() {
		return this.storeName;
	}
	public void setRefundSerialNo(String value) {
		this.refundSerialNo = value;
	}
	
	public String getRefundSerialNo() {
		return this.refundSerialNo;
	}
	public void setPayType(String value) {
		this.payType = value;
	}
	
	public String getPayType() {
		return this.payType;
	}
	public void setRemake(String value) {
		this.remake = value;
	}
	
	public String getRemake() {
		return this.remake;
	}
	public void setTemp1(String value) {
		this.temp1 = value;
	}
	
	public String getTemp1() {
		return this.temp1;
	}
	public void setTemp2(String value) {
		this.temp2 = value;
	}
	
	public String getTemp2() {
		return this.temp2;
	}

}

