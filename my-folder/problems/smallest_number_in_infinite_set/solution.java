class SmallestInfiniteSet {
PriorityQueue<Integer> pq ;
Set<Integer> ispresent;
Integer curmin;
    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        ispresent = new HashSet<>();
        curmin = 1;
    }
    
    public int popSmallest() {
        int ans= curmin;
        if (!pq.isEmpty()){
            ans = pq.poll();
            ispresent.remove(ans);
            
        } else {
            curmin +=1;
        }

        return ans;

    }
    
    public void addBack(int num) {
        if (curmin <= num)
            return;
        
        if (!ispresent.contains(num)){
            ispresent.add(num);
            pq.add(num);
        }   
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */