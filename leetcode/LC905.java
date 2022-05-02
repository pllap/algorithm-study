public class LC905 {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int left = -1;
        int right = nums.length;
        for (int num : nums) {
            if ((num & 1) == 0) {
                result[++left] = num;
            } else {
                result[--right] = num;
            }
        }
        return result;
    }
}
