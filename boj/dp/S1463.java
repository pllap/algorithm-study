import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class S1463 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int[] mem = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            mem[i] = Integer.MAX_VALUE;
        }

        for (int i = n; i > 0; --i) {
            if (i % 3 == 0) {
                mem[i / 3] = Math.min(mem[i / 3], mem[i] + 1);
            }
            if (i % 2 == 0) {
                mem[i / 2] = Math.min(mem[i / 2], mem[i] + 1);
            }
            mem[i - 1] = Math.min(mem[i - 1], mem[i] + 1);
        }

        System.out.println(mem[1]);
    }

    // queue
    public static void main1(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int[] mem = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            mem[i] = -1;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        while (!queue.isEmpty()) {
            int num = queue.remove();
            if (num % 3 == 0 && (mem[num / 3] == -1 || mem[num] + 1 < mem[num / 3])) {
                mem[num / 3] = mem[num] + 1;
                queue.add(num / 3);
            }
            if (num % 2 == 0 && (mem[num / 2] == -1 || mem[num] + 1 < mem[num / 2])) {
                mem[num / 2] = mem[num] + 1;
                queue.add(num / 2);
            }
            if (num > 1 && mem[num - 1] == -1 || mem[num] + 1 < mem[num - 1]) {
                mem[num - 1] = mem[num] + 1;
                queue.add(num - 1);
            }
        }

        System.out.println(mem[1]);
    }
}
