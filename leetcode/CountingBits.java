import java.util.Arrays;

public class CountingBits {

    public int[] countBits(int n) {

        if (n == 0) {
            return new int[]{0};
        }

        int[] mem = new int[n + 1];
        for (int i = 1; i < n + 1; ++i) {
            mem[i] = -1;
        }

        int count = 0;
        while (true) {
            for (int i = 1; i < n + 1; ++i) {
                int numBit = calcNumBit(i);
                for (int j = 1; j * i < n + 1; ++j) {
                    if (mem[i] != -1) {
                        continue;
                    }
                    mem[i] = numBit;
                    ++count;
                    if (count == n) {
                        return mem;
                    }
                }
            }
        }
    }

    private int calcNumBit(int n) {
        int num = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                ++num;
            }
            n = n / 2;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CountingBits().countBits(2)));
        System.out.println(Arrays.toString(new CountingBits().countBits(5)));
        System.out.println(Arrays.toString(new CountingBits().countBits(0)));
    }
}
