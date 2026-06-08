package ArrayProblems;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 3};
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println("Second Largest: " + secondMax);
        }
    }
}