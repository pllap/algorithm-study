public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int i = 0;
        int iNew = 0;
        while (i < nums.length - 1) {
            // 현재 인덱스와 다음 인덱스를 비교해서 달라지면 한 번만 등장하는 원소, 1개 추가
            if (nums[i] != nums[i + 1]) {
                nums[iNew++] = nums[i++];
            }
            // 같으면 두 번 이상 등장하는 원소, 2개 추가
            else {
                nums[iNew++] = nums[iNew++] = nums[i++];
                // 값이 달라질 때까지 인덱스를 옮긴다
                while (i < nums.length && nums[i] == nums[i - 1]) {
                    ++i;
                }
            }
        }

        // 끝까지 왔으면 하나가 남았다는 뜻이므로 추가해 준다
        if (i == nums.length - 1) {
            nums[iNew++] = nums[nums.length - 1];
        }

        return iNew;
    }

    public static void main(String[] args) {
        int[] nums;

        nums = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(new RemoveDuplicatesFromSortedArrayII().removeDuplicates(nums));

        nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(new RemoveDuplicatesFromSortedArrayII().removeDuplicates(nums));
    }
}
