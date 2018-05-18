package com.epay.scancode.commons.condition;



import java.math.BigDecimal;
import java.util.Date;

import com.epay.commons.base.annotation.Generated;
import com.epay.commons.utils.PagingCondition;

@Generated("2018-03-19 17:32:56")
public class ConsumerRedCondition extends PagingCondition {
	
	private static final long serialVersionUID = 1L;
	
	private String id;//主键id
	private String merchantNo;//商户编号
	private String redNo;//红包编号
	private String redCombination;//红包金额组合
	private BigDecimal redAmount;//红包总金额
	private Date time;//时间
	private String redRemake;//红包祝福语
	private String state;//领取状态 0：领取中 1：已领完 2：已过期
	private Integer num;//数量
	private Date createTime;//创建时间

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setMerchantNo(String value) {
		this.merchantNo = value;
	}
	
	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setRedNo(String value) {
		this.redNo = value;
	}
	
	public String getRedNo() {
		return this.redNo;
	}
	public void setRedCombination(String value) {
		this.redCombination = value;
	}
	
	public String getRedCombination() {
		return this.redCombination;
	}

	public BigDecimal getRedAmount() {
		return redAmount;
	}

	public void setRedAmount(BigDecimal redAmount) {
		this.redAmount = redAmount;
	}

	public void setTime(Date value) {
		this.time = value;
	}
	
	public Date getTime() {
		return this.time;
	}
	public void setRedRemake(String value) {
		this.redRemake = value;
	}
	
	public String getRedRemake() {
		return this.redRemake;
	}
	public void setState(String value) {
		this.state = value;
	}
	
	public String getState() {
		return this.state;
	}
	public void setNum(Integer value) {
		this.num = value;
	}
	
	public Integer getNum() {
		return this.num;
	}
	public void setCreateTime(Date value) {
		this.createTime = value;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
}

