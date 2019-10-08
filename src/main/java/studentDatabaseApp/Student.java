package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private String tuitionBalance;
    private int costOfCourse=600;
    private int id=1000;

    public Student() {
        System.out.println("ENTER STUDENT FIRST NAME: ");
        Scanner in = new Scanner(System.in);
        this.firstName = in.nextLine();
        System.out.println("ENTER STUDENT LAST NAME: ");
        this.lastName = in.nextLine();
        System.out.println("WHICH LEVEL YOU SELECT:\n O -->JUNIOR \n 1-->MID \n 2-->SENIOR: ");
        this.gradeYear = in.nextInt();
        System.out.println(this.firstName + " " + this.lastName + " "+ this.gradeYear);
        id++;
        setStudentID();
        System.out.println(this.studentID);
    }

    private void setStudentID(){
        this.studentID = gradeYear + "" + id;
    }

}
