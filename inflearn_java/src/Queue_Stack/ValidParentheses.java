package Queue_Stack;

import java.util.Stack;

/**
 * String s가 주어집니다. s는 '(', ')', '{', '}', '[', ']'로 이루어집니다.
 * 유효한 괄호인지 체크하여 boolean값으로 리턴하세요.
 * ...
 */
public class ValidParentheses {
    public static void main(String[] args) {
//      String str = "()[]{}";  // true
//      String str = "{}";      // false;
        String exp = "([}}])";
        System.out.println(solve(exp));
    }

    public static boolean solve(String s) {

        // 1
        Stack<Character> stack = new Stack<>();

        // 2
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' ||
                s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}
