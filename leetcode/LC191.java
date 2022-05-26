public class LC191 {

    public int hammingWeight(int n) {
        int copied = n;
        int result = 0;
        while (copied != 0) {
            if ((copied & 1) == 1) {
                ++result;
            }
            copied >>>= 1;
        }
        return result;
    }

}
