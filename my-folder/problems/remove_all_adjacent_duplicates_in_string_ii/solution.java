class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<Pair> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i=0; i< chars.length; i++){
                
            if (!stack.isEmpty() && stack.peek().getKey().equals(chars[i])){ // if repeated elements
                // stack.add(new Pair(stack.peek().getKey(), (int)stack.peek().getValue() +1));
                int currValue = (int)stack.peek().getValue();
                stack.pop();
                stack.add(new Pair(chars[i], currValue+1));
            } else 
                stack.add(new Pair(chars[i], 1));

            if ((int)stack.peek().getValue()== k){
                // int p = k;
                // while (p>0){
                //     stack.pop();
                //     p--;
                // }

                stack.pop();
            }
        }

        String res ="";
        while(!stack.isEmpty()){
            int freq = (int)stack.peek().getValue();
            String appendKey = String.valueOf(stack.peek().getKey()); 

            while (freq>0) {
                res = appendKey + res;
                freq--;
            }
            stack.pop();
        }

        return res;
    }
}