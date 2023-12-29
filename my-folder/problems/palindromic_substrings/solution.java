class Solution {
    public int countSubstrings(String s) {
        // int count =0;
        // for (int i = s.length() ;i >0; i--){
        //     for (int j = 0; j<= s.length()-i; j++){
        //         StringBuilder a = new StringBuilder(s.substring(j,j+i));
        //         a.reverse();
        //         if ((s.substring(j,j+i)).compareTo(a.toString()) == 0)
        //             count++;
        //     }
        // }

        // return count;

        int len = s.length();
        if(len<=0)
        return 0;
        int answer=0;
        boolean[][] dp = new boolean[len][len];

        //base case
        for (int i =0 ; i< len; i++){
            dp[i][i] = true;
            answer++;
        }
        for (int i =0 ; i< len-1; i++){
            dp[i][i+1] = s.charAt(i)==s.charAt(i+1);
            if (s.charAt(i)==s.charAt(i+1)) answer++;
        }

        for (int l = 3; l<=len; l++){
            for (int m = 0, n = m+l-1; n<len; ++m, ++n){
                dp[m][n] = dp[m+1][n-1] && s.charAt(m) == s.charAt(n);
                if (dp[m][n])
                answer++;
            }
        }

        return answer;

    }
}