package section7.Bai1.model;

import java.util.Scanner;

public class Student extends Person {
    private int StudentId;
    private String course;

    public Student() {
    }

    public Student(int studentId, String course) {
        StudentId = studentId;
        this.course = course;
    }

    public Student(String name, int age, String gender, int studentId, String course) {
        super(name, age, gender);
        StudentId = studentId;
        this.course = course;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public Student input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student ID: ");
        setStudentId(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Course: ");
        setCourse(scanner.nextLine());
        return this;
    }
    @Override
    public void info( ){
        super.info();
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Course: " + getCourse());
    }
}
