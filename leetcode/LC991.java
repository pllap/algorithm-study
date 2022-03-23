public class LC991 {
    public int brokenCalc(int startValue, int target) {
        int numOp = 0;
        while (true) {
            if (target < startValue) {
                return numOp + startValue - target;
            } else if (target > startValue) {
                if (target % 2 == 1) {
                    ++target;
                } else {
                    target /= 2;
                }
                ++numOp;
            } else {
                return numOp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new LC991().brokenCalc(2, 3));
        System.out.println(new LC991().brokenCalc(5, 8));
        System.out.println(new LC991().brokenCalc(3, 10));
        System.out.println(new LC991().brokenCalc(1, 1000000000));
    }
}
