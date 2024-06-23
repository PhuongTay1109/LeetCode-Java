public class Sqrt_x {

    static int mySqrt(int x) {

        if(x < 2) return x;

        // sqrt(x) > n
        // => search from 0 to x find n satisfies 
        // n * n < x 

        int left = 0;
        int right = x;

        while (left < right) {

            int mid = left + (right - left) / 2;

            // x < mid * mid nghĩa là mid quá lớn, không thể là căn bậc 2 của x
            // thu hẹp phạm vi tìm kiếm về bên trái
            if(x / mid < mid) {
                right = mid;
            }
            else {
                left = mid + 1;
            }

        }

        return left - 1;  
    }  

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
}
