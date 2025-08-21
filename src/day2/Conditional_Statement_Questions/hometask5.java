package Conditional_Statement_Questions;

import java.util.Scanner;

public class hometask5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max;
        if (num1 >= num2) {
            if (num1 >= num3) max = num1;
            else max = num3;
        } else {
            if (num2 >= num3) max = num2;
            else max = num3;
        }

        System.out.println(" The Greatest Number is: " + max);
    }
}




