package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;
import java.util.Map;

/**
 * 商户提现统一参数
 * @author Administrator
 *
 */
public class MerchantConfigRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String wbMerchantId;
	private String agencyId;
	private String jsapiPath;
	private String subAppid;//子商户SubAPPID
	private String subscribeAppid;//子商户推荐关注公众账号APPID
	
	public String getWbMerchantId() {
		return wbMerchantId;
	}
	public void setWbMerchantId(String wbMerchantId) {
		this.wbMerchantId = wbMerchantId;
	}
	public String getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}
	public String getSubAppid() {
		return subAppid;
	}
	public void setSubAppid(String subAppid) {
		this.subAppid = subAppid;
	}
	public String getSubscribeAppid() {
		return subscribeAppid;
	}
	public void setSubscribeAppid(String subscribeAppid) {
		this.subscribeAppid = subscribeAppid;
	}
	public String getJsapiPath() {
		return jsapiPath;
	}
	public void setJsapiPath(String jsapiPath) {
		this.jsapiPath = jsapiPath;
	}
	
	
}
