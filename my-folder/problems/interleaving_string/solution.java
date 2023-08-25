class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {

        int s1len = s1.length(), s2len = s2.length();

        if (s1len + s2len != s3.length())
            return false;
        
        int dp [][] = new int [s1.length()+1][s2.length()+1];
        dp[s1len][s2len] = 1;

        return helper(0,0,dp , s1, s2, s3);
    }

    public boolean helper(int i, int j, int[][]dp, String s1,  String s2, String s3){

        int s1len = s1.length(), s2len = s2.length();
        if (i == s1len && j == s2len)
            return true;

        if (dp[i][j] != 0)
            return (dp [i][j] == 1? true : false);

        
        if (i < s1len && s1.charAt(i) == s3.charAt(i+j) && helper(i+1, j, dp, s1, s2, s3)){
            return true;
        }

        if (j < s2len && s2.charAt(j) == s3.charAt(i+j) && helper(i, j+1, dp, s1, s2, s3)){
            return true;
        }

        dp[i][j] = -1;
        return false;
             

    }
}