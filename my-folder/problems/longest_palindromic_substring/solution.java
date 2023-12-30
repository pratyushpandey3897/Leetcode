class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int []answer = new int[]{0,0};
        boolean dp[][] = new boolean[n][n];
        for (int i = 0; i< n ; i++)
            dp[i][i] = true;
        
        for (int i = 0; i< n-1 ; i++){
            dp[i][i+1] = (s.charAt(i) == s.charAt(i + 1));
            if (dp[i][i+1] == true) {
                answer[0] = i;
                answer[1] = i+1;
            }
        }

        for (int len = 3; len <= s.length(); len++){
            for (int i =0, j = i+len-1; j<n; ++j, ++i){
                dp[i][j] = dp[i+1][j-1] && (s.charAt(i) == s.charAt(j));
                if (dp[i][j])
                {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        int i = answer[0];
        int j = answer[1];

        return s.substring(i,j+1);

        

    }

    // public boolean check (int i, int j, String s){
    //     while (i<j){
    //         if (s.charAt(i) == s.charAt(j)){
    //             i++;
    //             j--;
    //         }
                
    //         else return false;
    //     }
    //     return true;
    // }
}