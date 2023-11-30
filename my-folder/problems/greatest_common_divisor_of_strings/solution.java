class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        int lens1 = str1.length();
        int lens2 = str2.length();
        String base = lens1>lens2 ? (str1) : (str2);

        while(base.length()>0){

            if(str1.length()% base.length() >0 || str2.length()% base.length() > 0){
                base = base.substring(0,base.length()-1);
                continue;
            }

            if ( str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty() )
                return base.toString();
            base = base.substring(0,base.length()-1);
        }

        return "";
    }
}