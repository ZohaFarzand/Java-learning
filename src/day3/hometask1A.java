import java.util.Scanner;

public class hometask1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++) {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            if(age >= 50 && age <= 60) {
                count++;
            }
        }
        System.out.println("Number of persons in age group 50-60: " + count);
    }
}