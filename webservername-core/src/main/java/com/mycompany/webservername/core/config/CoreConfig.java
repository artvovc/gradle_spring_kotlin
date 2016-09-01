package com.mycompany.webservername.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Artemie on 30.08.2016.
 */
@Configuration
@ComponentScan(basePackages = {"com.mycompany.webservername.core.service"})
public class CoreConfig {
}
