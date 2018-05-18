package com.epay.scancode.commons.contants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 支付方式转换（费率中支付方式转换成接口支付方式） */
public enum TransformPayType {
	
	PAYTYPE_ZFB("zfb", "ZFBSMZF"),
	PAYTYPE_WX_GZH("wechat", "WXGZHZF"),
	PAYTYPE_WX_SM("wechat", "WXSMZF");
	
	/** 枚举值 */
	private String value;
	/** 描述 */
	private String desc;

	private TransformPayType(String desc, String value) {
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
	
	public static TransformPayType getEnum(String value){
		TransformPayType resultEnum = null;
		TransformPayType[] enumAry = TransformPayType.values();
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
		TransformPayType[] ary = TransformPayType.values();
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
		TransformPayType[] ary = TransformPayType.values();
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
	
	public static Map<Object,Object> ValueToDescMap() {
		TransformPayType[] ary = TransformPayType.values();
		Map<Object,Object> enumMap = new HashMap<Object,Object>();
		for (int num = 0; num < ary.length; num++) {
			enumMap.put( String.valueOf(ary[num].getValue()),ary[num].getDesc());
		}
		return enumMap;
	}
	
	public static Map<Object,Object> DescToValueMap() {
		TransformPayType[] ary = TransformPayType.values();
		Map<Object,Object> enumMap = new HashMap<Object,Object>();
		for (int num = 0; num < ary.length; num++) {
			enumMap.put( ary[num].getDesc(),String.valueOf(ary[num].getValue()));
		}
		return enumMap;
	}
	
}
