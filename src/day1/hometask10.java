package day1;

import java.util.Scanner;

public class hometask10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter subject marks");
        int Sub1 = sc.nextInt();
        int Sub2 = sc.nextInt();
        int Sub3 = sc.nextInt();
        int Sub4 = sc.nextInt();
        int Sub5 = sc.nextInt();
        System.out.println("total Gain marks:");
        System.out.println(Sub1 + Sub2 + Sub3 + Sub4 + Sub5);
        System.out.println("percentage:");
        System.out.println((Sub1 + Sub2 + Sub3 + Sub4 + Sub5) * 100 / 250
        );
    }
}
