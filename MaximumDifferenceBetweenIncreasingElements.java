public class MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
        int difference = -1;
        int minValue = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minValue)
                difference = Math.max(difference, nums[i] - minValue);
            else
                minValue = nums[i];
        }

        return difference;
    }

    public static void main(String[] args) {
        MaximumDifferenceBetweenIncreasingElements maxDif = new MaximumDifferenceBetweenIncreasingElements();
        int[] nums1 = { 7, 1, 5, 4 };
        System.out.println(maxDif.maximumDifference(nums1));

        int[] nums2 = { 9, 4, 3, 2 };
        System.out.println(maxDif.maximumDifference(nums2));
    }

}
