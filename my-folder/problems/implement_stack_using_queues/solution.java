class MyStack {

    Queue<Integer> mainStack;
    Queue<Integer> utilityStack;
    public MyStack() {
        mainStack = new LinkedList();
        utilityStack= new LinkedList();
    }
    
    public void push(int x) {
        
        while(!mainStack.isEmpty()){
            utilityStack.add(mainStack.remove());
        }
        mainStack.add(x);
        
        while(!utilityStack.isEmpty()){
            mainStack.add(utilityStack.remove());
        }
    }
    
    public int pop() {
        return mainStack.remove();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public boolean empty() {
        return mainStack.isEmpty();
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