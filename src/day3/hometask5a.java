package day3;

public class hometask5a {
    public static void main(String[] args) {
                int[][] numbers = {
                        {5, 12, 7},
                        {9, 3, 15},
                        {8, 20, 1}
                };

                int min = numbers[0][0];
                int max = numbers[0][0];

                for (int i = 0; i < numbers.length; i++) {
                    for (int j = 0; j < numbers[i].length; j++) {
                        if (numbers[i][j] < min) {
                            min = numbers[i][j];
                        }
                        if (numbers[i][j] > max) {
                            max = numbers[i][j];
                        }
                    }
                }

                System.out.println("Minimum value: " + min);
                System.out.println("Maximum value: " + max);
            }
        }


