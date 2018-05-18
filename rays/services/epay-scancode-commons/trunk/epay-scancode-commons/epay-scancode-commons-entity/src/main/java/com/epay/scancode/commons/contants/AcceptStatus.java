package com.epay.scancode.commons.contants;

public enum AcceptStatus {
	ACCEPT_STATUS_0("初始", "0"),
	ACCEPT_STATUS_1("成功", "1"),
	ACCEPT_STATUS_2("失败", "2"),
	ACCEPT_STATUS_3("上游审核中", "3"),
	ACCEPT_STATUS_4("上游审核拒绝", "4");
	// 成员变量  
    private String desc;  
    private String code;  
    
    // 构造方法  
    private AcceptStatus(String desc, String code) {  
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
