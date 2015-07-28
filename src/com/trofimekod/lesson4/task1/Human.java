package com.trofimekod.lesson4.task1;

/**
 * Created by USR on 28.07.2015.
 */
public class Human {
    private String name, lastName;
    private int age;
    private boolean sex;

    public Human(String name, String lastName, int age, boolean sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void printInfo(){
        System.out.println("name=" + this.getName()+ " lastName="+ " age=" + age+ "sex=" + sex);
    }
}
