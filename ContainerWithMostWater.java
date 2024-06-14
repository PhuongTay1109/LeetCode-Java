public class ContainerWithMostWater {
    static int solution(int[] height) {

        int maxArea = 0;
        int n = height.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(area, maxArea);
            if(height[left] > height[right]) right--;
            else left++;
        }

        return maxArea; 
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(height));
    }
    
}
