class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)) {
                list.add(ch);
            }
        }
        Collections.sort(list);
        int x = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                sb.append(list.get(x));
                x++;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        String ans = sb.toString();
        return ans;
    }

    private boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}