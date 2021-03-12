package com.lvxing.common.oauth.properties;

import lombok.Data;

/**
 * @Author lvxing
 * @Description email 属性
 * @Date 2019/5/20
 */
@Data
public class EmailCodeProps {

	/**
	 * 过期时间
	 */
	private int expireIn = 60 * 60 * 24;
	/**
	 * 要拦截的url，多个url用逗号隔开，ant pattern
	 */
	private String url;

}
