package String;

import java.util.Scanner;

/**
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫마나 추출하여 그 순서대로 자연수를 만든다.
 * 만약 "tge0a1h205er" 에서 숫자만 추출하면 0, 1, 2, 0, 5 이고 이것을 자연수로 만들면 1205가 된다.
 * 추출하여 만들어지는 자연수는 100,000,000 을넘지 않는다.
 */
class OutputOnlyNumber {
    public int solution(String s) {
        int answer = 0;
        for (char x : s.toCharArray()) {
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }

        return answer;
    }

    // 숫자만 출력
    public int solution2(String s) {
        String answer = "";
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        OutputOnlyNumber T = new OutputOnlyNumber();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
