class Solution {
public:
    int minAddToMakeValid(string s) {
        int n = s.length();
        int count = 0;
        stack<char> st;
        for(int i=0;i<n;i++){
            char ch = s[i];
            if(ch == '(') st.push(ch);
            if(ch == ')'){
                if(!st.empty() && st.top() == '('){
                    st.pop();
                }
                else{
                    count++;
                }
            }
        }
        return count + st.size();
    }
};