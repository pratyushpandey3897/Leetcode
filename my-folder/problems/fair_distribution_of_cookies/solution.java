class Solution {
    public int distributeCookies(int[] cookies, int k) {
        int [] distribute = new int[k];
        return dfs (0, distribute, cookies, k, k);

    }

    public int dfs (int i, int[] distribute , int[] cookies, int k, int zero_count){
        if (cookies.length -i < zero_count)
            return Integer.MAX_VALUE;

        if (i == cookies.length){
            int unfairness = Integer.MIN_VALUE;
            for (int val : distribute)
                unfairness = Math.max(unfairness, val);
            
            return unfairness;
        }

        int answer = Integer.MAX_VALUE;

        for (int j =0; j < k; j++){
            if (distribute[j] == 0){
                zero_count -= 1;
            }
            distribute[j] += cookies[i];

            // recursion
            answer = Math.min(answer, dfs(i+1, distribute, cookies, k, zero_count));

            // if max value is returned then asnwer is equal to answer and we backtrack
            distribute[j] -= cookies[i];
            if (distribute[j] == 0){
                zero_count += 1;
            }

        }
        return answer;

        
    }
}