package section7.Bai1.model;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {}

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public Person input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter age: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter gender: ");
        this.gender = scanner.nextLine();
        return this;
    }
    public void info(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }
}
