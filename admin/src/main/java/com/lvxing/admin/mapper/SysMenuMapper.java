package com.lvxing.admin.mapper;


import com.lvxing.admin.beans.po.SysMenu;
import com.lvxing.common.data.base.TreeMapper;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author lvxing
 * @since 2019-05-13
 */
public interface SysMenuMapper extends TreeMapper<SysMenu> {


    /**
     *  根据用户id获取到用户的菜单
     * @param userId
     * @return
     */
    List<SysMenu> findByUserId(Long userId);

}
