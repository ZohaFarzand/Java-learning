package day4;

import java.util.Scanner;

public class hometask4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);

        int result = calculate(a, b, op);
        System.out.println("Result: " + result);
    }

    public static int calculate(int x, int y, char op) {
        switch (op) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return (y != 0) ? x / y : 0;
            default:
                return 0;
        }
    }
}

