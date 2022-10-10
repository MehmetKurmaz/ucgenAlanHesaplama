import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,alan,cevre,u;
        System.out.print("A Kenarini Giriniz :");
        Scanner input =new Scanner(System.in);
        a=input.nextInt();
        System.out.print("B Kenarini Giriniz :");
        b=input.nextInt();
        System.out.print("C Kenarini Giriniz :");
        c=input.nextInt();
        u=(a+b+c)/2;
        cevre=u*u;
        alan=u*(u-a)*(u-b)*(u-c);
        System.out.println("A Kenari :"+a);
        System.out.println("B Kenari :"+b);
        System.out.println("C Kenari :"+c);
        System.out.println("Cevresi :"+cevre);
        System.out.println("Alani :"+alan);


    }
}