import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1924 {
    public static void main(String[] args) throws IOException {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekdays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = bufferedReader.readLine().split(" ");
        int month = Integer.parseInt(tokens[0]);
        int date = Integer.parseInt(tokens[1]);
        for (int i = 0; i < month; ++i) {
            date += days[i];
        }
        System.out.println(weekdays[date % 7]);
    }
}
