package com.boophee.baloo;

/**
 * Created by ashish on 5/4/17.
 */

public class User {
    String name;
    String sex;

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public User(String name) {
        this.name = name;
        this.sex = "MALE";
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
