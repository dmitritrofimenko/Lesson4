package com.trofimekod.lesson4.task1;

/**
 * Created by USR on 28.07.2015.
 */
public class Student extends Human {
    private long idStudent;

    public Student(String name, String lastName, int age, boolean sex, long idStudent) {
        super(name, lastName, age, sex);
        this.idStudent=idStudent;
    }

    public long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(long idStudent) {
        this.idStudent = idStudent;
    }



    @Override
    public void printInfo() {
        super.printInfo();
    }
}
