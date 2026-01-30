class Solution {
public:
    string minWindow(string s, string t) {
        if(s.size() < t.size()) return "";
        unordered_map<char, int> map;
        for(int i=0;i<t.size();i++){
            map[t[i]]++;
        }
        int start = 0, end = 0, countRequired = t.size();
        int len = s.length();
        int startIdx = -1, totalChars = 0;
        int windowSize = INT_MAX;
        while(end < len){
            if(map[s[end]] > 0){
                countRequired--;
            }
            map[s[end]]--;
            while(countRequired == 0) {
                if(windowSize > end - start + 1) {
                    windowSize = (end - start + 1);
                    startIdx = start, totalChars = windowSize;
                }
                map[s[start]]++;
                if(map[s[start]] > 0){
                    countRequired++;
                }
                start++;
            }
            end++;
        }
        return startIdx == -1 ? "" : s.substr(startIdx, totalChars);
    }
};