package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class User {
    @Value("${user.id}")
    private int id;
    @Value("${user.name}")
    private String name;
    @Value("${user.last_name}")
    private String lastName;

    @Value("${user.age}")
    private int age;

    private Passport passport;

    @PostConstruct
    public void method() {
        System.out.println("I'm in init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("I'm in destroy method");
    }


    public User(Passport passport) {
        this.passport = passport;
    }

    @Autowired
    @Qualifier("GET")
    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Passport getPassport() {
        return passport;
    }

    public User() {
    }

    public User(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", passport=" + passport +
                '}';
    }
}
