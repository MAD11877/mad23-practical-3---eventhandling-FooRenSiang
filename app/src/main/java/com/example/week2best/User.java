package com.example.week2best;

public class User {
    String name;
    String description;
    int id;
    boolean followed = false;
    public User(String name,String description,int id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }
}
