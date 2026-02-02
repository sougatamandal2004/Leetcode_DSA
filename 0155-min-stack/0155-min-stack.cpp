class MinStack {
    stack<int> st;
    int mini;
public:
    MinStack() {
        mini = INT_MAX;
    }
    
    void push(int val) {
        if(st.empty()){
            st.push(val);
            mini = val;
        }
        else {
            if(mini < val) st.push(val);
            else{
                st.push(mini);
                st.push(val);
                mini = val;
            }
        }
    }
    
    void pop() {
        if(st.empty()) return;
        if(st.top() == mini){
            st.pop();
            if(!st.empty()){
                mini = st.top();
                st.pop();
            } 
        } else{
            st.pop();
        }
    }
    
    int top() {
        // if(st.empty()) return -1;
        return st.top();
    }
    
    int getMin() {
        return mini;
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */