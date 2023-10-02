package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int collegeYear;
    private String studentID;
    private String courses = "";
    private int tutionBalance = 0;
    private static int costOfCourse = 1200;
    private static int id = 1000;

    // Constructor prompts user to enter Student's name and year
    public Student() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student First Name : ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter Student Last Name : ");
        this.lastName = scanner.nextLine();

        System.out.print("1 - First Year\n2 - Second Year\n3 - Third Year%\n4 - Fourth Year\nEnter the year student is currently in : ");
        this.collegeYear = scanner.nextInt();

        setStudentID();

    }

    // Generate an ID
    public void setStudentID() {
        // Grade Year + ID
        id++;
        this.studentID = collegeYear + "" + id;
    }

    // Enroll in Courses
    public void enroll() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a course to enroll (Q to quit): ");
            String course = scanner.nextLine();

            if (!(course.equals("Q"))) {
                courses = courses + "\n " + course;
                tutionBalance = tutionBalance + costOfCourse;
            } else { break; }
        } while (1 != 0);


    }

    // View Balance
    public void viewBalance() {
        System.out.println("Your balance is : Rs." + tutionBalance);
    }

    // Pay tuition
    public void payTuition() {
        viewBalance();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your payment : Rs.");
        int payment = scanner.nextInt();

        tutionBalance = tutionBalance - payment;
        viewBalance();
    }

    // Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nCurrent Year: " + collegeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: Rs." + tutionBalance;
    }
}


