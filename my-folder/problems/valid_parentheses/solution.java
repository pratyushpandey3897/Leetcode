import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '(' || i == '{' || i == '[') {
                stack.push(i);
            } else if (!stack.isEmpty()) {
                char element = stack.pop();
                if (element == '(' && i != ')') {
                    return false;
                } else if (element == '{' && i != '}') {
                    return false;
                } else if (element == '[' && i != ']') {
                    return false;
                }
            } else {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}