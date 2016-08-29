package com.mycompany.webservername.server.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;

/**
 * Created by Artemie on 29.08.2016.
 */
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Swagger2DocumentationConfiguration swagger(){ return new Swagger2DocumentationConfiguration();}

}
