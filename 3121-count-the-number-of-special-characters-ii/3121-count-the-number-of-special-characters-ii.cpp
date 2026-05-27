class Solution {
public:
    int numberOfSpecialChars(string word) {
        int cnt = 0;
        int upper[26];
        int lower[26];

        fill(begin(upper), end(upper), -1);
        fill(begin(lower), end(lower), -1);
        
        for(int i=0;i<word.length();i++) {
            char ch = word[i];
            if(islower(ch)) {
                lower[ch - 'a'] = i;
            } else{
                if(upper[ch - 'A'] == -1) upper[ch - 'A'] = i;
            }
        }
        for(int i=0;i<26;i++){
            if(lower[i] != -1 && upper[i] != -1 && lower[i] < upper[i]) cnt++;
        }
        return cnt;
    }
};