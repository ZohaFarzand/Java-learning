package Conditional_Statement_Questions;

import java.util.Scanner;

public class hometask4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of hours: ");
        int hours = sc.nextInt();


        int weeks = hours / 168;    // 1 week= 7*24=168

        int remHours = hours % 168;

        int days = remHours / 24;

        System.out.println(weeks + " week(s) and " + days + " day(s)");
    }
}

