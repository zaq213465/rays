package com.epay.scancode.commons.contants;

public enum PassagePayType {

	PAYTYPE_ZFB("支付宝", "zfb"),
	PAYTYPE_WX("微信", "wechat"),
	PAYTYPE_QQ("QQ", "qqzf"),
	PAYTYPE_WX_FILE("微信对账通知","wechat_file");
	// 成员变量  
    private String desc;  
    private String code;  
    
    // 构造方法  
    private PassagePayType(String desc, String code) {  
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
