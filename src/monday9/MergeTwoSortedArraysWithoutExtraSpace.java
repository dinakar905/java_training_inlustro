package monday9;

public class MergeTwoSortedArraysWithoutExtraSpace {
        public static void merge(int[] arr1, int[] arr2) {
            int n = arr1.length, m = arr2.length;
            int gap = (int)Math.ceil((double)(n + m) / 2);

            while (gap > 0) {
                int i = 0, j = gap;
                while (j < (n + m)) {
                    int a = (i < n) ? arr1[i] : arr2[i - n];
                    int b = (j < n) ? arr1[j] : arr2[j - n];

                    if (a > b) {
                        if (i < n && j < n) {
                            int temp = arr1[i]; arr1[i] = arr1[j]; arr1[j] = temp;
                        } else if (i < n && j >= n) {
                            int temp = arr1[i]; arr1[i] = arr2[j - n]; arr2[j - n] = temp;
                        } else {
                            int temp = arr2[i - n]; arr2[i - n] = arr2[j - n]; arr2[j - n] = temp;
                        }
                    }
                    i++; j++;
                }
                gap = (gap == 1) ? 0 : (int)Math.ceil((double)gap / 2);
            }
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 3, 5, 7};
            int[] arr2 = {0, 2, 6, 8, 9};
            merge(arr1, arr2);

            for (int x : arr1) System.out.print(x + " ");
            System.out.println();
            for (int x : arr2) System.out.print(x + " ");
        }
    }