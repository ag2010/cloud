package com.lvxing.admin.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import com.google.common.collect.Lists;
import com.lvxing.admin.mapper.SysDictTreeMapper;
import com.lvxing.admin.beans.po.SysDictTree;
import com.lvxing.admin.service.SysDictTreeService;
import com.lvxing.common.cache.annotation.Cache;
import com.lvxing.common.cache.annotation.CacheClear;
import com.lvxing.common.cache.annotation.CacheConf;
import com.lvxing.common.cache.constants.CacheScope;
import com.lvxing.common.data.base.TreeService;
import com.lvxing.common.data.util.ObjUtil;
import com.lvxing.common.data.util.TreeUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典表树
 *
 * @author lvxing
 * @date 2019-09-05 20:00:25
 */
@Service
@CacheConf(scope = CacheScope.DICT_TREE)
public class SysDictTreeServiceImpl extends TreeService<SysDictTreeMapper, SysDictTree> implements SysDictTreeService {



    @Override
    @Cache(key = "#typeCode", expire = 0)
    public List<SysDictTree> getDicTreeByType(String typeCode) {
        List<SysDictTree> list = super.list(Wrappers.<SysDictTree>query()
                .lambda().eq(SysDictTree::getTypeCode, typeCode)
                .orderByAsc(SysDictTree::getSort));
        // 处理字典树类型的规则排序
        List<SysDictTree> tree = Lists.newArrayList();
        TreeUtil.sortList(tree, list, ObjUtil.ROOT_PID, true);
        return tree;
    }

    @Override
    @CacheClear(key = "#entity.typeCode")
    public boolean save(SysDictTree entity) {
        return super.save(entity);
    }

    @Override
    @CacheClear(key = "#entity.typeCode")
    public boolean updateById(SysDictTree entity) {
        return super.updateById(entity);
    }

    @Override
    @CacheClear(key = "#sysDictTree.typeCode")
    public boolean removeByDictTree(SysDictTree sysDictTree) {
        return super.removeById(sysDictTree.getId());
    }

}
