class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int len = s.length();
        boolean isValid = true;
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && (ch == ')' || ch == '}' || ch == ']')){
                if(ch == ')' && st.peek() != '('){
                    isValid = false;
                    break;
                }
                else if(ch == '}' && st.peek() != '{'){
                    isValid = false;
                    break;
                }
                else if(ch == ']' && st.peek() != '['){
                    isValid = false;
                    break;
                }
                else{
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}