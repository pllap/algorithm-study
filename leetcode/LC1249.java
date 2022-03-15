import java.util.Stack;

public class LC1249 {
    public String minRemoveToMakeValid(String s) {
        int numOpened = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.add(c);
                numOpened++;
                continue;
            }
            if (c == ')') {
                if (numOpened > 0) {
                    stack.add(c);
                    numOpened--;
                }
                continue;
            }
            stack.add(c);
        }

        for (int i = stack.size() - 1; i > -1; --i) {
            if (numOpened > 0) {
                if (stack.get(i) == '(') {
                    stack.remove(i);
                    numOpened--;
                }
                continue;
            }
            break;
        }

        StringBuilder answer = new StringBuilder();
        for (char c : stack) {
            if (c == '(' && numOpened > 0) {
                numOpened--;
                continue;
            }
            if (c == ')' && numOpened < 0) {
                numOpened++;
                continue;
            }
            answer.append(c);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LC1249().minRemoveToMakeValid("lee(t(c)o)de)"));
        System.out.println(new LC1249().minRemoveToMakeValid("a)b(c)d"));
        System.out.println(new LC1249().minRemoveToMakeValid("))(("));
        System.out.println(new LC1249().minRemoveToMakeValid("()"));
        System.out.println(new LC1249().minRemoveToMakeValid("((s(("));
        System.out.println(new LC1249().minRemoveToMakeValid("))s))"));
        System.out.println(new LC1249().minRemoveToMakeValid("())()((("));
    }
}
