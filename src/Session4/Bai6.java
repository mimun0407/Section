package Session4;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("give me your phone number");
        String phone = sc.nextLine();
        String regex = "^0\\d{9}$";
        if (phone.matches(regex)) {
            System.out.println("correct phone number");
        } else {
            System.out.println("not correct phone number");
        }
        String little =phone.substring(0,3);
        if (little.equals("098")) {
            System.out.println("your number is VinaPhone number");
        }
        else if (little.equals("097")) {
            System.out.println("your number is Viete number");
        }

    }
}
