package com.trofimekod.lesson4.task1;

import java.util.Random;

/**
 * Created by USR on 28.07.2015.
 */
public class Group {
    private Student[] students=new Student[10];

    public void addStudent(Student student) throws fullGroupException {

        for (int i = 0; true; i++) {
            try{
                if (students[i] == null) {
                    students[i] = student;
                    break;

                }
            }
            catch (ArrayIndexOutOfBoundsException e){

                throw new fullGroupException();
            }
        }

    }
    public void printGroupInfo(){
        for (int i = 0; i <students.length ; i++) {
            if (students[i]!=null)         System.out.println(i+1 +"student: "  + students[i].getIdStudent()+ " "+students[i].getLastName() );

        }
    }

}
