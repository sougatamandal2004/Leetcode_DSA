class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.size();
        unordered_map<char, int> map;
        int ans = 0;
        int i = 0;
        for(int j=0;j<n;j++){
            char ch = s[j];
            map[ch]++;
            int t = 0;
            while(map[ch] > 1){
                t = j - i;
                char x = s[i++];
                map[x]--;
                //if(map[x] == 0) map.erase(x);
            }
            ans = max(ans, j - i + 1);
        }
        return ans;
    }
};