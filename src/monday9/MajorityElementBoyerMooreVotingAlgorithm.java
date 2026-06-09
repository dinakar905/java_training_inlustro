package monday9;

class MajorityElementBoyerMooreVotingAlgorithm {
    public static int findMajority(int[] nums) {
        int candidate = 0, count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate; // Assumption: majority element always exists
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println(findMajority(arr));
    }
}
