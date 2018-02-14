package com.mrigor.voting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(
		basePackageClasses = { VotingApplication.class, Jsr310JpaConverters.class }
)

@SpringBootApplication
@EnableCaching
public class VotingApplication {

	@Bean
	public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager("menu","restaurant");
	}


	public static void main(String[] args) {
		SpringApplication.run(VotingApplication.class, args);
	}
}
