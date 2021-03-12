package com.lvxing.auth.service.impl;




import com.lvxing.auth.entity.SysUser;
import com.lvxing.auth.mapper.SysUserMapper;
import com.lvxing.auth.service.SysUserService;
import com.lvxing.common.data.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 用户表
 *   主要为了登录信息
 * @author lvxing
 * @date 2019-08-25 20:20:58
 */
@Service
public class SysUserServiceImpl extends BaseService<SysUserMapper, SysUser> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser loginByName(String loginName) {
        return sysUserMapper.loginByName(loginName);
    }

    @Override
    public SysUser loginByPhone(String mobile) {
        return sysUserMapper.loginByPhone(mobile);
    }

    /**
     * QQ 登录
     *
     * @param qqOpenid
     * @return
     */
    @Override
    public SysUser loginByQQ(String qqOpenid) {
        return sysUserMapper.loginByQQ(qqOpenid);
    }

    /**
     * 微信登录
     *
     * @param wxOpenid
     * @return
     */
    @Override
    public SysUser loginByWX(String wxOpenid) {
        return sysUserMapper.loginByWX(wxOpenid);
    }


}
