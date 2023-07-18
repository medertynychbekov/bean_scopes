package org.example.config;

import org.example.model.Passport;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "org.example.model")
public class ContainerConfig {

    @Value("${user1.id}")
    private int id;
    @Value("${user1.name}")
    private String name;
    @Value("${user1.last_name}")
    private String lastName;
    @Value("${user1.age}")
    private int age;

//    @Bean("manual_created_user")
//    @Scope("prototype")
//    public User get() {
//        User user = new User();
//        user.setId(id);
//        user.setName(name);
//        user.setLastName(lastName);
//        user.setAge(age);
//        return user;
//    }

    @Bean("get_passport")
    public Passport getPassport() {
        return new Passport(1, "passport", 445566);
    }

    @Bean("GET")
    public Passport getNewPassport() {
        return new Passport(2, "PASSPORT", 778899);
    }

}
