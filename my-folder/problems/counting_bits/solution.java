class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 0;i <= n; i ++){
            ans[i] = countbits(i);
        }

        return ans;
    }

    public int countbits (int num){
        int cnt = 0;
        while (num != 0){
            cnt ++;
            num = num& (num-1);
        }
        return cnt;
    }
}