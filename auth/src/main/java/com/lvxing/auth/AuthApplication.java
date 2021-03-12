package com.lvxing.auth;

import com.lvxing.common.cache.annotation.EnableZaCache;
import com.lvxing.common.data.annotation.EnableZaIbatis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZaIbatis
@EnableZaCache
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

}
