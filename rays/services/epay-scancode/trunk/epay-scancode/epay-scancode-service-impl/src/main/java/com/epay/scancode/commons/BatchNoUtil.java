package com.epay.scancode.commons;

import java.util.Date;

import com.epay.commons.base.lang.Dates;

public class BatchNoUtil {
    /**
     * 生成批次号
     * 年月日时分秒+随机六位数字
     * @return
     */
	public static String getBatchNo(){
		StringBuffer sb = new StringBuffer();
		sb.append(Dates.format("yyyyMMddHHmmss", new Date()));
		for (int i = 0; i < 6; i++) {
			sb.append((int)(Math.random()*10));
		}
        return  sb.toString();
    }
}
