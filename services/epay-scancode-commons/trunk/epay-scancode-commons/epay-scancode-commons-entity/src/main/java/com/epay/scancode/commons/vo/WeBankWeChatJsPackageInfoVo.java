package com.epay.scancode.commons.vo;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 微信公众号支付
 * @author lemon
 *
 */
@SuppressWarnings("serial")
public class WeBankWeChatJsPackageInfoVo implements Serializable{
	private String appId;
	private String timeStamp;
	private String nonceStr;
	private String packageContent;
	private String signType;
	private String paySign;
	
	public String getAppId() {
		return appId;
	}



	public void setAppId(String appId) {
		this.appId = appId;
	}



	public String getTimeStamp() {
		return timeStamp;
	}



	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}



	public String getNonceStr() {
		return nonceStr;
	}



	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}



	public String getPackageContent() {
		return packageContent;
	}



	public void setPackageContent(String packageContent) {
		this.packageContent = packageContent;
	}



	public String getSignType() {
		return signType;
	}



	public void setSignType(String signType) {
		this.signType = signType;
	}



	public String getPaySign() {
		return paySign;
	}



	public void setPaySign(String paySign) {
		this.paySign = paySign;
	}



	public Map<String,String> toMap(){
        Map<String,String> map = new HashMap<String, String>();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            Object obj;
            try {
                obj = field.get(this);
                if(obj!=null && !"".equals(obj)){
                    map.put(field.getName(), String.valueOf(obj));
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }



	@Override
	public String toString() {
		return "WeBankWeChatJsPackageInfoVo [appId=" + appId + ", timeStamp=" + timeStamp + ", nonceStr=" + nonceStr
				+ ", packageContent=" + packageContent + ", signType=" + signType + ", paySign=" + paySign + "]";
	}
	
}
