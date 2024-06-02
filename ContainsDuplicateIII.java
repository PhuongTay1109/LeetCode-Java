import java.util.TreeSet;

// abs(i-j) <= indexDiff => size of window is indexDiff
// abs(nums[i] - nums[j]) <= valueDiff
// -valueDiff + nums[j] <= nums[i] <= valueDiff + nums[j]
public class ContainsDuplicateIII {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
       TreeSet<Long> window = new TreeSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            long num = nums[i];
            
            Long floor = window.floor(num + valueDiff);
            if (floor != null && floor >= num - valueDiff) {
                return true;
            }
        
            window.add(num);
            
            if (i >= indexDiff) {
                window.remove((long) nums[i - indexDiff]);
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 9, 1, 5, 9};
        int indexDiff = 2, valueDiff = 3;
        System.out.println(containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff));
    }
}
