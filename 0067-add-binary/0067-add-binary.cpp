class Solution {
public:
    string addBinary(string a, string b) {
        // int x = stoi(a);
        // int y = stoi(b);
        string ans;
        int m = a.length();
        int n = b.length();
        int i = 0;
        int carry = 0;
        while(m > 0 && n > 0){
            int x = (a[m-1] - '0') + (b[n-1] - '0') + carry;
            if(x > 1){
                if(x == 2) ans.push_back('0');
                else ans.push_back('1');
                carry = 1;
            } else{
                ans.push_back(x + '0');
                carry = 0;
            }
            m--;
            n--;
        }
        while(m > 0){
            int x = (a[m-1] - '0') + carry;
            if(x > 1){
                ans.push_back('0');
                carry = 1;
            } else{
                ans.push_back(x + '0');
                carry = 0;
            }
            m--;
        }
        while(n > 0){
            int x = (b[n-1] - '0') + carry;
            if(x > 1){
                ans.push_back('0');
                carry = 1;
            } else{
                ans.push_back(x + '0');
                carry = 0;
            }
            n--;
        }
        if(carry) ans.push_back('1');
        reverse(ans.begin(), ans.end());
        return ans;
    }
};