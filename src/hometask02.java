public class hometask02 {
        public static void main(String[] args) {
            int a = 5;   // first number
            int b = 10;  // second number

            System.out.println("Before Swap:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            // Swapping without third variable
            a = a + b;  // a = 15
            b = a - b;  // b = 5
            a = a - b;  // a = 10

            System.out.println("\nAfter Swap:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }