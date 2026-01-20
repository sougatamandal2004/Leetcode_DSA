class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int len = strs.size();
        if(len == 0) return "";
        string s = strs[0];
        for(int i=1;i<len;i++){
            int j=0;
            while((s[j] == strs[i][j]) && j < s.size() && j < strs[i].size()){
                j++;
            }
            s = s.substr(0,j);
            if(s.empty()){
                return "";
            }
        }
        return s;
    }
};