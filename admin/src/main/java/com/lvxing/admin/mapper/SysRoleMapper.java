package com.lvxing.admin.mapper;



import com.lvxing.admin.beans.dto.RoleDTO;
import com.lvxing.admin.beans.po.SysRole;
import com.lvxing.admin.beans.po.SysUser;
import com.lvxing.common.data.base.ProMapper;

import java.util.List;

/**
 * 角色表
 *
 * @author lvxing
 * @date 2019-08-25 20:57:31
 */
public interface SysRoleMapper extends ProMapper<SysRole> {


    /**
     * 根据id 获取 拥有的菜单
     * @param roleId
     * @return
     */
    RoleDTO get(Long roleId);


    /**
     * 根据用户 查询拥有的角色信息
     * @param sysUser
     * @return
     */
    List<RoleDTO> findList(SysUser sysUser);



}
