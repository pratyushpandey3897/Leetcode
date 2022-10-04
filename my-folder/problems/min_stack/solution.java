class MinStack {

    
    List stack;
    List minStack;
    
    
    public MinStack() {
      stack = new ArrayList();
      minStack = new ArrayList();
    }
    
    public void push(int val) {
        stack.add(val);
        
        
        minStack.add(Math.min(
            val, (minStack.size() == 0 ? val : (int)minStack.get(minStack.size()-1))
        ));
    }
    
    public void pop() {
        minStack.remove(minStack.size()-1);
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return (int)stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return (int)minStack.get(minStack.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */