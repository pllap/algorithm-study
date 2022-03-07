import java.util.*;

public class CloneGraph {
    public Node cloneGraph(Node original) {
        if (Objects.isNull(original)) {
            return null;
        }

        // 맵에 복사본을 저장한다.
        Map<Integer, Node> map = new HashMap<>();
        map.put(original.val, new Node(original.val));
        // 오리지날을 이용해 bfs를 수행한다.
        Queue<Node> queue = new LinkedList<>();
        queue.add(original);
        while (queue.size() > 0) {
            // 큐에서 원본 노드를 꺼낸다.
            Node node = queue.poll();
            Node copied = map.get(node.val);
            for (Node neighbor : node.neighbors) {
                // 방문하지 않았으면 큐와 맵에 이웃 노드를 넣는다.
                if (!map.containsKey(neighbor.val)) {
                    queue.add(neighbor);
                    map.put(neighbor.val, new Node(neighbor.val));
                }
                copied.neighbors.add(map.get(neighbor.val));
            }
        }

        return map.get(original.val);
    }

    public static void main(String[] args) {
        Node[] nodes;

        nodes = new Node[]{new Node(1), new Node(2), new Node(3), new Node(4)};
        nodes[0].neighbors.add(nodes[1]); nodes[0].neighbors.add(nodes[3]);
        nodes[1].neighbors.add(nodes[0]); nodes[1].neighbors.add(nodes[2]);
        nodes[2].neighbors.add(nodes[1]); nodes[2].neighbors.add(nodes[3]);
        nodes[3].neighbors.add(nodes[0]); nodes[3].neighbors.add(nodes[2]);
        new CloneGraph().cloneGraph(nodes[0]);
    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
