package com.mrigor.voting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EntityScan(
        basePackageClasses = {VotingApplication.class, Jsr310JpaConverters.class}
)

@SpringBootApplication
@EnableSwagger2
@EnableWebSecurity
public class VotingApplication {

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("menu", "restaurant");
    }




    public static void main(String[] args) {
        SpringApplication.run(VotingApplication.class, args);
    }
}
