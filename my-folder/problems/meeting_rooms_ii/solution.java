class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        // Arrays.sort(intervals, new Comparator<int[]>() {
            
        //     public int compare(int[] a, int[] b){
        //         return a[0]-b[0];
        //     }
        // });

        // PriorityQueue<Integer> room = new PriorityQueue<Integer>();

        // room.add(intervals[0][1]);

        // for (int i =1; i< intervals.length; i++){
        //     if (intervals[i][0] >= room.peek() )
        //          room.poll();

        //     room.add(intervals[i][1]);
        // }

        // return room.size();

        int[] starttime = new int[intervals.length];
        int[] endtime = new int[intervals.length];

        for (int i = 0; i< intervals.length; i++){ // n
            starttime[i] = intervals[i][0];
            endtime[i] = intervals[i][1];
        }

        Arrays.sort(starttime);  //nlogn
        Arrays.sort(endtime);
        int roomsneeded = 0;
        int startptr = 0, endptr =0;
        for ( ; startptr<intervals.length; startptr++){ // n
            if (starttime[startptr] < endtime[endptr])
                roomsneeded++;

            else 
                endptr++;
        }

        return roomsneeded;

    
    }
}