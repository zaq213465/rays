package com.epay.scancode.commons.entity.passage;

import java.io.Serializable;

/**
 * 退款返回报文
 * @author husain
 *
 */
public class MerchantPicUploadResponse extends BaseResponse implements Serializable{

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


	@Override
	public String toString() {
		return "MerchantPicUploadResponse [path=" + path + "]";
	}
	

}
