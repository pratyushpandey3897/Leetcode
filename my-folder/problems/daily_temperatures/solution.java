class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] pos = new int[n];
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        HashMap<Integer,Integer> m = new HashMap<>();

        for (int i =0; i<n; i++){

            while (!stack.isEmpty() && temp[stack.peek()] < temp[i]){
                m.put(stack.peek(), i - stack.pop());
            }

            stack.push(i);
        }

        for (int i =0 ;i <n; i++){
            res[i] = m.getOrDefault(i,0);
        }

        return res;
    }
}