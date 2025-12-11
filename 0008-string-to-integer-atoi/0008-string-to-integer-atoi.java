class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        long ans = 0;
        if(s.length() == 0) return 0;
        int i=0;
        int sign = 1;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }
        while(i < s.length() && s.charAt(i) == '0'){
            i++;
        }
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch < '0' || ch > '9'){
                break;
            }
            ans = ans*10 + (ch - '0');
            if(ans*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(ans*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(ans*sign);
    }
}