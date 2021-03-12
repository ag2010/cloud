package com.lvxing.common.oauth.validate.sms;

/**
 * The interface Sms code sender.
 * @author lvxing
 * @since 2019/5/26
 */
public interface SmsCodeSender {


	/**
	 * 发送短信接口
	 * @param mobile
	 * @param code
	 */
	void send(String mobile, String code);

}
