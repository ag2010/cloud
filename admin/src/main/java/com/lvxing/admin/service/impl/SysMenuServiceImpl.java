package com.lvxing.admin.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.lvxing.admin.mapper.SysMenuMapper;
import com.lvxing.admin.beans.po.SysMenu;
import com.lvxing.admin.service.SysMenuService;
import com.lvxing.admin.util.UserUtil;
import com.lvxing.common.cache.annotation.Cache;
import com.lvxing.common.cache.annotation.CacheClear;
import com.lvxing.common.cache.constants.CacheScope;
import com.lvxing.common.data.base.TreeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author lvxing
 * @since 2019-05-13
 */
@Service
@AllArgsConstructor
public class SysMenuServiceImpl extends TreeService<SysMenuMapper, SysMenu> implements SysMenuService {


    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    @CacheClear(scope = CacheScope.USER_MENU, key = "'*'", pattern = true)
    public boolean updateById(SysMenu entity) {
        return super.updateById(entity);
    }

    @Override
    @CacheClear(scope = CacheScope.USER_MENU, key = "'*'", pattern = true)
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    @Override
    @Cache(scope = CacheScope.USER_MENU, key = "#userId")
    public List<SysMenu> findByUserId(Long userId) {
        if (UserUtil.hasAdmin(userId)) {
            return sysMenuMapper.selectList(Wrappers.<SysMenu>query()
                    .lambda().orderByAsc(SysMenu::getSort) );
        }
        return sysMenuMapper.findByUserId(userId);
    }

}
