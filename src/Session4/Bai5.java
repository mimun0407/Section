package Session4;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phone number");
        String phone = sc.nextLine();
        String regex = "^0\\d{9}$";
        if (phone.matches(regex)) {
            System.out.println("correct phone number");
        } else {
            System.out.println("not correct phone number");
        }

    }

}
