package section5.bai2;

import java.util.Scanner;

public class Teacher {
    private int id;
    private String name;
    private String address;

    public Teacher() {
    }

    public Teacher(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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
    public Teacher input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id ");
        int id = scanner.nextInt();
        System.out.println("nhập tên");
        String name = scanner.next();
        System.out.println("nhập địa chi");
        String address = scanner.next();
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        return new Teacher(id, name, address);
    }
    public void info(Teacher teacher) {
        System.out.println("có id " + teacher.getId());
        System.out.println("có tên  " + teacher.getName());
        System.out.println("có địa chi " + teacher.getAddress());
    }
}
