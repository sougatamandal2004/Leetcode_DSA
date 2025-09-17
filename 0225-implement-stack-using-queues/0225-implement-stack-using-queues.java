class MyStack {
    // Queue<Integer> q1 = new LinkedList<>();
    // Queue<Integer> q2 = new LinkedList<>();


    // using Deque
    Deque<Integer> deque = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        // while(!q1.isEmpty()){
        //     q2.add(q1.remove());
        // }
        // q1.add(x);
        // while(!q2.isEmpty()){
        //     q1.add(q2.remove());
        // }

        deque.addLast(x);
    }
    
    public int pop() {
        // if(q1.isEmpty()) return -1;
        // return q1.remove();

        return deque.removeLast();
    }
    
    public int top() {
        // if(q1.isEmpty()) return -1;
        // return q1.peek();

        return deque.getLast();
    }
    
    public boolean empty() {
        // return q1.isEmpty();

        return deque.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */