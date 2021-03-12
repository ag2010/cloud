package com.lvxing.common.oauth.properties;

import lombok.Data;

import java.io.Serializable;

/**
 * 默认表单登录使用 clientId和clientSecret
 * @author lvxing
 * @since 2019/10/20
 */
@Data
public class ClientProps implements Serializable {

    private static final long serialVersionUID = 1L;

    String clientId;

    String clientSecret;
}
