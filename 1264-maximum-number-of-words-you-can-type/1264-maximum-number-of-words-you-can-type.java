class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split("\\s+");
        int ans = arr.length;
        for(String s : arr){
            for(char ch : brokenLetters.toCharArray()){
                if(s.indexOf(ch) != -1){
                    ans -= 1;
                    break;
                }
            }
        }
        return ans;
    }
}