package com.example.demo.model;

public class College {

    String name;
    String city;
    String university;

    public College(String name, String city, String university) {
        this.name = name;
        this.city = city;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
