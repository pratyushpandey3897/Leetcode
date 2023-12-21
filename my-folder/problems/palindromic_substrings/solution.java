class Solution {
    public int countSubstrings(String s) {
        int count =0;
        for (int i = s.length() ;i >0; i--){
            for (int j = 0; j<= s.length()-i; j++){
                StringBuilder a = new StringBuilder(s.substring(j,j+i));
                a.reverse();
                if ((s.substring(j,j+i)).compareTo(a.toString()) == 0)
                    count++;
            }
        }

        return count;
    }
}