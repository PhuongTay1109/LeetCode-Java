public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeftPot = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRightPot = (i == length - 1) || (flowerbed[i + 1] == 0);
                if (emptyLeftPot && emptyRightPot) {
                    flowerbed[i] = 1;
                    count++;
                    if (count >= n) 
                        return true;
                }
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(flowerbed, n));
    }
}
