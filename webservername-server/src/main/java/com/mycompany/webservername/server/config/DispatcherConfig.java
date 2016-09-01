package com.mycompany.webservername.server.config;

import com.mycompany.webservername.core.config.CoreConfig;
import com.mycompany.webservername.db.config.HibernateConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Artemie on 26.08.2016.
 */
@Configuration
@ComponentScan(basePackages = {
        "com.mycompany.webservername.server.controller",
        "com.mycompany.webservername.server.facade"})
@Import( {AppContextConfig.class, SwaggerConfig.class, CoreConfig.class, HibernateConfig.class})
@EnableWebMvc
public class DispatcherConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
