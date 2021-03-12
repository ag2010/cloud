package com.lvxing.admin.service.impl;


import com.lvxing.admin.mapper.SysOfficeMapper;
import com.lvxing.admin.beans.po.SysOffice;
import com.lvxing.admin.service.SysOfficeService;
import com.lvxing.common.cache.annotation.Cache;
import com.lvxing.common.cache.annotation.CacheClear;
import com.lvxing.common.cache.annotation.CacheConf;
import com.lvxing.common.cache.constants.CacheScope;
import com.lvxing.common.data.base.TreeService;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * 机构表
 *
 * @author lvxing
 * @date 2019-08-25 20:45:42
 */
@Service
@CacheConf(scope = CacheScope.OFFICE)
public class SysOfficeServiceImpl extends TreeService<SysOfficeMapper, SysOffice> implements SysOfficeService {


    @Override
    @Cache(key = "#id")
    public SysOffice getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    @CacheClear(key = "#id")
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    @Override
    @CacheClear(key = "#entity.id")
    public boolean updateById(SysOffice entity) {
        return super.updateById(entity);
    }
}
