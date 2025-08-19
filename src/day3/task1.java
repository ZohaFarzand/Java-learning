package day3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] numbers = new int[5];
        System.out.println("Enter any 5 digits: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sum+=numbers[i];
        }
        System.out.println("The sum of numbers: "+sum);

    }
}
