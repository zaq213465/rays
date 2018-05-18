package com.epay.scancode.commons.contants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 商户模式 */
public enum RegisterType {
	
	IDTYPE_MERCHANT("大商户模式","1"),
	IDTYPE_CODE("一户一码模式","2");
	
	/** 枚举值 */
	private String value;
	/** 描述 */
	private String desc;

	private RegisterType(String desc, String value) {
		this.value = value;
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public static RegisterType getEnum(String value){
		RegisterType resultEnum = null;
		RegisterType[] enumAry = RegisterType.values();
		for(int i = 0;i<enumAry.length;i++){
			if(enumAry[i].getValue() == value){
				resultEnum = enumAry[i];
				break;
			}
		}
		return resultEnum;
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List toList(){
		RegisterType[] ary = RegisterType.values();
		List list = new ArrayList();
		for(int i=0;i<ary.length;i++){
			Map<String,String> map = new HashMap<String,String>();
			map.put("value",String.valueOf(ary[i].getValue()));
			map.put("desc", ary[i].getDesc());
			list.add(map);
		}
		return list;
	}
	
	public static Map<String, Map<String, Object>> toMap() {
		RegisterType[] ary = RegisterType.values();
		Map<String, Map<String, Object>> enumMap = new HashMap<String, Map<String, Object>>();
		for (int num = 0; num < ary.length; num++) {
			Map<String, Object> map = new HashMap<String, Object>();
			String key = String.valueOf(getEnum(ary[num].getValue()));
			map.put("value", String.valueOf(ary[num].getValue()));
			map.put("desc", ary[num].getDesc());
			enumMap.put(key,map);
		}
		return enumMap;
	}
	
	public static Map<Object,Object> ValueTodescMap() {
		RegisterType[] ary = RegisterType.values();
		Map<Object,Object> enumMap = new HashMap<Object,Object>();
		for (int num = 0; num < ary.length; num++) {
			enumMap.put( String.valueOf(ary[num].getValue()),ary[num].getDesc());
		}
		return enumMap;
	}
	
}
