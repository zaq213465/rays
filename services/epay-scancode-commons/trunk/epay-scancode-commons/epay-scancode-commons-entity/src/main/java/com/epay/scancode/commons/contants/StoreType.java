package com.epay.scancode.commons.contants;

public enum StoreType {
	STORE_TYPE_0("总店", "0"),
	STORE_TYPE_1("分店", "1");
	// 成员变量  
    private String desc;  
    private String code;  
    
    // 构造方法  
    private StoreType(String desc, String code) {  
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
