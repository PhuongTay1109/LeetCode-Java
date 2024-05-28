class MaximumAverageSubarrayI {
    static public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i]; // first window

        double max = sum / k;
        int length = nums.length;

        for (int i = k; i < length; i++) {
            // The element at the start of the previous window (nums[i - k]) is subtracted from sum.
            // The new element (nums[i]) is added to sum.
            sum = sum - nums[i-k] + nums[i];
            double avg = sum / k;
            if (avg > max)
                max = avg;
        }

        return max;  
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
}