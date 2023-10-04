class MyHashMap {
    int [] mainmap;

    public MyHashMap() {
        mainmap = new int[1000001];
        Arrays.fill(mainmap,-1);
    }
    
    public void put(int key, int value) {
        mainmap[key] = value;
    }
    
    public int get(int key) {
        

        return ( mainmap[key] != -1 ? mainmap[key]: -1);
    }
    
    public void remove(int key) {
        mainmap[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */