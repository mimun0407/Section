package Session2;

import java.util.Scanner;

public class bai1to4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean checkVar=true;
        while(checkVar){
            System.out.println("pick an option: 1 Sort three numbers, 2 quadratic, 3 riddle, 4 age classification ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:compare();
                break;
                case 2:quadratic();
                break;
                case 3:riddle();
                break;
                case 4:classification();
                break;
                case 0:checkVar=false;
            }
        }
    }

    private static void classification() {
        System.out.println("Please enter your age ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if (option < 1) {
            System.out.println("Justin Baby");
        }
        if (option >=1&&option<=3) {
            System.out.println("Baby");
        }
        if (option >3&&option<=18) {
            System.out.println("kid");
        }
        if (option >18) {
            System.out.println("human");
        }
        if (option >40&&option<=60) {
            System.out.println("Adult");
        }
        if (option >=60) {
            System.out.println("old people");
        }
    }

    private static void riddle() {
        System.out.println("What is the Goat in Football?");
        System.out.println("A Ronaldo B Messi C Pele D Fat Ronaldo");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        String str="b";
        if (str.equalsIgnoreCase(option) ){
            System.out.println("True answer");
        }
        else {
            System.out.println("False answer");
        }
    }

    public static void compare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number a");
        int a = scanner.nextInt();
        System.out.println("number b");
        int b = scanner.nextInt();
        System.out.println("number c");
        int c = scanner.nextInt();
      int max=a;
      int min=b;
      if (a<b){
          max=b;
          min=a;
      }
      if (a<c){
          max=c;
      }
      if (b>c){
          min=c;
      }
      if (min>a) {
          min=a;
      }
      if (max<b){
          max=b;
      }
        System.out.println(max+" is the maximum number, "+min+ " is the minimum number ");
    }
    public static void quadratic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number a");
        int a = scanner.nextInt();
        System.out.println("number b");
        int b = scanner.nextInt();
        System.out.println("number c");
        int c = scanner.nextInt();
        double Dena=b*b-(4*a*c);
        if (Dena<0){
            System.out.println("phương trình vô nghiệm");
        }
        if (Dena==0){
            double result = (double) -b /(2*a);
            System.out.println(" phương trình (1) có nghiệm kép "+result);
        }
        if (Dena>0){
            double result1 =(-b+Math.sqrt(Dena))/(2*a);
            double result2 =(-b-Math.sqrt(Dena))/(2*a);
            System.out.println("phương trình có 2 nghiệm :"+result1+" "+result2);
        }
    }
}