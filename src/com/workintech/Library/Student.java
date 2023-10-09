package com.workintech.Library;

public class Student extends Library {

    @Override
    public String toString() {
        return  getClass().getSimpleName()  +" List :" + userList;
    }
}
