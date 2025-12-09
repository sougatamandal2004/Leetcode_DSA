class Solution {
    public List<String> letterCombinations(String digits) {
        char[][] L = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m','n','o'},
                    {'p','q','r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        List<String> ans = new ArrayList<>();
        int length = digits.length();
        if(length == 0) {
            //ans.add("");
            return ans;
        }
        dfs(0, length, new StringBuilder(), digits, ans, L);
        return ans;
    }
    public void dfs(int pos, int len, StringBuilder sb, String digits, List<String> ans, char[][] l) {
        if(pos == len){
            ans.add(sb.toString());
            return;
        }
        else{
            char[] letters = l[Character.getNumericValue(digits.charAt(pos))];
            for(char c : letters){
            sb.append(c);            // add
            dfs(pos+1, len, sb, digits, ans, l);
            sb.deleteCharAt(sb.length()-1); // remove (backtrack)
            }
        }
    }
}