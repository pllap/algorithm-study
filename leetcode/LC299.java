public class LC299 {

    public String getHint(String secret, String guess) {
        int a = 0;
        int b = 0;

        int length = secret.length();
        int[] secretChars = new int[26];
        int[] guessChars = new int[26];
        for (int i = 0; i < length; ++i) {
            ++secretChars[secret.charAt(i) - '0'];
            ++guessChars[guess.charAt(i) - '0'];
        }

        for (int i = 0; i < 26; ++i) {
            if (secretChars[i] != 0 && guessChars[i] != 0) {
                b += Math.min(secretChars[i], guessChars[i]);
            }
        }

        for (int i = 0; i < length; ++i) {
            if (secret.charAt(i) == guess.charAt(i)) {
                ++a;
                --b;
            }
        }

        return a + "A" + b + "B";
    }

    public static void main(String[] args) {
        System.out.println(new LC299().getHint("1807", "7810"));
    }
}
