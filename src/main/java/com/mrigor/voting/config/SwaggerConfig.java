package com.mrigor.voting.config;


import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.BasicAuth;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;


/*import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;*/

/**
 * Created by Igor on 19.07.2017.
 */
@Configuration

public class SwaggerConfig {

   @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(or(PathSelectors.ant("/profile/**"),
                        PathSelectors.ant("/admin/**"))) // and by paths
                .build()
                    //   .securitySchemes(java.util.Collections.singletonList(new BasicAuth("basicAuth")))
;

    }



}