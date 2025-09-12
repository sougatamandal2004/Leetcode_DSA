class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()) return false;
        // int[] count = new int[26];
        // for(int i=0;i<t.length();i++){
        //     char ch = t.charAt(i);
        //     int idx = s.indexOf(ch);
        //     if(idx != -1){
        //         s = s.substring(0,idx) + s.substring(idx + 1);
        //     }
        // }
        // return s.length() == 0;


        // optimal approach
        if(s.length() != t.length()) return false;
        int[] count = new int[26];
        for(int i=0;i<t.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int num : count){
            if(num != 0) return false;
        }
        return true;
    }
}