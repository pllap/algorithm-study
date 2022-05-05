import java.util.LinkedList;
import java.util.Queue;

public class LC225 {

    Queue<Integer> queueA;
    Queue<Integer> queueB;

    public LC225() {
        this.queueA = new LinkedList<>();
        this.queueB = new LinkedList<>();
    }

    public void push(int x) {
        Queue<Integer> queueA;
        Queue<Integer> queueB;
        if (this.queueA.isEmpty()) {
            queueA = this.queueA;
            queueB = this.queueB;
        } else {
            queueA = this.queueB;
            queueB = this.queueA;
        }

        queueA.offer(x);
        while (!queueB.isEmpty()) {
            queueA.offer(queueB.poll());
        }
    }

    public int pop() {
        Queue<Integer> queueA;
        if (this.queueB.isEmpty()) {
            queueA = this.queueA;
        } else {
            queueA = this.queueB;
        }

        if (queueA.isEmpty()) {
            return -1;
        }
        return queueA.poll();
    }

    public int top() {
        Queue<Integer> queueA;
        if (this.queueB.isEmpty()) {
            queueA = this.queueA;
        } else {
            queueA = this.queueB;
        }

        if (queueA.isEmpty()) {
            return -1;
        }
        return queueA.peek();
    }

    public boolean empty() {
        return queueA.isEmpty() && queueB.isEmpty();
    }
}
