public class LC287 {
    public int findDuplicate(int[] nums) {

        boolean[] appeared = new boolean[nums.length + 1];

        int answer = 0;
        for (int num : nums) {
            appeared[num] = !appeared[num];
            if (!appeared[num]) {
                answer = num;
                break;
            }
        }

        return answer;
    }
}
