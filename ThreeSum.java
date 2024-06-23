import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        // Diamond operator (<>) cho phép trình biên dịch suy luận kiểu dữ liệu từ ngữ cảnh,
        //  dựa trên khai báo biến ở phía bên trái của phép gán. 
        // Điều này giúp giảm thiểu việc lặp lại kiểu dữ liệu.
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Sắp xếp mảng trước khi bắt đầu

        for (int i = 0; i < nums.length - 2; i++) {
            // nums[i] = nums[i-1] nghĩa là bộ 3 đã được kiểm tra trước đó rồi
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Bỏ qua các phần tử trùng lặp để bộ 3 không trùng nhau
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (right > left && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum(nums);
        for (List<Integer> triplet : res) {
            System.out.println(triplet);
        }
    }
    
}
