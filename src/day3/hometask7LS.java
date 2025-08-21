package day3;

import java.util.Scanner;

public class hometask7LS {
    public static void main(String[] args) {
        // Linear search
        Scanner input = new Scanner(System.in);

        int[] arr = {54, 12, 89, 45, 20};

        System.out.println("Enter a number to search in the array");
        int num = input.nextInt();

         boolean found= false;
        for (int i = 0; i < arr.length; i++) {  //Loop go through the array
            if (arr[i] == num) {
                System.out.println("The number found at index " + i);
                found=true;
                break;
            }
        }
        if(!found) {
            System.out.println("Not found");
        }

    }
}
