package section7.Bai1.model;

import java.util.Scanner;

public class Teacher extends Person {
    private int teacherId;
    private String teacherSubject;

    public Teacher() {
    }

    public Teacher(int teacherId, String teacherSubject) {
        this.teacherId = teacherId;
        this.teacherSubject = teacherSubject;
    }

    public Teacher(String name, int age, String gender, int teacherId, String teacherSubject) {
        super(name, age, gender);
        this.teacherId = teacherId;
        this.teacherSubject = teacherSubject;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }
    @Override
    public Teacher input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Teacher ID: ");
        this.teacherId = scanner.nextInt();
        System.out.println("Enter Teacher Subject: ");
        this.teacherSubject = scanner.next();
        return this;
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Teacher ID: " + this.teacherId);
        System.out.println("Teacher Subject: " + this.teacherSubject);
    }

}
