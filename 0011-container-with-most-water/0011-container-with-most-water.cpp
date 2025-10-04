class Solution {
public:
    int maxArea(vector<int>& height) {
        int mostWater = INT_MIN;
        int i=0, j = height.size() - 1;
        while(i < j){
            int ht = min(height[i], height[j]);
            mostWater = max(mostWater, ht*(j - i));
            if(height[i] < height[j]) i++;
            else j--;
        }
        return mostWater;
    }
};