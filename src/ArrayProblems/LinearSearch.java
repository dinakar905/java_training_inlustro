package ArrayProblems;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 1};
        int target = 9;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Index: " + index);
    }
}