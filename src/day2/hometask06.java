import java.util.Scanner;

public class hometask06 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        int total = 0;
        int maxMarks = 500;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = (double) total / maxMarks * 100;

        System.out.println("Maximum Marks = " + maxMarks);
        System.out.println("Obtained Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
    }
}

