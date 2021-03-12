package com.lvxing.admin.service;


import com.lvxing.admin.beans.po.SysDict;
import com.lvxing.common.data.base.IProService;

/**
 * 字典表
 *
 * @author lvxing
 * @date 2019-09-05 16:53:21
 */
public interface SysDictService extends IProService<SysDict> {

    /**
     *  必须要有id 和 typeCode 因为要根据 typeCode
     *      清除缓存tree 或者list
     * @param sysDict
     * @return
     */
    boolean removeByDict(SysDict sysDict);
}
