package com.epay.scancode.commons.contants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum OrderPayCode {
	PAYCODE_ZFBSMZF("支付宝扫码支付", "ZFBSMZF"),
	PAYCODE_WXSMZF("微信扫码支付", "WXSMZF"),
	PAYCODE_WXGZHZF("微信公众号支付", "WXGZHZF"),
	PAYCODE_QQZF("QQ支付", "QQZF");
	// 成员变量  
    private String desc;  
    private String code;  
    
    // 构造方法  
    private OrderPayCode(String desc, String code) {  
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
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List toList(){
		OrderPayCode[] ary = OrderPayCode.values();
		List list = new ArrayList();
		for(int i=0;i<ary.length;i++){
			Map<String,String> map = new HashMap<String,String>();
			map.put("code",String.valueOf(ary[i].getCode()));
			map.put("desc", ary[i].getDesc());
			list.add(map);
		}
		return list;
	}
	
	public static Map<String,String> toMap(){
		Map<String,String> map =new HashMap<>();
		OrderPayCode[] code = OrderPayCode.values();
		for (OrderPayCode payCode : code) {
			map.put(payCode.getCode(), payCode.getDesc());
		}
		return map;
	}
	
}
