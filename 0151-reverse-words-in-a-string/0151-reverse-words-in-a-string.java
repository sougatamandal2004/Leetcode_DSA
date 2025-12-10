class Solution {
    public String reverseWords(String s) {
        int left = 0, right = s.length() - 1;
        // removing leading left and right end spaces
        while(left <= right && s.charAt(left) == ' ') left++;
        while(right >= left && s.charAt(right) == ' ') right--;

        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=left;i<=right;i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            } else if(sb.length() > 0){
                list.add(sb);
                sb = new StringBuilder();
            }
        }
        if(sb.length() > 0) list.add(sb);
        String ans="";
        int n = list.size()-1;
        while(n >= 0){
            ans += list.get(n).toString();
            if(n != 0){
                ans += " ";
            }
            n--;
        }
        return ans;
    }
}