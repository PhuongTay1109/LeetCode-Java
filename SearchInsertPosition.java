public class SearchInsertPosition {

    static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        if(nums[left] < target)
            return left + 1;

        return left;

    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5));
    }

    
}
