package com.epay.scancode.commons.contants;

public enum PassageType {
	PASSAGE_N("无默认通道","N"),
	PASSAGE_T0("T0通道","T0"),
	PASSAGE_T1("T1通道","T1"),
	PASSAGE_T01("通用通道","T01");
	
	private String desc;
	private String code;
	private PassageType(String desc,String code){
		this.desc=desc;
		this.code=code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
