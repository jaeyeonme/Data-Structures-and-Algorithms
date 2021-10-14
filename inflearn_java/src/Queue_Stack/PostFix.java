package Queue_Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위 연산식이 주어지면 연산한 결과를 출력한느 프로그램을 작성하세요.
 * ...
 */
class PostFix {
    public int solution (String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) stack.push(x - 48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt + rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        PostFix T = new PostFix();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();  // 후위식
        System.out.println(T.solution(str));
    }
}
