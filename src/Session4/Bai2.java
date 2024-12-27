package Session4;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chu dau tien");
        String string1 = input.nextLine();
        System.out.println("Nhap chu tiep theo");
        String str=input.nextLine();
        if (string1.contains(str)) {
            System.out.println("Ban da nhap dung");
        }
        else {
            System.out.println("Ban da nhap khong dung");
        }
    }
}
