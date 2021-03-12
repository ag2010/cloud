package com.lvxing.common.data.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lvxing.common.data.util.ObjUtil;
import com.lvxing.entity.BaseEntity;


/**
 * @Author lvxing
 * @Description 封装ServiceImpl
 * @Date 2019/10/11
 */
public class BaseService<M extends BaseMapper<T>, T extends BaseEntity> extends ServiceImpl<M, T> implements IProService<T> {

    @Override
    public boolean save(T entity) {
        ObjUtil.preInsert(entity);
        return super.save(entity);
    }

    @Override
    public boolean updateById(T entity) {
        ObjUtil.preUpdate(entity);
        return super.updateById(entity);
    }
}
