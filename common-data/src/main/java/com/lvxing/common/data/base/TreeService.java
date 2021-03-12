package com.lvxing.common.data.base;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lvxing.common.data.util.ObjUtil;
import com.lvxing.entity.TreeEntity;


/**
 * @Author lvxing
 * @Description 封装ServiceImpl
 * @Date 2019/10/11
 */
public class TreeService<M extends BaseMapper<T>, T extends TreeEntity> extends BaseService<M, T> implements IProService<T> {


    @Override
    public boolean save(T entity) {
        if (StrUtil.isBlank(entity.getParentIds())) {
            if (ObjUtil.ROOT_PID.equals(entity.getParentId())|| entity.getParentId() == null) {
                entity.setParentIds(ObjUtil.ROOT_PID+",");
                entity.setParentId(ObjUtil.ROOT_PID);
            } else {
                T t = baseMapper.selectById(entity.getParentId());
                entity.setParentIds(t.getParentIds()+t.getId()+",");
            }
        }
        return super.save(entity);
    }

}
