import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; ++i) {
            for (int j = n; j > i + 1; --j) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
