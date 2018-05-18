package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 商户入驻返回统一参数
 * @author Administrator
 *
 */
public class MerchantConfigResponse extends BaseResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String passageMerchantNo;
	private String merchantStatus;
	
	private List<MerchantJoinResult> joinResult = new ArrayList<>();
	
	public String getMerchantStatus() {
		return merchantStatus;
	}
	public void setMerchantStatus(String merchantStatus) {
		this.merchantStatus = merchantStatus;
	}
	public List<MerchantJoinResult> getJoinResult() {
		return joinResult;
	}
	public void setJoinResult(List<MerchantJoinResult> joinResult) {
		this.joinResult = joinResult;
	}
	public String getPassageMerchantNo() {
		return passageMerchantNo;
	}
	public void setPassageMerchantNo(String passageMerchantNo) {
		this.passageMerchantNo = passageMerchantNo;
	}
}
