package org.example;

import org.example.config.ContainerConfig;
import org.example.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ContainerConfig.class);

        User user = context.getBean("user", User.class);

        User newUser = context.getBean("user", User.class);

//        User manualUser = context.getBean("manual_created_user", User.class);
//        User newManualUser = context.getBean("manual_created_user", User.class);

        System.out.println("USER: " + user);
        System.out.println("NEW USER: " + newUser);
    }
}
