class Solution {
    public String convert(String s, int numRows) {
        
        List<List<Character>> l=new ArrayList<>();
       if(numRows==1)return s;
       for(int i=0;i<numRows;i++)
       {
           l.add(new ArrayList<>());
       } 

        // int c = 0;
        int row = 0;
        boolean flag = true; // down
        for (int i = 0; i< s.length(); i++){

            
            l.get(row).add(s.charAt(i));
            if (flag)
                row++;
            else 
                row--;
            
            if (row == 0 || row == numRows-1)
                flag = flag == true ? false: true;
        }

        String ans ="";
        
        for (List l1 : l){

            for (int i=0; i< l1.size(); i++){
                ans += l1.get(i);
           }
        }

        return ans;

    }
}