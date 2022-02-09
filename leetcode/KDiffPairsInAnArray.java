import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class KDiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        int answer = 0;

        // k가 0이라면, 같은 수가 있는지만 찾으면 된다.
        if (k == 0) {
            Map<Integer, Integer> count = new HashMap<>();
            for (int num : nums) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
            for (int val : count.values()) {
                if (val > 1) {
                    answer++;
                }
            }
            return answer;
        }

        // 일반적인 경우
        // i - j = k이면 i = j + k인 것을 이용한다.
        // set에 i를 넣는다.
        Set<Integer> base = new HashSet<>();
        for (int num : nums) {
            base.add(num);
        }

        // set에서 i와 같은 j + k를 찾는다.
        for (int b : base) {
            if (base.contains(b + k)) {
                answer++;
            }
        }

        return answer;
    }

    // 시도 1. O(n^2)
    public int findPairs1(int[] nums, int k) {
        Set<Pair> answers = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    answers.add(new Pair(nums[i], nums[j]));
                }
            }
        }
        return answers.size();
    }
}

class Pair {
    private int i;
    private int j;

    public Pair(int i, int j) {
        this.i = Math.min(i, j);
        this.j = Math.max(i, j);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return i == pair.i && j == pair.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }
}
