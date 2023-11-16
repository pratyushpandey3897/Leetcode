class Solution {
    int n;
    Set<String> s;
    public String findDifferentBinaryString(String[] nums) {
        s = new HashSet<>();
        n = nums.length;
        for (String num: nums)
            s.add(num);
        return recurseGenerate("");
    }

    public String recurseGenerate(String curr){

        if (curr.length() == n){
            if (s.contains(curr))
                return "";
            return curr;
        }

        String res = recurseGenerate(curr+"1");
        if (res.length() > 0)
        return res;

        return recurseGenerate(curr+"0");
    }
}