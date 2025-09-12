class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            int idx = s.indexOf(ch);
            if(idx != -1){
                s = s.substring(0,idx) + s.substring(idx + 1);
            }
        }
        return s.length() == 0;
    }
}