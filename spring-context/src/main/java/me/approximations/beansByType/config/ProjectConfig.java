package me.approximations.beansByType.config;

import me.approximations.beansByType.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public MyBean myBean1() {
        return new MyBean("Hello");
    }
}
