package com.lvxing.admin.compoent;


import com.lvxing.admin.util.UserUtil;
import com.lvxing.common.data.user.SystemService;
import com.lvxing.common.security.util.SecurityUtil;
import org.springframework.stereotype.Service;

/**
 * @Author lvxing
 * @Description  提供datam模块使用 获取到用户的id
 *      data 对每个对象进行数据库插入或者更新时的操作
 * @Date 2019/9/4
 */
@Service
public class SystemServiceImpl implements SystemService {


    /**
     * 获取到登录用户的id 为了封装
     *
     * @return
     */
    @Override
    public Long getUserId() {
        return UserUtil.getUserId();
    }

    /**
     * 获取到用户的租户id集合
     *
     * @return
     */
    @Override
    public String getUserTenantIds() {
        if (UserUtil.hasAuthenticated()) {
            return SecurityUtil.getTenantIds();
        }
        return null;
    }
}
