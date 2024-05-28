import java.util.HashMap;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // value, index
        HashMap<Integer, Integer> seen = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(seen.containsKey(nums[i]) && Math.abs(i - seen.get(nums[i])) <= k) {
                return true;
            }
            seen.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(new ContainsDuplicateII().containsNearbyDuplicate(nums, k));
    }
    
}
