package day2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        byte num=sc.nextByte();
        long factorial= 1L;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of the "+num+" is:  "+factorial);









    }
}
