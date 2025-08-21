package Conditional_Statement_Questions;

import java.util.Scanner;

public class hometask3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Even Number:");
        int Even = sc.nextInt();

        System.out.println("Enter an Odd Number:");
        int Odd = sc.nextInt();

//        int Finalresult=1000-((Even*5)+(Odd*3));
//        System.out.println("The Final Result is:"+Finalresult);

        int even = Even * 5;
        int odd = Odd * 3;
        int sum = even + odd;
        int diff = 1000 - sum;
        System.out.println("The Final Result is:" + diff);

    }
}
