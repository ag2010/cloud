package com.lvxing.auth.config;

import com.google.common.collect.Maps;
import com.lvxing.common.oauth.AdditionalToken;
import com.lvxing.common.oauth.security.SecurityUser;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 定制 TokenEnhancer
 * @author lvxing
 * @since 2019/5/15
 */
@Component
public class CustomTokenEnhancer implements TokenEnhancer {

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        SecurityUser user = (SecurityUser)authentication.getPrincipal();
        final Map<String, Object> additionalInfo = Maps.newHashMap();
        additionalInfo.put(AdditionalToken.MAKE_BY, AdditionalToken.MAKER);
        additionalInfo.put(AdditionalToken.USER_ID, user.getUserId());
        additionalInfo.put(AdditionalToken.USER_TYPE, user.getUserType());
        additionalInfo.put(AdditionalToken.USER_NAME, user.getName());
        additionalInfo.put(AdditionalToken.TENANT_IDS, user.getTenantIds());
        ((DefaultOAuth2AccessToken)accessToken).setAdditionalInformation(additionalInfo);
        return accessToken;
    }
}
