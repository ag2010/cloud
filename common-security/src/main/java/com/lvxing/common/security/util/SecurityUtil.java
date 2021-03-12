package com.lvxing.common.security.util;


import com.lvxing.common.security.component.SecurityUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @Author lvxing
 * @Description 根据SecurityContext 获取信息
 * @Date 2020/3/26
 */
public class SecurityUtil {

    /**
     * 获取SecurityUser
     * @return
     */
    public static SecurityUser getSecurityUser() {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();
        return (SecurityUser)authentication.getPrincipal();
    }

    /**
     * 判断该用户是否登录
     * @return
     */
    public static boolean hasAuthenticated() {
        return SecurityContextHolder.getContext().getAuthentication().isAuthenticated();
    }


    /**
     * 获取登录用户的信息
     * @return
     */
    public static Long getUserId(){
        return getSecurityUser().getUserId();
    }


    /**
     * 获取登录用户的管理租户信息,多个租户 第一个为本身租户
     * @return
     */
    public static String getTenantIds(){
        return getSecurityUser().getTenantIds();
    }
    /**
     * 获取登录用户的信息 登录名
     * @return
     */
    public static String getUserName(){
        return getSecurityUser().getUsername();
    }
}
