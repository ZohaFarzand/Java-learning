package day4;

import java.util.Scanner;

public class hometask1 {

    public static void displayFactorial(int num) {
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;    // calculating factorial
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int num = input.nextInt();


        displayFactorial(num);    // call function
    }

}


