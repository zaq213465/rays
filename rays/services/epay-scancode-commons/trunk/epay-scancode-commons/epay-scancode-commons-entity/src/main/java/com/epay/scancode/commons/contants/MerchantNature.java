package com.epay.scancode.commons.contants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 商户性质 */
public enum MerchantNature {
	
	MERCHANT_NATURE_GY("国有企业","1"),
	MERCHANT_NATURE_SZ("三资企业","2"),
	MERCHANT_NATURE_SY("私营企业","3"),
	MERCHANT_NATURE_JT("集体企业","4");
	
	/** 枚举值 */
	private String value;
	/** 描述 */
	private String desc;

	private MerchantNature(String desc, String value) {
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
	
	public static MerchantNature getEnum(String value){
		MerchantNature resultEnum = null;
		MerchantNature[] enumAry = MerchantNature.values();
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
		MerchantNature[] ary = MerchantNature.values();
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
		MerchantNature[] ary = MerchantNature.values();
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
		MerchantNature[] ary = MerchantNature.values();
		Map<Object,Object> enumMap = new HashMap<Object,Object>();
		for (int num = 0; num < ary.length; num++) {
			enumMap.put( String.valueOf(ary[num].getValue()),ary[num].getDesc());
		}
		return enumMap;
	}
	
}
