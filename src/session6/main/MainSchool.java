package session6.main;

import section5.bai2.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so truong muon tao");
        int number = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 0; i < number; i++) {
            Student student = new Student();
            student.input();
            students.add(student);
        }

        students.forEach(student -> student.info(student));
        System.out.println("Nhap nguoi ban muon tim");
        String str=scanner.nextLine();
        students.stream().filter(student -> student.getName().equals(str)).forEach(student -> student.info(student));
    }
}
