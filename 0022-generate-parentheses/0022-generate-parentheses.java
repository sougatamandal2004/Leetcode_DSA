class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(n, list, new StringBuilder(), 0, 0);
        return list;
    }
    private void generate(int n, List<String> list, StringBuilder sb, int open, int close){
        if(sb.length() == 2*n){
            list.add(sb.toString());
            return;
        }
        if(open < n){
            generate(n, list, sb.append("("), open + 1, close);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(close < open){
            generate(n, list, sb.append(")"), open, close + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}