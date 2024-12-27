package section8.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check category");
        System.out.println("1 A");
        System.out.println("2 B");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Category category = new Category();
            category.setId(1);
            category.setName("A");
            Product product = new Product();
            product.Input(category);
            product.info();
        }
        else if (choice == 2) {
            Category category = new Category();
            category.setId(2);
            category.setName("B");
            Product product = new Product();
            product.Input(category);
            product.info();
        }
        else {
            System.out.println("error");
        }

    }
}
