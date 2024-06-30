package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private final int number;
    private String firstName;
    private String lastName;
    private ArrayList<Integer> finishedTasks = new ArrayList<>();

    Student(int number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getNumber() {
        return number;
    }

    public void markTaskAsFinished(int taskNumber){
        finishedTasks.add(taskNumber);
    }

    public void printStudent() {
        System.out.printf("Student number: %d, First Name: %s, Last Name: %s. \n", number, firstName, lastName);
        for (int task : finishedTasks) {
            System.out.println("Task " + task + " is finished");
        }
    }
}
