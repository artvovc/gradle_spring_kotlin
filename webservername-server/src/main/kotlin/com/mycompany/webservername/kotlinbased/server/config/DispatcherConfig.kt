package com.mycompany.webservername.kotlinbased.server.config


import org.springframework.context.annotation.ComponentScan

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

/**
 * Created by Artemie on 26.08.2016.
 */

@Configuration
@ComponentScan(basePackages = arrayOf("com.mycompany.webservername.kotlinbased.server.controller"))
@Import(SwaggerConfig::class)
@EnableWebMvc
open class DispatcherConfig : WebMvcConfigurerAdapter() {

    override fun addResourceHandlers(registry: ResourceHandlerRegistry?) {
        registry!!.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/")
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/")
    }

}
