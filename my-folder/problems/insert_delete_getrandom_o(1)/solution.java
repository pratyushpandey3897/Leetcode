import java.util.Random;
class RandomizedSet {

    Set<Integer> set;

    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if (set.contains(val))
            return false;
        set.add(val);
        return true;

    }
    
    public boolean remove(int val) {
        if (!set.contains(val))
            return false;
        
        set.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        int randomN = rand.nextInt(set.size());
        Integer[] array = new Integer[set.size()];
      //Converting Set object to integer array
        set.toArray(array);
        return array[randomN];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */