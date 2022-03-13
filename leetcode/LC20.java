import java.util.Stack;

public class LC20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
                continue;
            }

            if (c == ')') {
                if (stack.size() == 0 || stack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.size() == 0 || stack.pop() != '{') {
                    return false;
                }
            } else if (c == ']') {
                if (stack.size() == 0 || stack.pop() != '[') {
                    return false;
                }
            }
        }

        return stack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(new LC20().isValid("()"));
        System.out.println(new LC20().isValid("]"));
    }
}
