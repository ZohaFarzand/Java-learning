package day3;

import java.util.Scanner;

public class hometask8 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        System.out.println("Enter 9 numbers:"); // storing the input values in rows and columns
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is:");    //printing all the values in matrix form
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");    // don't write "println" bcz it'll print each row in next line.
            }
            System.out.println();
        }


        //        int[][] arr = {
//                {3, 8, 1},
//                {7, 2, 9},
//                {4, 6, 5}
//        };

        int min = arr[0][0];
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {          // finding min & max term from the matrix
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) min = arr[i][j];
                if (arr[i][j] > max) max = arr[i][j];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
