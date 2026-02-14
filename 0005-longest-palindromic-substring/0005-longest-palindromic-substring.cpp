class Solution {
public:
    bool check(string& s, int start, int end){
        while(start < end){
            if(s[start] != s[end]) return false;
            start++;
            end--;
        }
        return true;
    }
    string longestPalindrome(string s) {
        int n = s.length();
        string ans;
        int len = -1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(check(s, i, j)){
                    if(len < j - i + 1){
                        ans = s.substr(i, j - i + 1);
                        len = j - i + 1;
                    }
                }
            }
        }
        return ans;
    }
};