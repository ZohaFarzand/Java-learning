package day1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter principal:");
        Double Principal=sc.nextDouble();

        System.out.println("Enter rate:");
        Double Rate=sc.nextDouble();

        System.out.println("Enter time:");
        Double Time=sc.nextDouble();

        System.out.println((Principal * Rate * Time) / 100.0);

    }

}
