import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        while (n > 0) {
            System.out.println(n--);
        }
    }
}
