package section5.bai2;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Student input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id hoc sinh ");
        int id = scanner.nextInt();
        System.out.println("nhập tên hoc sinh");
        String name = scanner.next();
        System.out.println("nhập địa chi hoc sinh");
        String address = scanner.next();
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        return new Student(id, name, address);
    }
    public void info(Student student) {
        System.out.println("có id " + student.getId());
        System.out.println("có tên  " + student.getName());
        System.out.println("có địa chi " + student.getAddress());
    }
}
