package com.lvxing.admin.service.impl;


import com.lvxing.admin.mapper.SysAreaMapper;
import com.lvxing.admin.beans.po.SysArea;
import com.lvxing.admin.service.SysAreaService;
import com.lvxing.common.data.base.TreeService;
import org.springframework.stereotype.Service;

/**
 * 区域表
 *
 * @author lvxing
 * @date 2019-08-25 21:54:16
 */
@Service
public class SysAreaServiceImpl extends TreeService<SysAreaMapper, SysArea> implements SysAreaService {

}
