import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; ++i) {
            System.out.println(i + 1);
        }
    }
}
