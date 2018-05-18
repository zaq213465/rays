package com.epay.scancode.commons.contants;

public enum PlatfromPassage {
	PASSAGE_CMBC("民生通道", "cmbc"),
	PASSAGE_WEBANK("微众通道", "webank"),
	PASSAGE_SWIFTPASS("威富通通道", "swiftpass"),
	PASSAGE_AWPAY("支付宝微信服务商通道", "awpay");
	// 成员变量  
    private String desc;  
    private String code;  
    
    // 构造方法  
    private PlatfromPassage(String desc, String code) {  
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
