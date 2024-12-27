package Session3;

import java.util.Scanner;

public class Bai1to5 {
    public static void main(String[] args) {
        boolean check = true;
        Scanner input = new Scanner(System.in);

        while (check) {
            System.out.println("1 is Hello World,2 is oneToHundred, 3 is Giai Thua ,4 is Array, 0 is close");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    HelloWorld();
                    break;
                case 2:
                    oneToHundred();
                    break;
                case 3:
                    GiaThu();
                    break;
                case 4:
                    Array();
                case 0:
                    check = false;
            }
        }
    }
    public static void HelloWorld(){
        for (int i=0;i<10;i++){
            System.out.println("Hello World");
        }
    }
    public static void oneToHundred(){
        int number=0;
        for (int i=0;i<100;i++){
            number+=i;
        }
        System.out.println(number);
    }
    public static void GiaThu( ){
        System.out.println("Nhap vao so ban muong thu");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        int sum=1;
        for (int i=choice;i>0;i--){
            sum*=i;
        }
        System.out.println("sum= "+sum);
    }
    public static void Array(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input Number");
        int number=input.nextInt();
        int []array=new int[number];
        for (int i=1;i<=number;i++){
            array[i-1]=i;
        }
        System.out.println("cac phan tu trong mang la");
        for(int i:array){
            System.out.println(i);
        }
        System.out.println("Tong tu trong mang la");
        int sum=0;
        for (int i:array){
            sum+=i;
        }
        System.out.println(sum);
        System.out.println("Tich cac phan tu trong mang la");
        int multiplication=1;
        for (int i:array){
            multiplication*=i;
        }
        System.out.println(multiplication);
        System.out.println("Min= "+array[0]);
        System.out.println("Max= "+array[array.length-1]);

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                if (array[j]>array[i]){
                    int c=array[j];
                    array[j]=array[i];
                    array[i]=c;
                }
            }
        }
        System.out.println("New Array Desc ");
        for(int i:array){
            System.out.print(i);
        }
    }

}
