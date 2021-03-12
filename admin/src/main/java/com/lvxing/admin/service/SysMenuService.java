package com.lvxing.admin.service;



import com.lvxing.admin.beans.po.SysMenu;
import com.lvxing.common.data.base.ITreeService;

import java.util.List;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author lvxing
 * @since 2019-05-13
 */
public interface SysMenuService extends ITreeService<SysMenu> {

    /**
     *  根据用户id获取到用户的菜单
     * @param userId
     * @return
     */
    List<SysMenu> findByUserId(Long userId);

}
