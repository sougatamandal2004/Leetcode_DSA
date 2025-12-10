class Solution {
    public String reverseWords(String s) {
        String words[] = s.split("\\s++");
        StringBuilder sb = new StringBuilder();
        int n = words.length-1;
        while(n >= 0){
            sb.append(words[n]).append(" ");
            n--;
        }
        String ans = sb.toString().trim();
        return ans;
    }
}