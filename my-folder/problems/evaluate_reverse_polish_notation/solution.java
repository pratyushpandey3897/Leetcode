class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        for (String e: tokens){

                if (e.equals("+"))
                    stack.push(stack.pop() + stack.pop());
                else if (e.equals("*"))
                    stack.push(stack.pop()*stack.pop());
                else if (e.equals("-"))
                    stack.push(-stack.pop() + stack.pop());
                else if (e.equals("/"))
                    stack.push(  (int)((1D/stack.pop()) * stack.pop()));
                
                else 
                    stack.push(Integer.valueOf(e));


        }

        return stack.pop();

    }
}