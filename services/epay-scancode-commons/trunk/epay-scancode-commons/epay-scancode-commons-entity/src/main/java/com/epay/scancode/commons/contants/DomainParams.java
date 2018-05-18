package com.epay.scancode.commons.contants;

public enum DomainParams {
	RETURNURL("returnUrl","wap." , "/scan/paymentResult"),
	BACKPUBLICCALLBACK("backPublicCallback","wap." , "/user/callback"),
	QRCODEPATH("qrcodePath","wap." , "/scan/operate"),
	HFEPAYAGENTQRPATH("hfepayAgentQrPath", "wap." ,"/agentScan/operate"),
	CAMERAURL("cameraUrl", "wap." ,"/scancode/camera"),
	PAYOPENIDCALLBACKURL("payOpenIdCallbackUrl", "wap." ,"/scan/payOpenIdCallbackUrl"),
	BINDCALLBACK("bindCallback", "wap." ,"/user/bindCallback");
	// 成员变量  
    private String value1;  
    private String value2;  
    private String value3;
    
    // 构造方法  
    private DomainParams(String value1, String value2, String value3) {
    	this.value1 = value1;
    	this.value2 = value2;
    	this.value3 = value3;
    }

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public String getValue3() {
		return value3;
	}

	public void setValue3(String value3) {
		this.value3 = value3;
	}  
    
}
