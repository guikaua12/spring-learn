package me.approximations.beansByType;

import me.approximations.beansByType.beans.MyBean;
import me.approximations.beansByType.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            final MyBean b1 = context.getBean(MyBean.class);
            System.out.println(b1.getText()); // Hello
        }
    }
}