package day3;

public class hometask7 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 7, 8};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            // sum=sum+arr[i]
            //for itr.1:
            // sum=0, i=0 stores 3
            // sum= 0+3
            //  3 =3+ 5(i=1 stores5)
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
