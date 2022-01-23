package com.example.ssmpdemo.pojo;


import java.util.Date;

/**
 * @author dearm
 */
public class Book {
Integer id;
String name;
int age;
Date birthdate;

    public Book(int id, String name, Integer age, Date birthdate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthdate = birthdate;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthdate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
