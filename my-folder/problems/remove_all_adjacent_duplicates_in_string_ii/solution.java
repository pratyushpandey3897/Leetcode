class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<Pair> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i=0; i< chars.length; i++){
            
                
            if (!stack.isEmpty() && stack.peek().getKey().equals(chars[i])){
                stack.add(new Pair(stack.peek().getKey(), (int)stack.peek().getValue() +1));
            } else 
                stack.add(new Pair(chars[i], 1));

            if ((int)stack.peek().getValue()== k){
                int p = k;
                while (p>0){
                    stack.pop();
                    p--;
                }
            }


        }

        String res ="";
        while(!stack.isEmpty()){
            res = stack.pop().getKey() + res;
        }

        return res;
    }
}