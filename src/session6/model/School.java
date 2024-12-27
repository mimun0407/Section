package session6.model;

import java.util.Scanner;

public class School {
    private int id;
    private String SchoolName;
    private String SchoolAddress;

    public School(String schoolName, String schoolAddress) {
        SchoolName = schoolName;
        SchoolAddress = schoolAddress;
    }

    public School(int id, String schoolName, String schoolAddress) {
        this.id = id;
        SchoolName = schoolName;
        SchoolAddress = schoolAddress;
    }

    public School() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public String getSchoolAddress() {
        return SchoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        SchoolAddress = schoolAddress;
    }

    public School input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter School Id: ");
        int id = sc.nextInt();
        System.out.print("Enter School Name: ");
        String schoolName = sc.nextLine();
        System.out.print("Enter School Address: ");
        String schoolAddress = sc.nextLine();
        return new School(id, schoolName, schoolAddress);
    }
    public void info(School school) {
        System.out.println("School Id: " + school.getId());
        System.out.println("School Name: " + school.getSchoolName());
        System.out.println("School Address: " + school.getSchoolAddress());
    }
}
