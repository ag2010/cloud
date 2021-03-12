package com.lvxing.common.data.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lvxing.entity.BaseEntity;


/**
 * @Author lvxing
 * @Description 接口baseMapper
 * @Date 2019/10/12
 */
public interface ProMapper<T extends BaseEntity> extends BaseMapper<T> {

}
