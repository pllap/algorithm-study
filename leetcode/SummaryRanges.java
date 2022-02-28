import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {

        if (nums.length == 0) {
            return new ArrayList<>();
        }

        List<String> answer = new ArrayList<>();

        int start = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[i - 1] + 1) {
                addToAnswer(answer, start, nums[i - 1]);
                start = nums[i];
            }
        }
        addToAnswer(answer, start, nums[nums.length - 1]);

        return answer;
    }
    
    private void addToAnswer(List<String> answer, int start, int end) {
        if (start == end) {
            answer.add(String.valueOf(start));
        } else {
            answer.add(start + "->" + end);
        }
    }

    public static void main(String[] args) {
        int[] nums;

        nums = new int[]{0, 1, 2, 4, 5, 7};
        System.out.println(new SummaryRanges().summaryRanges(nums));

        nums = new int[]{0, 2, 3, 4, 6, 8, 9};
        System.out.println(new SummaryRanges().summaryRanges(nums));
    }
}
