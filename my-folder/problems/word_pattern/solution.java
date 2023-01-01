class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap <Character, String> map = new HashMap<>();
        HashMap <String, Character> map2 = new HashMap<>();

        String [] inpu_string = s.split(" ");

        if (inpu_string.length != pattern.length())
            return false;
        boolean flag = true;
        for (int i =0;i <inpu_string.length; i++){

            Character patt_ele = pattern.charAt(i);

            System.out.print(inpu_string[i] +" ");
            System.out.print(patt_ele +" ");
            System.out.print(map.get(patt_ele) +" ");

            

            if (map.containsKey(patt_ele) && map.get(patt_ele).equals(inpu_string[i]) ) {

                continue;
            } else if ( (map.containsKey(patt_ele) && !map.get(patt_ele).equals(inpu_string[i]) ) 
                        || ( map2.containsKey(inpu_string[i]) && map2.get(inpu_string) != (patt_ele)) ){

                return false;
            } else {


                
                map.put(patt_ele, inpu_string[i]);
                map2.put(inpu_string[i], patt_ele);
            }
            
        }

        return true;
    }
}