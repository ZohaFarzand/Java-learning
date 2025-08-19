package day3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int[] number = {5, 7, 4, 6, 3};
        int min = number[0];
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }


        }
        System.out.println("Min no. is : " + min);
        System.out.println("max no. is : " + max);
        


    }
}
