import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        int i = 0;
        for (i = 0; i + 10 < line.length(); i += 10) {
            System.out.println(line.substring(i, i + 10));
        }
        System.out.println(line.substring(i));
    }
}
