package com.sda.mvc;

public class App {
    public static void main(String[] args) {

        Student student = new Student("John", "Kowalsky", "123456");

        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(studentView, student);

        studentController.updateView();
        studentController.setStudentName("Bob");
        studentController.updateView();
    }

}
