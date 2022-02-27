import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; ++i) {
            String[] tokens = bufferedReader.readLine().split(" ");
            System.out.println(Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]));
        }
    }
}
