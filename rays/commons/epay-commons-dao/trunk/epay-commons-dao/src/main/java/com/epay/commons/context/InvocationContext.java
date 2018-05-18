package com.epay.commons.context;

import com.epay.commons.entity.AppName;
import com.epay.commons.entity.UserAccount;

/**
 * 服务调用上下文信息类
 * 
 * ClassName: InvocationContext <br/>
 * date: 2014-2-13 下午05:03:12 <br/>
 * 
 * @author 谢军峰
 * @author Sam
 * @version
 * @since JDK 1.6
 */
public interface InvocationContext  extends Context {
	
	UserAccount getUserAccout();
	
	AppName getAppName();

}
