package day1;

import java.util.Scanner;

public class hometask08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total no. of students:");
        byte totS = sc.nextByte();
        System.out.println("enter fee per student:");
        double fee = sc.nextDouble();
        System.out.println("Total collected fee is :");
        System.out.println(totS * fee);
    }
}
