package com.lvxing.admin;

import com.lvxing.common.cache.annotation.EnableZaCache;
import com.lvxing.common.data.annotation.EnableZaIbatis;
import com.lvxing.common.security.annotation.EnableZaSecurtity;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
@EnableZaSecurtity
@EnableZaIbatis
@EnableZaCache
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
