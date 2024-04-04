package me.approximations.beansByName;

import me.approximations.beansByName.beans.MyBean;
import me.approximations.beansByName.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            final MyBean b1 = context.getBean("bean1", MyBean.class);
            final MyBean b2 = context.getBean("bean2", MyBean.class);
            System.out.println(b1.getText()); // Hello
            System.out.println(b2.getText()); // World
        }
    }
}