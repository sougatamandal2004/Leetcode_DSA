class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.size();
        int res = 0, i = 0;
        unordered_map<char, int> map;
        for(int j=0;j<n;j++){
            char ch = s[j];
            if(map[ch] > 0){
                // duplicate present
                i = max(map[ch], i);
            }
            res = max(res, j - i + 1);
            map[ch] = j + 1;
        }
        return res;
    }
};