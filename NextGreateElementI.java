import java.util.HashMap;
import java.util.Stack;

public class NextGreateElementI {
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // find next greater element of all number in nums2
        int n = nums2.length;
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (stack.empty()) {
                stack.push(i);
            } else {
                while (!stack.empty() && nums2[stack.peek()] < nums2[i]) {
                    map.put(nums2[stack.peek()], nums2[i]);
                    stack.pop();
                }
                stack.push(i);
            }
        }

        while(!stack.empty()) {
            map.put(nums2[stack.peek()], -1);
            stack.pop();
        }


        // compare with nums1 to get result
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }

        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };

        int[] res = nextGreaterElement(nums1, nums2);
        for(int i : res) {
            System.out.println(i + " ");
        }
    }

}
