import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        long[] mem = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        for (int i = 2; i <= n; ++i) {
            long[] next = new long[10];
            next[0] = mem[1] % 1000000000;
            for (int j = 1; j < 9; ++j) {
                next[j] = (mem[j - 1] + mem[j + 1]) % 1000000000;
            }
            next[9] = mem[8] % 1000000000;
            System.arraycopy(next, 0, mem, 0, 10);
        }

        long sum = 0;
        for (long m : mem) {
            sum = sum + m;
        }
        System.out.println(sum % 1000000000);
    }
}
