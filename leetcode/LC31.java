import java.util.Arrays;

public class LC31 {
    public void nextPermutation(int[] nums) {
        // 뒤에서부터
        // 왼쪽>=오른쪽인(즉, 감소하는) 구간의 길이를 잰다
        int pivot = nums.length - 1;
        while (pivot > 0 && nums[pivot - 1] >= nums[pivot]) {
            --pivot;
        }
        --pivot;

        // 끝까지 왔으면 (숫자가 줄어들기만 하면) 배열을 뒤집고 끝낸다
        if (pivot < 0) {
            reverseSubarray(nums, 0, nums.length - 1);
            return;
        }

        // 구간에서 nums[pivot]보다 큰 값 중 가장 오른쪽에 있는 원소를 찾는다
        int successor = nums.length;
        while (successor > pivot) {
            if (nums[--successor] > nums[pivot]) {
                break;
            }
        }
        // 찾은 원소와 pivot에 있는 원소를 스왑한 뒤
        swap(nums, pivot, successor);
        // pivot 뒷 부분을 뒤집는다
        reverseSubarray(nums, pivot + 1, nums.length - 1);
    }

    void reverseSubarray(int[] sub, int start, int end) {
        while (start < end) {
            swap(sub, start++, end--);
        }
    }

    void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] nums;

        nums = new int[]{1,2,3};
        new LC31().nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // 1 3 2

        nums = new int[]{3,2,1};
        new LC31().nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // 1 2 3

        nums = new int[]{1,1,5};
        new LC31().nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // 1 5 1

        nums = new int[]{1,5,5};
        new LC31().nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // 5 1 5

        nums = new int[]{1,3,2};
        new LC31().nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // 2 1 3

        nums = new int[]{2,3,1};
        new LC31().nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // 3 1 2
    }
}
