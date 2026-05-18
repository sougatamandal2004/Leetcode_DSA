class Solution {
public:
    bool isPalindrome(int x) {
        if(x < 0) return false;
        if(x == 0) return true;
        int t = x;
        long rev = 0;
        while(t){
            rev = rev*10 + (t%10);
            t /= 10;
        }
        return x == rev;
    }
};