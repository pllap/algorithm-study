import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        int[] mem = new int[11];
        mem[1] = 1;
        mem[2] = 2;
        mem[3] = 4;
        for (int i = 4; i < 12; ++i) {
            mem[i] = mem[i - 3] + mem[i - 2] + mem[i - 1];
        }

        for (int i = 0; i < t; ++i) {
            System.out.println(mem[Integer.parseInt(bufferedReader.readLine())]);
        }
    }
}
