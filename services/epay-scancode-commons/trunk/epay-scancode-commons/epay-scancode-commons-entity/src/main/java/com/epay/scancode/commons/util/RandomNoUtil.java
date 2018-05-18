package com.epay.scancode.commons.util;

import java.util.Date;

import com.epay.commons.base.lang.Dates;

public class RandomNoUtil {
    /**
     * 生成随机号
     * 年月日时分秒+随机六位数字
     * @return
     */
	public static String getRandomNo(){
		StringBuffer sb = new StringBuffer();
		sb.append(Dates.format("yyyyMMddHHmmss", new Date()));
		for (int i = 0; i < 6; i++) {
			sb.append((int)(Math.random()*10));
		}
        return  sb.toString();
    }
}
