package day4;

import java.util.Scanner;

public class hometask4 {


        // Method to perform arithmetic operation
        public static void Operations(double a, double b, char operator) {
            double result;

            switch (operator) {
                case '+':
                     double sum = a + b;
                    System.out.println("Result: " + sum);
                    break;

                case '-':
                    double diff = a - b;
                    System.out.println("Result: " + diff);
                    break;

                case '*':
                    double product = a * b;
                    System.out.println("Result: " + product);
                    break;

                case '/':
                    if (b != 0) {
                         double division = a / b;
                        System.out.println("Result: " + division);
                    } else {
                        System.out.println("number is dividing by zero");
                    }
                    break;

                case '%':
                    if (b != 0) {
                        double modulus = a % b;
                        System.out.println("Result: " + modulus);
                    } else {
                        System.out.println("number is Modulo by zero");
                    }
                    break;

                default:
                    System.out.println("Invalid operator.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();


            System.out.print("Enter operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            // Call method to perform operation
            Operations(num1, num2, operator);
        }
    }



