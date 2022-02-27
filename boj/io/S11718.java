import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = bufferedReader.readLine();
            if (null == line) {
                return;
            }
            System.out.println(line);
        }
    }
}
