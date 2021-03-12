package com.lvxing.admin.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import com.lvxing.admin.beans.dto.DictDTO;
import com.lvxing.admin.mapper.SysDictListMapper;
import com.lvxing.admin.mapper.SysDictMapper;
import com.lvxing.admin.mapper.SysDictTreeMapper;
import com.lvxing.admin.beans.po.SysDict;
import com.lvxing.admin.beans.po.SysDictList;
import com.lvxing.admin.beans.po.SysDictTree;
import com.lvxing.admin.service.SysDictService;
import com.lvxing.common.cache.annotation.CacheClear;
import com.lvxing.common.cache.constants.CacheScope;
import com.lvxing.common.data.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 字典表
 *
 * @author lvxing
 * @date 2019-09-05 16:53:21
 */
@Service
public class SysDictServiceImpl extends BaseService<SysDictMapper, SysDict> implements SysDictService {

    @Autowired
    private SysDictListMapper sysDictListMapper;
    @Autowired
    private SysDictTreeMapper sysDictTreeMapper;

    @Override
    @CacheClear(scope = CacheScope.DICT, key = "'*:'+"+"#sysDict.typeCode", pattern = true)
    public boolean removeByDict(SysDict sysDict) {
        if (DictDTO.DICT_LIST.equals(sysDict.getType())) {
            sysDictListMapper.delete(Wrappers.<SysDictList>query()
                    .lambda().eq(SysDictList::getTypeCode, sysDict.getTypeCode()));
        } else {
            sysDictTreeMapper.delete(Wrappers.<SysDictTree>query()
                    .lambda().eq(SysDictTree::getTypeCode, sysDict.getTypeCode()));
        }
        return super.removeById(sysDict.getId());
    }
}
