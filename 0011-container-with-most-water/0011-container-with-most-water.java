class Solution {
    public int maxArea(int[] height) {
        // 2 pointer approach, TC => O(n)
        int mostWater = Integer.MIN_VALUE;
        int lp = 0, rp = height.length - 1;
        while(lp < rp) {
            int ht = Math.min(height[lp], height[rp]);
            int wdth = rp - lp;
            mostWater = Math.max(mostWater, (ht*wdth));
            if(height[lp] < height[rp]) {
                lp++;
            }
            else{
                rp--;
            }
        }
        return mostWater;
    }
}