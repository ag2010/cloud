package com.lvxing.admin.beans.dto;


;
import com.lvxing.admin.beans.po.SysArea;
import com.lvxing.admin.beans.po.SysOffice;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author Aijm
 * @since 2019-05-04
 */
@Data
@Accessors(chain = true)
public class OfficeDTO extends SysOffice {

    /**
     * 归属区域
     */
    private SysArea area;

    /**
     * 主负责人
     */
    private com.lvxing.admin.beans.dto.UserDTO priPerson;

    /**
     * 主负责人
     */
    private com.lvxing.admin.beans.dto.UserDTO depPerson;
}
