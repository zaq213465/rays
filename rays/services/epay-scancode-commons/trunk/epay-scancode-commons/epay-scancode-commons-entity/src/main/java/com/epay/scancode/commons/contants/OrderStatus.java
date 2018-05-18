package com.epay.scancode.commons.contants;

public enum OrderStatus {
	ORDER_CREATE("订单创建", "00"),
	ORDER_PAYING("支付中", "01"),
	ORDER_SUCCESS("交易成功", "02"),
	ORDER_FAIL("交易失败", "03"),
	ORDER_REFUND("已退款", "04"),
	ORDER_REVOKE("已撤销", "05");
	// 成员变量  
    private String desc;  
    private String code;  
    
    // 构造方法  
    private OrderStatus(String desc, String code) {  
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
