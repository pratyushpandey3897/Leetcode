class MinStack {
    List<Integer[]> minQ;
    public MinStack() {
        minQ = new LinkedList<>();
    }
    
    public void push(int val) {

        // in the min stack for every element added, add the minimum at that position
        minQ.add (new Integer[]{val, Math.min (val, (minQ.size() == 0 ? val : minQ.get(minQ.size()-1)[1] ) ) } );
    }
    
    public void pop() {
        minQ.remove(minQ.size()-1);
        // mainQ.remove(mainQ.size()-1);
    }
    
    public int top() {
        return minQ.get(minQ.size()-1)[0];
    }
    
    public int getMin() {
        return minQ.get(minQ.size()-1)[1];
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