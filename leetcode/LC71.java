import java.util.Stack;

public class LC71 {
    public String simplifyPath(String path) {
        while (path.length() != 0 && path.charAt(path.length() - 1) == '/') {
            path = path.substring(0, path.length() - 1);
        }
        while (path.length() != 0 && path.charAt(0) == '/') {
            path = path.substring(1);
        }

        if (path.length() == 0) {
            return "/";
        }

        Stack<String> stack = new Stack<>();
        String[] tokens = path.split("/");
        for (String token : tokens) {
            if (token.equals(".") || token.equals("")) {
                continue;
            }
            if (token.equals("..")) {
                if (stack.size() != 0) {
                    stack.pop();
                }
                continue;
            }

            stack.push(token);
        }

        if (stack.size() == 0) {
            return "/";
        }

        StringBuilder answer = new StringBuilder();
        for (String s : stack) {
            answer.append("/").append(s);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LC71().simplifyPath("/home/"));
        System.out.println(new LC71().simplifyPath("/../"));
        System.out.println(new LC71().simplifyPath("/home//foo/"));
        System.out.println(new LC71().simplifyPath("////////"));
    }
}
