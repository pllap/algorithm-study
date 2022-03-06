import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        if (n == 1) {
            System.out.println("1");
            return;
        }

        int[] mem = new int[n + 1];
        mem[1] = 1;
        mem[2] = 2;
        for (int i = 3; i < n + 1; ++i) {
            mem[i] = (mem[i - 2] + mem[i - 1]) % 10007;
        }

        System.out.println(mem[n]);
    }
}
