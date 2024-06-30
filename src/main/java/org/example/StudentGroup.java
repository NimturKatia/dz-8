package org.example;

import java.util.HashMap;

public class StudentGroup {
    private Student groupLeader;
    private final HashMap<Integer, Student> students = new HashMap<>();
    private final HashMap<Integer, String> tasks = new HashMap<>();

    StudentGroup(Student groupLeader){
        this.groupLeader = groupLeader;
    }

    public Student getGroupLeader() {
        return groupLeader;
    }

    public void changeGroupLeader(int studentId){
        this.groupLeader = students.get(studentId);
    }

    public void addStudent(Student student){
        students.put(student.getNumber(), student);
    }

    public void removeStudent(int studentId){
        students.remove(studentId);
    }

    public void addTask(String task){
        int taskNumber = tasks.size() + 1;
        tasks.put(taskNumber, task);
    }

    public void markTaskAsFinished(int taskNumber, int studentId){
        students.get(studentId).markTaskAsFinished(taskNumber);
    }

    public void printStudentList() {
        for (int key: students.keySet()) {
            students.get(key).printStudent();
        }
    }

    public void printTaskList() {
        for (int key: tasks.keySet()) {
            System.out.println(key + ". " + tasks.get(key));
        }
    }
}
