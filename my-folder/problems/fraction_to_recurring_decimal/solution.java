class Solution {
    public String fractionToDecimal(int numeratori, int denominatori) {
        StringBuilder ans = new StringBuilder();
        
        if (numeratori == 0)
            return "0";

        if (numeratori < 0 ^ denominatori <0){
            ans.append("-");
        }

        long numerator = (long)Math.abs(Long.valueOf(numeratori));
        long denominator = (long)Math.abs(Long.valueOf(denominatori));
        long wholepart = (long)numerator/ Long.valueOf(denominator);
        ans.append(wholepart);
        long remainder = numerator % denominator;

        if (remainder !=0){
            ans.append(".");
            Map<Long, Integer> recurr = new HashMap<>();
            while (remainder != 0){

                if (recurr.containsKey(remainder)){
                    ans.insert(recurr.get(remainder), "(");
                    ans.append(")");
                    break;
                }

                recurr.put(remainder, ans.length());
                remainder *= 10;
                ans.append((remainder/(long)denominator));
                remainder %= (long)denominator;
                
            }
        }
        return ans.toString();
        
        
    }
}