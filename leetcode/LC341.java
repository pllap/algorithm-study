import java.util.*;

public class LC341 {

    static class NestedIterator implements Iterator<Integer> {

        private List<Integer> simpleList;
        private int length;
        private int index;

        public NestedIterator(List<NestedInteger> nestedList) {
            simpleList = new ArrayList<>();
            index = -1;
            parseList(nestedList);
            length = simpleList.size();
        }

        private void parseList(List<NestedInteger> nestedList) {
            for (NestedInteger nestedInteger : nestedList) {
                if (nestedInteger.isInteger()) {
                    simpleList.add(nestedInteger.getInteger());
                } else {
                    parseList(nestedInteger.getList());
                }
            }
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                return simpleList.get(++index);
            }
            return -1;
        }

        @Override
        public boolean hasNext() {
            return index + 1 < length;
        }
    }

    interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }
}
