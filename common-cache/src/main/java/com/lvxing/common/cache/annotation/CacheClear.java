package com.lvxing.common.cache.annotation;




import com.lvxing.common.cache.constants.CacheScope;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 存储缓存
 * @author lvxing
 * @since 2019/8/27
 */
// 在运行时可以获取
@Retention(RetentionPolicy.RUNTIME)
// 作用到方法等
@Target(value = {ElementType.METHOD})
public @interface CacheClear {

    /**
     * 作用域
     *
     * @return
     * @author lvxing
     * @date 2019/8/27
     */
    public CacheScope scope() default CacheScope.APPLICATION;

    /**
     * 缓存key
     * @return
     */
    public String key() default "";

    /**
     * 缓存 pattern 清除
     * @return
     */
    public boolean pattern() default false;

}
