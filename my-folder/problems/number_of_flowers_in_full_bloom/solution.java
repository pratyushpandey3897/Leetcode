class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        
        int[] peopleSorted = Arrays.copyOf(people, people.length);
        Arrays.sort(peopleSorted);

        Arrays.sort(flowers, (a,b) -> Integer.compare(a[0], b[0]));
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int flowerptr = 0;
        for (int i = 0; i<peopleSorted.length; i++){
            int person = peopleSorted[i];
            while (flowerptr<flowers.length && flowers[flowerptr][0] <= person){
                heap.add(flowers[flowerptr][1]); // adding end time in heap
                flowerptr++;
            }

            while (!heap.isEmpty() && heap.peek()< person){
                heap.remove(); // remove all the flowers with end time before the person arrived
            }
            map.put(person, heap.size());
        }

        int ans[] = new int[people.length];
        for (int i = 0; i<people.length; i++){
            ans[i] = map.get(people[i]);
        }

        return ans;
    }
}