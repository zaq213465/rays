package com.epay.scancode.commons.contants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum PayCode {
	PAYCODE_ZFB("支付宝", "zfb"),
	PAYCODE_WECHAT("微信支付", "wechat"),
	PAYCODE_QQ("QQ支付", "qq");
	// 成员变量  
    private String desc;  
    private String code;  
    
    // 构造方法  
    private PayCode(String desc, String code) {  
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
	
	public static Map<String,String> toMap(){
		Map<String,String> map =new HashMap<>();
		PayCode[] code = PayCode.values();
		for (PayCode payCode : code) {
			map.put(payCode.getCode(), payCode.getDesc());
		}
		return map;
	}
	
	public static List<Map<String,String>> toList(){
		List<Map<String,String>> list = new ArrayList<>();
		PayCode[] arrs = PayCode.values();
		int length = arrs.length;
		for(int i = 0; i<length ; i++){
			Map<String,String> map =new HashMap<>();
			map.put("code", arrs[i].getCode());
			map.put("desc", arrs[i].getDesc());
			list.add(map);
		}
		return list;
	}
}
