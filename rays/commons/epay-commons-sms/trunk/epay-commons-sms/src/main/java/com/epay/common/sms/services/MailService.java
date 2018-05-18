package com.epay.common.sms.services;

import com.epay.common.sms.mailentity.MailEntity;

public interface MailService {

	/**
	 * 发送邮件
	 * @param mailEntity
	 * @return
	 * @throws Exception
	 */
	public boolean sendMail(MailEntity mailEntity)throws Exception;
}
