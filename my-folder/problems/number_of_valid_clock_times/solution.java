class Solution {
    public int countTime(String time) {
        String [] hourMinute = time.split(":");
        String hour = hourMinute[0];
        String minutes = hourMinute[1];

        int hourcount = 1;
        int minutecount = 1;
        if (hour.charAt(0) == '?'){
            if (hour.charAt(1) == '?'){
                hourcount *= 24;
            } else if (hour.charAt(1) > '3'){
                hourcount *= 2;
            } else {
                hourcount *= 3;
            }
             
        } else if (hour.charAt(0) == '0' || hour.charAt(0) == '1' ){
            if (hour.charAt(1) == '?'){
                hourcount *= 10;
            } 
        } else {
            if (hour.charAt(1) == '?'){
                hourcount *= 4;
            } 
        }

        System.out.println("hourcount " + hourcount);
        if (minutes.charAt(0) == '?'){
            
                minutecount *= 6;
            } 
         if (minutes.charAt(1) == '?') {
                minutecount *= 10;
            }
        
        System.out.println("minutecount " + minutecount);
        int res = minutecount * hourcount;
        return res;
        
        
        
    }
}