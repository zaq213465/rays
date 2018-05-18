package com.epay.scancode.commons.contants;

/**
 * 上游审核返回状态
 * 000000：审核通过 1：待审核，2：审核中，3：审核失败
 * @author Administrator
 *
 */
public enum MerchantAudit {
	MERCHANT_AUDIT_0("审核通过", "000000"),
	MERCHANT_AUDIT_1("待审核", "1"),
	MERCHANT_AUDIT_2("审核中", "2"),
	MERCHANT_AUDIT_3("审核失败", "3");
	// 成员变量  
    private String desc;  
    private String code;  
    
    // 构造方法  
    private MerchantAudit(String desc, String code) {  
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
