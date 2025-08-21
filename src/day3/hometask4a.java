package day3;

import java.util.Scanner;

public class hometask4a {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int[] numbers = new int[5];

                System.out.println("Enter 5 numbers:");
                for (int i = 0; i < 5; i++) {
                    numbers[i] = sc.nextInt();
                }

                System.out.println("Original order:");
                for (int i = 0; i < 5; i++) {
                    System.out.print(numbers[i] + " ");
                }

                System.out.println("\nReverse order:");
                for (int i = 4; i >= 0; i--) {
                    System.out.print(numbers[i] + " ");
                }


    }
}
