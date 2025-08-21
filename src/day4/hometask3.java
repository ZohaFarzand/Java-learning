package day4;

import java.util.Scanner;

public class hometask3 {

    // method to calculate square
    public static int Square(int a) {
        return a * a;
    }


    // method to calculate cube
    public static int Cube(int b) {
        return b * b * b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number to find square: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer to find cube: ");
        int num2 = input.nextInt();


        int squareResult = Square(num1);
        int cubeResult = Cube(num2);


        System.out.println("Square of " + num1 + " is: " + squareResult);
        System.out.println("Cube of " + num2 + " is: " + cubeResult);
    }
}

