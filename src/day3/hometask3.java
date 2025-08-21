package day3;

public class hometask3 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] squares = new int[5];
        int[] cubes = new int[5];
        int[] sums = new int[5];
        int totalSum = 0;

        // Populate arrays
        for (int i = 0; i < 5; i++) {
            numbers[i] = i;
            squares[i] = i * i;
            cubes[i] = i * i * i;
            sums[i] = numbers[i] + squares[i] + cubes[i];
            totalSum += sums[i];
        }

        // Display arrays
        System.out.println("Index\tNumber  \tSquare     \tCube     \tSum");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "     \t " + numbers[i] + "       \t" + squares[i] + "       \t" + cubes[i] + "       \t" + sums[i]);
        }

        // Display total of sums array
        System.out.println("\nTotal of all values in 'sums' array: " + totalSum);
    }
}


