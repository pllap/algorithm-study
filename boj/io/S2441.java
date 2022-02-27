import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print(" ");
            }
            for (int j = i; j < n; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
