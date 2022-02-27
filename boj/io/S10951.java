import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class S10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = bufferedReader.readLine();
            if (Objects.isNull(line)) {
                return;
            }
            String[] tokens = line.split(" ");
            System.out.println(Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]));
        }
    }
}
