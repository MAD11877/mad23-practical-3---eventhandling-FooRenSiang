package com.example.testweek2;

public class User {
    String name;
    String description;
    int id;
    boolean followed = true;
    public User(String name,String description,int id){
        this.name = name;
        this.description = description;
        this.id = id;
    }
}
