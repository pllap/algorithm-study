public class LC7 {
    public int reverse(int x) {

        long reversed = 0;
        while (x != 0) {
            reversed *= 10;
            reversed += x % 10;
            x /= 10;
        }

        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) reversed;
    }

    public static void main(String[] args) {
        System.out.println(new LC7().reverse(123));
        System.out.println(new LC7().reverse(-123));
        System.out.println(new LC7().reverse(120));
        for (int i = -100; i < 100; ++i) {
            System.out.println(new LC7().reverse(i));
        }
    }
}
