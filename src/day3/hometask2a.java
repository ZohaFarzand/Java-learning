package day3;

public class hometask2a {
    public static void main(String[] args) {
                int[] numbers = new int[5];
                int[] squares = new int[5];
                int[] cubes = new int[5];
                int[] sums = new int[5];

                int total = 0;

                for (int i = 0; i < 5; i++) {
                    numbers[i] = i;
                    squares[i] = i * i;
                    cubes[i] = i * i * i;
                    sums[i] = numbers[i] + squares[i] + cubes[i];
                    total += sums[i];
                }

                System.out.println("Numbers array:");
                for (int i = 0; i < 5; i++) {
                    System.out.print(numbers[i] + " ");
                }

                System.out.println("\nSquares array:");
                for (int i = 0; i < 5; i++) {
                    System.out.print(squares[i] + " ");
                }

                System.out.println("\nCubes array:");
                for (int i = 0; i < 5; i++) {
                    System.out.print(cubes[i] + " ");
                }

                System.out.println("\nSums array:");
                for (int i = 0; i < 5; i++) {
                    System.out.print(sums[i] + " ");
                }

                System.out.println("\nTotal of sums array: " + total);
            }
        }


