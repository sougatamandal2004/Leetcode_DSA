class Solution {
public:
    bool isPalindrome(string s) {
       vector<char> str;
       for(int i=0;i<s.length();i++){
        if(isalnum(s[i])){ // checks if the character is alphanumeric or not
            str.push_back(tolower(s[i]));
        }
       }
       int f = 0;
       int l = str.size() - 1;
       while(f < l){
        if(str[f] != str[l]){
            return false;
        }
        f++;
        l--;
       }
       return true;
    }
};