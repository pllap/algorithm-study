import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] tokens = bufferedReader.readLine().split(" ");

        int min = 1000000;
        int max = -1000000;
        for (int i = 0; i < n; ++i) {
            int val = Integer.parseInt(tokens[i]);
            min = Math.min(min, val);
            max = Math.max(max, val);
        }

        System.out.println(min + " " + max);
    }
}
