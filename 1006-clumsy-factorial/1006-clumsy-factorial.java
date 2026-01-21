class Solution {
    public int clumsy(int n) {
        Stack<Integer> st = new Stack<>();
        st.push(n);
        n--;
        int op = 0;
        while(n > 0){
            if(op == 0){
                st.push(st.pop()*n);
            } else if(op == 1){
                st.push(st.pop()/n);
            } else if(op == 2){
                st.push(n);
            } else{
                st.push(-n);
            }
            n--;
            op = (op+1)%4;
        }

        int ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}