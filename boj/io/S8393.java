import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        if (n == 1) {
            System.out.println(1);
            return;
        }
        if (n % 2 == 1) {
            System.out.println((1 + n) * (n / 2) + n / 2 + 1);
        } else {
            System.out.println((1 + n) * n / 2);
        }
    }
}
