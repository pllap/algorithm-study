public class SingleNumber {
    public int singleNumber(int[] nums) {
        // 모든 원소가 두 번씩 등장, 유일하게 한 번만 등장하는 원소 찾기
        int answer = 0;
        for (int num : nums) {
            answer = answer ^ num;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums;
        
        nums = new int[]{2, 2, 1};
        System.out.println(new SingleNumber().singleNumber(nums));

        nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(new SingleNumber().singleNumber(nums));
    }
}
