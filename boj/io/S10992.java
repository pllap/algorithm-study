import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n - 1; ++i) {
            System.out.print(" ");
        }
        System.out.println("*");

        for (int i = 1; i < n; ++i) {
            for (int j = 1; j < n - i; ++j) {
                System.out.print(" ");
            }
            if (i < n - 1) {
                System.out.print("*");
                for (int j = 1; j < 2 * i; ++j) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else {
                for (int j = 0; j < n * 2 - 1; ++j) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
od