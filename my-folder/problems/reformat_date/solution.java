class Solution {
    public String reformatDate(String date) {

        String [] arr = date.split(" ");
        String d = arr[0];
        String month = arr[1];
        String year = arr[2];

        StringBuilder ans = new StringBuilder();
        ans.append(year+"-");

        ans.append(getMonth(month) + "-");


        String day = d.substring(0,d.length()-2);

        if (day.length() == 1)
            ans.append("0"+day);
        else 
            ans.append(day);

        return ans.toString();
        
    }

    public String getMonth(String month){

        switch (month) {
        case "Jan":
            return "01";
        case "Feb":
            return "02";
        case "Mar":
            return "03";
        case "Apr":
            return "04";
        case "May":
            return "05";
        case "Jun":
            return "06";
        case "Jul":
            return "07";
        case "Aug":
            return "08";
        case "Sep":
            return "09";
        case "Oct":
            return "10" ;
        case "Nov":
            return "11";
        case "Dec":
            return "12";
        }

        return "";
    }
}