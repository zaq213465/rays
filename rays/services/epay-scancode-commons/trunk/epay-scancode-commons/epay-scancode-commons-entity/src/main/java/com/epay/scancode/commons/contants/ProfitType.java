package com.epay.scancode.commons.contants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author liushuyu
 * Desc 分润类别
 */
public enum ProfitType {
	PROFITTYPE_TXJEFR("提现金额分润", "01"),
	PROFITTYPE_JYJEFR("交易金额分润", "02"),
	PROFITTYPE_TXCSFR("提现次数分润", "03"),
	PROFITTYPE_T1JSFR("T1结算分润", "04");
	// 成员变量  
    private String desc;  
    private String code;  
    
    // 构造方法  
    private ProfitType(String desc, String code) {  
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
		ProfitType[] type = ProfitType.values();
		for (ProfitType profitType : type) {
			map.put(profitType.getCode(), profitType.getDesc());
		}
		return map;
	}
	
}
