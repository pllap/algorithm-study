import java.util.Stack;

public class LC946 {
    
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pushedIndex = 0;
        int poppedIndex = 0;

        while (pushedIndex < pushed.length) {
            stack.push(pushed[pushedIndex++]);
            while (stack.size() != 0 && stack.peek() == popped[poppedIndex]) {
                stack.pop();
                poppedIndex++;
            }
        }

        return poppedIndex == popped.length;
    }

    public static void main(String[] args) {
        System.out.println(new LC946().validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
    }
}
