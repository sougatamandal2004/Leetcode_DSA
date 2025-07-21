class Solution {
    public String makeFancyString(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1;i<len;i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                count = 1;
            }

            if(count < 3){
                sb.append(s.charAt(i));
            }
        }
        sb.insert(0 , s.charAt(0));
        return sb.toString();
    }
}