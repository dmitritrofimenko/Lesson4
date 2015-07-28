package com.trofimekod.lesson4.task1;

/**
 * Created by USR on 28.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        Group group=new Group();


            group.addStudent(new Student("Ivan","Ivanov",20,true,123123));
            group.addStudent(new Student("Maria", "Petrova", 18, false, 155123));
            for (int i = 0; i <4 ; i++) {

                try {
                    group.addStudent(new Student("Maria","Petrova",18,false,1125123));
                } catch (fullGroupException e) {
                    e.getMessage();
                }

            }

        try {
            group.addStudent(new Student("Maria", "Komeleva", 18, false, 155123));
        } catch (fullGroupException e) {
            e.getMessage();
        }


            while (true){
                try {
                    group.addStudent(new Student("Maria","Infinity",18,false,1125123));
                } catch (fullGroupException e) {
                    e.getMessage();
                    break;
                }

        }

        group.printGroupInfo();

    }
}
