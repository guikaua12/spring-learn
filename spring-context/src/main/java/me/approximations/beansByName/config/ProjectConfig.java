package me.approximations.beansByName.config;

import me.approximations.beansByName.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean("bean1")
    public MyBean myBean1() {
        return new MyBean("Hello");
    }

    @Bean("bean2")
    public MyBean myBean2() {
        return new MyBean("World");
    }
}
