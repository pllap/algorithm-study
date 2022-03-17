import java.util.Stack;

public class LC856 {
    public int scoreOfParentheses(String s) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(answer);
                answer = 0;
                continue;
            }

            answer = stack.pop() + Math.max(answer * 2, 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new LC856().scoreOfParentheses("()"));
        System.out.println(new LC856().scoreOfParentheses("(())"));
        System.out.println(new LC856().scoreOfParentheses("()()"));
        System.out.println(new LC856().scoreOfParentheses("(((())))"));
        System.out.println(new LC856().scoreOfParentheses("(()()())"));
        System.out.println(new LC856().scoreOfParentheses("(()(()))"));
    }
}
