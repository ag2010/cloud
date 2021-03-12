package com.lvxing.auth.service;

import com.lvxing.common.cache.annotation.Cache;
import com.lvxing.common.cache.constants.CacheScope;
import org.springframework.security.oauth2.common.exceptions.InvalidClientException;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

/**
 * 实现mysql 管理数据库
 * @author lvxing
 * @since 2019/7/27
 */
@Service
public class ProJdbcClientDetailsService extends JdbcClientDetailsService {

    public ProJdbcClientDetailsService(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    @Cache( scope = CacheScope.AUTH_CLIENT,  key = "#clientId" , expire = 3600)
    public ClientDetails loadClientByClientId(String clientId) throws InvalidClientException {
        return super.loadClientByClientId(clientId);
    }
}
