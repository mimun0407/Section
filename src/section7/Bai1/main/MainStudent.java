package section7.Bai1.main;

import section7.Bai1.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        int numberOfStudents = scanner.nextInt();
        ArrayList<Student> students = new ArrayList<>(numberOfStudents);
        for (int i = 0; i < numberOfStudents; i++) {
            Student student = new Student();
            student.input();
            student.info();
            students.add(student);
        }
        students.forEach(Student::info);
    }
}
