package day3;

import java.util.Scanner;

public class hometask5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < numbers.length; i++) {     //storing input numbers in array
            numbers[i] = input.nextInt();
        }


        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {    // finding min num in array
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }


        System.out.println("Minimum number in the array is: " + min);


    }
}