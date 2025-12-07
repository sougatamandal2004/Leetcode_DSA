class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        int diff = high - low;
        if(diff%2 == 1){
            count = diff/2 + 1;
        }
        else if(diff%2 == 0){
            if(low%2 == 1){
                count = diff/2 + 1;
            }
            else{
                count = diff/2;
            }
        }
        return count;
    }
}