import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2558 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(bufferedReader.readLine());
        int B = Integer.parseInt(bufferedReader.readLine());

        System.out.println(A + B);
    }
}
