class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        

        for (int ast: asteroids){
            if (!st.isEmpty() && ( (ast> 0 && st.peek() > 0)  || (ast<0 && st.peek() < 0) || ast > 0 && st.peek() <0)){
                st.push(ast);
            } else if (!st.isEmpty()) {
                st.push(ast);
                while (st.size() >=2 && st.peek() < 0){
                    int top = (st.pop());
                    int next = st.pop();
                    if (next < 0 && top < 0)
                        {
                            st.push(next); st.push(top); 
                            break;
                        }

                    if (Math.abs(top) == next)
                        continue;
                    else{
                        int pushele =  (Math.abs(top) > next) ? top : next;
                        st.push(pushele);
                        
                    }
                       
                }
            } else if (st.isEmpty()) {
                st.push(ast);
            }
        }

        int [] ans = new int[st.size()];
        int i=0;
        for (int s: st)
            ans[i++] = s;

        return ans;
    }
}