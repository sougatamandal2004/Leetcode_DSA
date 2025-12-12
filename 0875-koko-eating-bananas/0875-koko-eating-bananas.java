class Solution {
    private long calculate(int []piles, int hr){
        long th = 0;
        for(int i=0;i<piles.length;i++){
            th += (piles[i] + hr - 1) / hr;
        }
        return th;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i=0;i<piles.length;i++){
            if(piles[i] > max) max = piles[i];
        }
        int i=1, j = max;
        int ans = Integer.MAX_VALUE;
        while(i <= j){
            int mid = i + (j-i)/2;
            long totalHr = calculate(piles, mid);
            if(totalHr <= h){
                ans = mid;
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        return ans;
    }
}