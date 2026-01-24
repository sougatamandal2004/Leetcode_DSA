class Solution {
public:
    bool isHappy(int n) {
        unordered_map<int, int> map;
        map[n] = 1;
        int t = n;
        while(t != 1){
            string s = to_string(t);
            int sum = 0;
            for(int i=0;i<s.size();i++){
                int digit = s[i] - '0';
                sum += (digit*digit);
            }
            if(map[sum] == 1) return false;
            map[sum] = 1;
            t = sum;
        }
        return true;
    }
};