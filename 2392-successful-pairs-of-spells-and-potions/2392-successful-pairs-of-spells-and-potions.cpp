class Solution {
public:
    vector<int> successfulPairs(vector<int>& spells, vector<int>& potions, long long success) {
        // vector<int> v;
        // for(int i=0;i<spells.size();i++){
        //     int count = 0;
        //     for(int j = 0;j<potions.size();j++){
        //         if((spells[i] * potions[j]) >= success){
        //             count++;
        //         }
        //     }
        //     v.push_back(count);
        // }
        // return v;


        vector<int> res;
        sort(potions.begin(), potions.end());  // Step 1: sort potions
        int m = potions.size();
        
        for (int spell : spells) {
            long long target = (success + spell - 1) / spell; // minimum potion needed
            // binary search for first potion >= target
            int left = 0, right = m;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (potions[mid] < target) left = mid + 1;
                else right = mid;
            }
            res.push_back(m - left);
        }
        return res;
    }
};