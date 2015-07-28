package com.trofimekod.lesson4.task1;

/**
 * Created by USR on 28.07.2015.
 */
public class fullGroupException extends ArrayIndexOutOfBoundsException {

//    @Override
    public String getMessage() {
        System.out.println("Group is full");
        return "Group is full";
    }

    @Override
    public String toString() {
        return "Group is full";
    }
}
