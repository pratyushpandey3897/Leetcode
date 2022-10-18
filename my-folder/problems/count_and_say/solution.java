class Solution {
    public String countAndSay(int n) {
        
        if (n == 1)
            return "1";
        
        System.out.println(n);
        String s = countAndSay(n-1);
        String output = say(countSay(s));
        return output;
    }
    
    public List<String[]> countSay(String input) {
    
        input += "#";
        List<String[]> l = new ArrayList<>();
        
        char start = input.charAt(0);
        int count = 1;
        int i =1;
        
        for (; i< input.length(); i++){
            if (input.charAt(i) != input.charAt(i-1)){
                l.add(new String[]{String.valueOf(input.charAt(i-1)), String.valueOf(count)});
                count = 1;
            } else
                count++;
        }
        return l;
        
    }
    
    public String say(List<String[]> l) {
        String str ="";
        for (int i =0; i<l.size(); i++){
            
            str += l.get(i)[1]+l.get(i)[0];
            
        }
        
        return str;
        
    }
    
}