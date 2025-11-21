class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int ans = 0;
        for(char ch='a'; ch <= 'z'; ch++){
            int l = -1, r = -1;
            for(int i=0;i<n;i++){
                if(s.charAt(i) == ch){
                    if(l == -1) l = i;
                    r = i;
                }
            }

            if(l != -1 && r != -1 && l < r){
                HashSet<Character> mid = new HashSet<>();
                for(int i=l+1;i<r;i++){
                    mid.add(s.charAt(i));
                }
                ans += mid.size();
            }
        }
        return ans;
    }
}