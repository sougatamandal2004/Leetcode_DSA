class Solution {
public:
    bool isPalindrome(string s) {
        transform(s.begin(), s.end(), s.begin(), ::tolower);
        string t;
        for(char ch : s){
            if(isalnum(ch)){
                t += ch;
            }
        }
        int i = 0, j = t.size() - 1;
        while(i < j){
            if(t[i++] != t[j--]){
                return false;
            }
        }
        return true;
    }
};