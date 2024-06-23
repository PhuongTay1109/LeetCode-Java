public class MinumumOperationsToExceedThresholdValueI {

    static int minOperations(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < k) {
                cnt++;
            }

        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 4, 9 };
        System.out.println(minOperations(nums, 1));
    }

}
