package Queue_Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 여러 개의 쇠막대기를 레이저로 절단하려고 한다. 효율적인 작업을 위해서 쇠막대기를 아래에서 위로 겹쳐 놓고,
 * 에지러르 위에서 수직으로 발사형 쇠막대기들을 자른다. 쇠막대기와 레이저의 배치는 다음 조건을 만족 한다.
 * ...
 */
class Stick {
    public int solution (String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if (str.charAt(i - 1) == '(') answer += stack.size();
                else answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Stick T = new Stick();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
