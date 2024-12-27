package Session4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("nhap mang can dung cach nhau boi space");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] Array=str.split(" ");
        for(String i:Array){
            System.out.println(i);
        }
    }
}
