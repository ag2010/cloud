package com.lvxing.common.cache.aspectj;


import com.lvxing.common.cache.annotation.Cache;
import com.lvxing.common.cache.base.BaseCacheAspect;
import com.lvxing.common.cache.constants.CacheKeys;
import com.lvxing.common.cache.redis.RedisDao;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * @Author lvxing
 * @Description 使用 aop 切面记录请求日志信息
 * @Date 2019/8/19
 */
@Aspect
@Component
@Slf4j
@Order(1)
public class CacheAspect extends BaseCacheAspect {

    @Autowired
    private RedisDao redisDao;


    @Around("@annotation(cache)")
    public Object interceptor(ProceedingJoinPoint point, Cache cache)
            throws Throwable {
        Object result = null;
        String key = getKey(point, cache.scope(), cache.key());
        try {
            result = redisDao.vGet(key);
            if (result != null) {
                // 表示命中缓存
                if (CacheKeys.EMPTY_OBJ.equals(result)) {
                    return null;
                }
                return  result;
            } else {
                // 表示没有命中缓存
                result = point.proceed();
                putCache(redisDao, result, key, cache.expire());
            }
        } catch (Exception e) {
            log.error("获取缓存失败：{}==>{}", key, e);
        }
        return result;
    }



}
