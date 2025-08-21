package day3;

import java.util.Scanner;

public class hometask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();// storing input numbers in array
            sum += numbers[i];
        }
        System.out.println("You entered:");
        for (int num : numbers) {
            System.out.println(num);
        }

        double average = sum / numbers.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}

