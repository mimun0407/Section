package Session4;

import java.util.Scanner;


public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your email");
        String email = sc.nextLine();
        String regex = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";

        if (email.matches(regex)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
