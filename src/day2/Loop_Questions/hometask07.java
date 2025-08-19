package day2.Loop_Questions;

public class hometask07 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int x = 0; x < rows - i; x++) {
                System.out.print("*");
            }
            System.out.println();// for next line
        }
    }
}
