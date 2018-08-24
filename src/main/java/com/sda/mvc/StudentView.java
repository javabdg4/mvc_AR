package com.sda.mvc;

public class StudentView {

    public void printStudent(Student student){
        System.out.println("Name: " + student.getName() + "\nLastname: " + student.getLastName() + "\nIndex: " + student.getIndexNumber());
    }
}
