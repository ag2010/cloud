package com.lvxing.admin.service;

;

import com.lvxing.admin.beans.po.SysDictList;
import com.lvxing.common.data.base.IProService;

import java.util.List;

/**
 * 字典项list
 *
 * @author lvxing
 * @date 2019-09-05 19:52:37
 */
public interface SysDictListService extends IProService<SysDictList> {

    /**
     * 根据typecode 查询
     * @param typeCode
     * @return
     */
    List<SysDictList> getDictListByType(String typeCode);

    /**
     *  必须要有id 和 typeCode 因为要根据 typeCode
     *      清除缓存list
     * @param sysDictList
     * @return
     */
    boolean removeByDictList(SysDictList sysDictList);

}
