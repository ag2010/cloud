package com.lvxing.common.data.config;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * 配置 类
 * @author lvxing
 * @since 2019/7/22
 */
@Configuration
public class RestTemplateConfig {


    /**
     * RestTemplate的声明
     * @param builder
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
