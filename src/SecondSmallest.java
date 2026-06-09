public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 3};
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num > min) {
                secondMin = num;
            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println("Second Smallest: " + secondMin);
        }
    }
}