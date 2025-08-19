package day1;

import java.util.Scanner;

public class hometask04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the distance in miles:");
        byte dis = sc.nextByte();
        System.out.println(" The distance in km is");
        System.out.println(dis * 1.60934);
    }
}
