/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    List<Integer> flatList ;
    int pointer;
    public NestedIterator(List<NestedInteger> nestedList) {
        flatList = new ArrayList<>();
        pointer = 0;
        recurseHelper(nestedList);
    }

    public void recurseHelper(List<NestedInteger> nestedList){
        for (NestedInteger n : nestedList){
            if (n.isInteger()){
                flatList.add(n.getInteger());
            } else {
                recurseHelper(n.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return flatList.get(pointer++);
        
    }

    @Override
    public boolean hasNext() {
        if (pointer >= flatList.size())
            return false;
        return true;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */