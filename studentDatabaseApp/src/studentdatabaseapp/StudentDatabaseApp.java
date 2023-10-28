package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // Ask how many new students we want to add
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of new students to enroll: ");
        int numberOfStudents = scanner.nextInt();

        Student[] students = new Student[numberOfStudents];

        // Create n number of new Students
        for (int n = 0; n < numberOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for (int n = 0; n < numberOfStudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}
