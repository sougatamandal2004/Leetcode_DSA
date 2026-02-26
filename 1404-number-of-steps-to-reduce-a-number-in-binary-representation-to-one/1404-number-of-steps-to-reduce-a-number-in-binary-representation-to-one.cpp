class Solution {
public:
    int numSteps(string s) {
        int ans = 0;
        
        while(s != "1") {
            if(s.back() == '0') {
                // even → divide by 2
                s.pop_back();
            } else {
                // odd → add 1
                int i = s.size() - 1;
                
                // handle carry
                while(i >= 0 && s[i] == '1') {
                    s[i] = '0';
                    i--;
                }
                
                if(i >= 0) {
                    s[i] = '1';
                } else {
                    s = '1' + s;
                }
            }
            ans++;
        }
        
        return ans;
    }
};