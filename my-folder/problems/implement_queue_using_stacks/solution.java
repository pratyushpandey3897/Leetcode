class MyQueue {
        Queue<Integer> q1 ;
        Queue<Integer> q2 ;
    public MyQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        
        if (q1.size()>0 && q2.size()==0){
            while(q1.size()>0){
                q2.add(q1.poll());
            }
        }
        return q2.poll();
    }
    
    public int peek() {
        if (q1.size()>0 && q2.size()==0){
            while(q1.size()>0){
                q2.add(q1.poll());
            }
        }
        return q2.peek();
    }
    
    public boolean empty() {
        return (q1.size()==0 && q2.size()==0);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */