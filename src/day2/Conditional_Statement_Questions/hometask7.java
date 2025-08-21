package Conditional_Statement_Questions;

import java.util.Scanner;

public class hometask7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println("Capital letter");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("Lowercase letter");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special symbo");
        }
    }
}
