package section8.bai3;

import java.util.Scanner;

public class Product {
    private String name;
    private int price;
    Category category;

    public Product(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public void Input(Category category) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Product name");

        setName(scanner.nextLine());
        System.out.println("input Product price");
        setPrice(scanner.nextInt());
        setCategory(category);
    }
    public void info() {
        System.out.println(getName() );
        System.out.println(getPrice());
        getCategory().info();
    }
}
