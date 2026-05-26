class Solution {
public:
    int numberOfSpecialChars(string word) {
        int arr[26];
        string upper;
        for(char ch : word) {
            if(islower(ch)){
                arr[ch - 'a'] = 1;
            } else upper += ch;
        }
        int cnt = 0;
        for(char c : upper) {
            if(arr[((c + 32) - 'a')] != 0) {
                cnt++;
                arr[((c + 32) - 'a')]--;
            }
        }
        return cnt;
    }
};