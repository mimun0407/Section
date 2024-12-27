package section7.Bai1.main;

import section7.Bai1.model.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTeacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter teacher's number: ");
        int number=scanner.nextInt();
        ArrayList<Teacher> teachers = new ArrayList<>(number);
        for (int i = 0; i < number; i++) {
           Teacher teacher = new Teacher();
           teacher.input();
           teachers.add(teacher);
       }
       teachers.forEach(Teacher::info);
    }
}
