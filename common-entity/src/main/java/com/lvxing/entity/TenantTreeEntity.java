package com.lvxing.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author lvxing
 * @Description 租户树实体
 * @Date 2020/1/15
 */
@Data
@Accessors(chain = true)
public class TenantTreeEntity<T> extends TreeEntity<T> {

    @ApiModelProperty("租户ID")
    private Long tenantId;
}
