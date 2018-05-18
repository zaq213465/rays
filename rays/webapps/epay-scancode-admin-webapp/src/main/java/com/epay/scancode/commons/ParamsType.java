package com.epay.scancode.commons;

public enum ParamsType {
	PARAMS_SMS("短信参数", "0"),
	PARAMS_SETTLEAMT("渠道结算费率", "1"),
	PARAMS_OUTHER("其他", "99");
	
	// 成员变量  
    private String desc;  
    private String code;  
    // 构造方法  
    private ParamsType(String desc, String code) {  
        this.desc = desc;  
        this.code = code; 
    }  
    //覆盖方法  
    @Override  
    public String toString() {  
        return this.code+"_"+this.desc;  
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
