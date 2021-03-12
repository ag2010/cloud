package com.lvxing.admin.beans.dto;


import com.lvxing.admin.beans.dto.MenuDTO;
import com.lvxing.admin.beans.po.SysRole;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;


/**
 * @Author Aijm
 * @Description 角色的详细信息
 * @Date 2019/5/13
 */
@Data
@Accessors(chain = true)
public class RoleDTO extends SysRole {

    /**
     * 拥有菜单
     */
    private List<MenuDTO> menuList;



}
