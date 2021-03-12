package com.lvxing.common.security.annotation;




import com.lvxing.common.security.config.AutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * security配置
 * @author lvxing
 * @since 2019/8/27
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({AutoConfiguration.class})
public @interface EnableZaSecurtity {
}
