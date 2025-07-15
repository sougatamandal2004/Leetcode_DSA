class Solution {
    public boolean isValid(String word) {
        int len = word.length();
        if(len < 3){
            return false;
        }
        int cnt0 = 0, cnt1 = 0;
        for(int i=0;i<len;i++){
            char ch = word.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    cnt0++;
                }
                else cnt1++;
            }
        }
        return cnt0 > 0 && cnt1 > 0;
    }
}