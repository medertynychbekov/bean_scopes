package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Passport {
    private int id;
    private String name;
    private int personalNumber;

    public Passport() {
    }

    public Passport(int id, String name, int personalNumber) {
        this.id = id;
        this.name = name;
        this.personalNumber = personalNumber;
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

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", personalNumber=" + personalNumber +
                '}';
    }
}
