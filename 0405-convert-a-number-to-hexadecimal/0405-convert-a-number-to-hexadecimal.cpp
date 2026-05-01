class Solution {
public:
    string toHex(int num) {
        if (num == 0) return "0";
        
        string hex_chars = "0123456789abcdef";
        string result = "";
        
        // Convert to unsigned to handle negative numbers
        unsigned int n = num;
        
        while (n != 0) {
            result = hex_chars[n & 15] + result; // prepend
            n >>= 4;
        }
        
        return result;
    }
};