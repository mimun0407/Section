package Session4;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("nhap chu can kiem tra");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)=='A') {
                count++;
            }
        }
        System.out.println("co"+count+"chu A");
        }
}
