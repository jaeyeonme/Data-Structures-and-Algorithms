package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다.
 * 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다.
 * 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다.
 * ...
 */
public class Java_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int i;
        while (n --> 0) {
            boolean isVPS = true;
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();

            char tmp;
            for (i = 0; i < input.length(); i++) {
                tmp = input.charAt(i);

                if (tmp == '(') {
                    // 여는 괄호는 stack push하여 담는다.
                    stack.push(tmp);
                } else if (tmp == ')') {
                    // 닫는 괄호가 나온 경우 stack의 맨 위의 값이 여는괄호인지 비교한다.
                    if (!stack.isEmpty()) {
                        // stack이 비어있지 않고 맨위값이 여는 괄호라면 stack의 맨 위값을 pop한다.
                        stack.pop();
                    } else {
                        isVPS = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) isVPS = false;
            if (isVPS) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
