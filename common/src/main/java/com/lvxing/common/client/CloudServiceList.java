package com.lvxing.common.client;


import lombok.experimental.UtilityClass;

/**
 * 所有的feign
 * @author lvxing
 * @since 2019/5/4
 */
@UtilityClass
public class CloudServiceList {

    /**
     * 网关
     */
    public static final String CLOUD_GATEWAY = "gateway";

    /**
     * 用户模块
     */
    public static final String CLOUD_ADMIN = "admin";





    /**
     * 认证模块
     */
    public static final String CLOUD_AUTH = "auth";
}
