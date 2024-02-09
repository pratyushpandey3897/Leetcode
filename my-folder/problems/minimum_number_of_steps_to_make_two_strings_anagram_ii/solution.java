class Solution {
    public int minSteps(String s, String t) {
        
        //s = "leetcode", t = "coats"
        // cdeeelot acost
        // as        deeelt
        char [] a = s.toCharArray();
        Arrays.sort(a);
        System.out.println(s);
        
        char [] b = t.toCharArray();
        Arrays.sort(b);
        System.out.println(t);
        
        int cnt = 0;
        int si= 0, ti =0;
        while (si<a.length && ti < b.length){
            if (a[si] == b[ti]){
                si++; ti++;
                
            }
            else if (a[si] < b[ti]){
                si++;
                cnt++;
            } else
            {
                ti++;
                cnt++;
            }
        }
        
        if (si < s.length())
            cnt += s.length() - si;
        if (ti < t.length())
            cnt += t.length() - ti;
        
        return cnt;
    }
}