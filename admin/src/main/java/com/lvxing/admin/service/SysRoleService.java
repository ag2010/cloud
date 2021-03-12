package com.lvxing.admin.service;



import com.lvxing.admin.beans.dto.RoleDTO;
import com.lvxing.admin.beans.po.SysRole;
import com.lvxing.admin.beans.po.SysUser;
import com.lvxing.common.data.base.IProService;

import java.util.List;

/**
 * 角色表
 *
 * @author lvxing
 * @date 2019-08-25 20:57:31
 */
public interface SysRoleService extends IProService<SysRole> {

    /**
     * 根据用户 查询拥有的角色信息
     * @param sysUser
     * @return
     */
    List<RoleDTO> findList(SysUser sysUser);

    /**
     * 更新角色信息
     * @param roleDTO
     * @return
     */
    boolean updateByRole(RoleDTO roleDTO);

    /**
     * 保存角色信息
     * @param roleDTO
     * @return
     */
    boolean saveRoleDTO(RoleDTO roleDTO);

    /**
     * 根据角色id 删除角色
     * @param id
     * @return
     */
    boolean removeRoleById(Long id);

}
