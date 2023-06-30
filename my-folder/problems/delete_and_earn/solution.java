class Solution {
    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num: nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        int [] arr = new int[freq.size()];
        int p =0;
        for (int num : freq.keySet()){ // removing duplicates and storing in arr
            arr[p++] = num;
        }

        int earn1 =0 , earn2 =0;
        Arrays.sort(arr);

        for (int i =0; i< arr.length; i++){
            int curEarn = freq.get(arr[i]) * arr[i];

            if (i > 0 && arr[i] == arr[i-1] +1) {
                int c = Math.max(curEarn + earn1, earn2);
                earn1 = earn2;
                earn2 = c;
            } else {
                int c = curEarn+earn2;
                earn1 = earn2;
                earn2 = c;
            }
        }

        return earn2;
        
    }
}