import java.util.*;

public class LC1202 {

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        // union-find
        int length = s.length();
        int[] parents = new int[length];
        for (int i = 0; i < length; ++i) {
            parents[i] = i;
        }

        // for each pair, make union
        for (List<Integer> pair : pairs) {
            union(parents, pair.get(0), pair.get(1));
        }

        // find union of each character
        // put its index in the map, using root index as the key
        Map<Integer, PriorityQueue<Character>> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < length; ++i) {
            int root = findRoot(parents, i);
            map.putIfAbsent(root, new PriorityQueue<>());
            map.get(root).offer(chars[i]);
        }

        // polling from pq of each union
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; ++i) {
            sb.append(map.get(findRoot(parents, i)).poll());
        }
        return sb.toString();
    }

    void union(int[] parents, int idx1, int idx2) {
        int root1 = findRoot(parents, idx1);
        int root2 = findRoot(parents, idx2);
        if (root1 < root2) {
            parents[root2] = root1;
        } else {
            parents[root1] = root2;
        }
    }

    int findRoot(int[] parents, int index) {
        while (parents[index] != index) {
            parents[index] = parents[parents[index]];
            index = parents[index];
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new LC1202().smallestStringWithSwaps("dcab", List.of(List.of(0,3), List.of(1,2))));
    }
}
