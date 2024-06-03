// For any nums[i], calculate its left product and calculate its right product,
// without including nums[i].
// Then multiply these left and right product, 
// this will give product of array excluding nums[i].
public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];

        pre[0] = 1;
        suff[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = pre[i] * suff[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 1, 0, -3, 3 };
        int[] result = productExceptSelf(nums);
        for (int value : result)
            System.out.print(value + " ");
    }
}
