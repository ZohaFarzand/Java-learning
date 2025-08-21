package day4;

import java.util.Scanner;

public class homtask2a {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                checkNumber(num);
            }

            public static void checkNumber(int n) {
                if (n % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

                if (isPrime(n)) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not Prime");
                }
            }

            public static boolean isPrime(int n) {
                if (n <= 1) return false;
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) return false;
                }
                return true;
            }
        }

