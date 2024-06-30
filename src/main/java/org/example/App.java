package org.example;

public class App 
{
    // Dummy data
    static String[] studentFirstNames = new String[] {"Bob", "John", "Sara", "Michael", "Jessica"};
    static String[] studentLastNames = new String[] {"White", "Doe", "Reed", "Daniels", "Howard"};

    public static void main( String[] args ) {

        //Initialize StudentGroup class with a groupLeader
        Student groupLeader = new Student(1, studentFirstNames[0], studentLastNames[0]);
        StudentGroup group = new StudentGroup(groupLeader);
        group.addStudent(groupLeader);

        // Just to make an example, student 2 will have task 2 completed, student 3 - 3, etc.
        for (int i = 2; i <= 5; i++) {
            Student student = new Student(i, studentFirstNames[i-1], studentLastNames[i-1]);
            group.addStudent(student);
            group.addTask("Task " + i);
            group.markTaskAsFinished(i, i);
        }

        System.out.println("-------------------------------");
        System.out.println("Current group list: ");
        group.printStudentList();
        System.out.println("-------------------------------");

        System.out.println("Current Group Leader: ");
        group.getGroupLeader().printStudent();
        System.out.println("-------------------------------");

        // Change leader
        group.changeGroupLeader(3);
        System.out.println("New Group Leader: ");
        group.getGroupLeader().printStudent();
        System.out.println("-------------------------------");

        // Remove Students
        group.removeStudent(1);
        group.removeStudent(5);
        System.out.println("New Group list, after student 1 and 5 were removed: ");
        group.printStudentList();
        System.out.println("-------------------------------");

    }
}
