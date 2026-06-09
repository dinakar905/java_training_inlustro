package monday9;

import java.util.*;
    class FindAllPairswithGivenSum {
        public static void findPairs(int[] arr, int target) {
            Set<Integer> seen = new HashSet<>();
            for (int num : arr) {
                int complement = target - num;
                if (seen.contains(complement)) {
                    System.out.println("(" + complement + ", " + num + ")");
                }
                seen.add(num);
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 5, 3, 2, 4};
            int target = 6;
            findPairs(arr, target);
        }
    }

