package com.practice.aop.domain;

public class User {
    private String name;
    private String city;
    private String phn;

    public User(String name, String city, String phn) {
        this.name = name;
        this.city = city;
        this.phn = phn;
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

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }
}
