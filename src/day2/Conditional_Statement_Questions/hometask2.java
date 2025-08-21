package Conditional_Statement_Questions;

import java.util.Scanner;

public class hometask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 3 subjects:");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        int Avrg = (sub1 + sub2 + sub3) / 3;

        if (Avrg >= 60) {
            System.out.println("Congratulations! You Passed");
        } else {
            System.out.println("Better Luck Next Time");

        }
    }
}
