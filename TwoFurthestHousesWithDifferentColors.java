class TwoFurthestHousesWithDifferentColors {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDist = 0;

        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                maxDist = Math.max(maxDist, n - 1 - i);
            }
            if (colors[i] != colors[0]) {
                maxDist = Math.max(maxDist, i);
            }
        }

        return maxDist;
    }

    public static void main(String[] args) {
        TwoFurthestHousesWithDifferentColors twoFurthest = new TwoFurthestHousesWithDifferentColors();
        int[] colors = { 1, 1, 1, 6, 1, 1, 1 };
        System.out.println(twoFurthest.maxDistance(colors));
    }
}