package monday9;

import java.util.*;

public class DailyTemperatures {
     public static void main(String[] args) {
            int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};
            int n = temps.length;
            int[] ans = new int[n];
            Stack<Integer> stack = new Stack<>(); // stores indices

            for (int i = 0; i < n; i++) {
                while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                    int prev = stack.pop();
                    ans[prev] = i - prev; // days waited
                }
                stack.push(i);
            }

            // Print result
            for (int val : ans) {
                System.out.print(val + " ");
            }
        }
    }
