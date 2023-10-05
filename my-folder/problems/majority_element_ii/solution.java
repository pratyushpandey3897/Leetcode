class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        Integer king1 = null, king2 = null;
        int count1 = 0, count2 = 0;

        for (int n: nums){
            if (king1 != null && king1 == n)
                count1++;
            else if (king2 != null && king2 == n)
                count2++;
            else if (count1 == 0){
                king1 = n;
                count1++;
            } else if (count2 == 0){
                king2 = n; 
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int n: nums){
            if (king1 != null && n == king1) count1++;
            if (king2 != null && king2 == n) count2++;
        }

        if (count1 > nums.length/3) ans.add(king1);
if (count2 > nums.length/3) ans.add(king2);
        return ans;
    }
}