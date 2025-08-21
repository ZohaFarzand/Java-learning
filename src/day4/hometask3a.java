package day4;

import java.util.Scanner;

public class hometask3a {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();

                int square = getSquare(a);
                int cube = getCube(b);

                int result = square + cube;
                System.out.println("Result: " + result);
            }

            public static int getSquare(int n) {
                return n * n;
            }

            public static int getCube(int n) {
                return n * n * n;
            }
        }

