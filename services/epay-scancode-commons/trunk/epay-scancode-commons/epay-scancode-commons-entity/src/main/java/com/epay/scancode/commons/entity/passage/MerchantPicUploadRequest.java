package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

/**
 * 商户支付参数
 * @author Administrator
 *
 */
public class MerchantPicUploadRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2233429044530309739L;
	
	private String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
    
}
