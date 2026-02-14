class Solution {
public:
    int t[1001][1001];
    bool check(string& s, int i, int j){
        if(i >= j) return 1;
        if(t[i][j] != -1) return t[i][j];
        if(s[i] == s[j])
            return t[i][j] = check(s, i+1, j-1);
        return t[i][j] = 0;
    }
    string longestPalindrome(string s) {
        int n = s.length();
        memset(t, -1, sizeof(t));
        int len = -1;
        int sp = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(check(s, i, j)){
                    if(len < j - i + 1){
                        len = j - i + 1;
                        sp = i;
                    }
                }
            }
        }
        return s.substr(sp, len);
    }
};