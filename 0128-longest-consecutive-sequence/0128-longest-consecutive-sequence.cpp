class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> set;
        for(int num : nums){
            set.insert(num);
        }
        int finalAns = 0;
        for(int num : set){
            if(set.find(num-1) == set.end()){
                int x = num;
                int currAns = 1;
                while(set.find(x+1) != set.end()){
                    x++;
                    currAns++;
                }
                finalAns = max(finalAns, currAns);
            }
        }
        return finalAns;
    }
};