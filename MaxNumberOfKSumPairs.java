import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int count = 0;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                count++;
                left++;
                right--; 
            }
            else if (sum > k) right--;
            else left++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 3};
        int k = 6;
        System.out.println(maxOperations(nums, k));
    }
    
}
