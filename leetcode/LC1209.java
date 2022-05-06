import java.util.Stack;

public class LC1209 {

    public String removeDuplicates(String s, int k) {
        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        for (char ch : chars) {
            int count = 1;
            if (!stack.isEmpty() && stack.peek() == ch) {
                count = counts.peek() + 1;
            }

            if (count == k) {
                for (int d = 1; d < k; ++d) {
                    stack.pop();
                    counts.pop();
                }
                continue;
            }

            stack.push(ch);
            counts.push(count);
        }

        StringBuilder answer = new StringBuilder();
        stack.forEach(answer::append);
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LC1209().removeDuplicates("abcd", 2));
        System.out.println(new LC1209().removeDuplicates("deeedbbcccbdaa", 3));
    }
}
