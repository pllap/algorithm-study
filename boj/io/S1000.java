import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bufferedReader.readLine().split(" ");

        int A = Integer.parseInt(line[0]);
        int B = Integer.parseInt(line[1]);

        System.out.println(A + B);
    }
}
