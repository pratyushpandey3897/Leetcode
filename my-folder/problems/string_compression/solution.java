class Solution {
    public int compress(char[] chars) {
        
        
        int count = 1;
        String str = "";
        
        str+= chars[0];
        
        for (int i =1 ; i < chars.length; i++){
            
            if (chars[i] == chars[i-1] ){
                
                if (i == chars.length-1)
                    str+= ++count;
                else
                    count++;
               
            } else{
                if (count !=1)
                    str += count;
                str += chars[i];
                count = 1;
            }
        }
        System.out.println(str);
        
        for (int i =0; i<str.length() ; i++){
            chars[i] = str.charAt(i);
        }
        
        return str.length();
    }
}